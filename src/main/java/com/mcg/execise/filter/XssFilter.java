package com.mcg.execise.filter;

import com.mcg.execise.extension.XssHttpServletRequestWrapper;
import org.apache.commons.lang3.StringUtils;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author mao
 * Date：2021/1/16
 * Description：
 */
public class XssFilter implements Filter {
    public List<String> excluedList = new ArrayList<>();

    public boolean enable = false;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        String tempExcludes = filterConfig.getInitParameter("excludes");
        String tempEnabled = filterConfig.getInitParameter("enabled");
        if (StringUtils.isNotEmpty(tempExcludes)) {
            String[] url = tempExcludes.split(",");
            excluedList.addAll(Arrays.asList(url));
        }
        if (StringUtils.isNotEmpty(tempEnabled)) {
            enable = Boolean.parseBoolean(tempEnabled);
        }
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse resp = (HttpServletResponse) response;
        if (handleExcludeURL(req, resp)) {
            chain.doFilter(request, response);
            return;
        }
        XssHttpServletRequestWrapper xssRequest = new XssHttpServletRequestWrapper((HttpServletRequest) request);
        chain.doFilter(xssRequest, response);

    }

    private boolean handleExcludeURL(HttpServletRequest request, HttpServletResponse response) {
        return false;
    }

    @Override
    public void destroy() {

    }
}
