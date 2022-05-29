package com.mcg.exercise.advice;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.sun.xml.internal.fastinfoset.Encoder;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.net.URLDecoder;

/**
 * @author mao
 * Date：2020/12/27
 * Description：打印日志
 */
@Aspect
@Component
@Slf4j
public class LogAspect {

    @Pointcut("execution(public * com.mcg.exercise.controller.*.*(..))")
    public void controllerLog() {

    }

    /**
     * 打印controller接口日志
     * @param pj aop
     * @return 执行结果
     * @throws Throwable 异常
     */
    @Around("controllerLog()")
    public Object doPrintControllerLog(ProceedingJoinPoint pj) throws Throwable {
        RequestAttributes re = RequestContextHolder.getRequestAttributes();
        ServletRequestAttributes sre = (ServletRequestAttributes) re;
        HttpServletRequest request = sre.getRequest();
        String method = request.getMethod();
        String uri = request.getRequestURI();
        String query = request.getQueryString();
        Object[] args = pj.getArgs();
        String params = "";
        long start = System.currentTimeMillis();
        Object result = pj.proceed();

        long executeTime = System.currentTimeMillis() - start;
        try {
            if (args.length > 0) {
                if (HttpMethod.POST.name().equals(method)) {
                    Object obj = args[0];
                    params = JSON.toJSONString(obj);
                } else if (HttpMethod.GET.name().equals(method)) {
                    params = query;
                }
                if (null != params) {
                    params = URLDecoder.decode(params, Encoder.UTF_8);
                }
            }
            log.info("requestMethod:{}, uri:{},request params:{},response:{}, execute time:{}ms",
                    method, uri, params, JSON.toJSONString(result, SerializerFeature.WriteMapNullValue), executeTime);
        } catch (Exception e) {
            log.error("doPrintControllerLog exception ", e);
        }
        return result;
    }
}
