package com.example.mockman.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

@Component
public class RequestInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String uri = request.getRequestURI();
        String header = request.getHeader("test");
        return true;
    }
}

// USER CREATE
// USER
// Controller Create USER, => API KEY
// Project => /getListEmployee => uri => {} => DB

// API-KEY && URI  => DB -> JSON