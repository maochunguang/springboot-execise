package com.mcg.exercise.interceptor;

import com.mcg.exercise.extension.annotation.RepeatSubmit;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Method;

/**
 * @author mao
 * @date 2021/1/16
 * @description 防止表单重复提交
 *
 */
@Component
public abstract class RepeatSubmitInterceptor extends HandlerInterceptorAdapter {
    /**
     * 将字符串渲染到客户端
     *
     * @param response 渲染对象
     * @param string 待渲染的字符串
     */
    public void renderString(HttpServletResponse response, String string) {
        try {
            response.setContentType("application/json");
            response.setCharacterEncoding("utf-8");
            response.getWriter().print(string);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (handler instanceof HandlerMethod) {
            HandlerMethod handlerMethod = (HandlerMethod) handler;
            Method method = handlerMethod.getMethod();
            RepeatSubmit repeatSubmit = method.getAnnotation(RepeatSubmit.class);
            if (repeatSubmit != null) {
                if (this.isRepeatSubmit(request)) {
                    String errorMsg = "不允许重复提交表单";
                    renderString(response, errorMsg);
                    return false;

                }
                return true;
            }
        }

        return false;
    }

    public abstract boolean isRepeatSubmit(HttpServletRequest request);
}
