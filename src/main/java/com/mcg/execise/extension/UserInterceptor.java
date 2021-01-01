package com.mcg.execise.extension;

import com.google.common.collect.Sets;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Set;

/**
 * @author mao
 * Date：2021/1/1
 * Description：
 */
@Slf4j
public class UserInterceptor implements HandlerInterceptor {
    public static final String NO_USER_LIMIT_PATH = "/hello";

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String userName = request.getParameter("userName");
        String[] paths = NO_USER_LIMIT_PATH.split(",");
        Set<String> pathSet = Sets.newHashSet(paths);
        if (pathSet.contains(request.getContextPath())) {
            return true;
        }
        if (StringUtils.isNotBlank(userName)) {
            return true;
        }
        log.warn("UserInterceptor failed, path:{}", request.getContextPath());
        return false;
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        log.info("UserInterceptor completion, path:{}", request.getContextPath());
    }
}
