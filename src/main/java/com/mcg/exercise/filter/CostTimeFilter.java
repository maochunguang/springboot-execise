package com.mcg.exercise.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author mao
 * Date：2021/1/1
 * Description：
 */
public class CostTimeFilter implements Filter {
    private String url;
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.url = filterConfig.getInitParameter("URL");

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        long start = System.currentTimeMillis();
        System.out.println(start + " Filter doFilter before...");
        chain.doFilter(request, response);
        long end = System.currentTimeMillis();
        System.out.println(end + "Filter doFilter after...");
    }

    @Override
    public void destroy() {
        System.out.println("Filter destroy...");
    }
}
