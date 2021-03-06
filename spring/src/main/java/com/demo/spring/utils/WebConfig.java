package com.demo.spring.utils;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author zhang
 * @version 1.0
 * @TODO 跨域配置
 * @date 2021/12/7 星期二 16:45
 */

@Configuration
public class WebConfig implements WebMvcConfigurer {
    /*
     * 全局配置跨域请求
     * @param registry
     *
     */

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:8080", "null")
                .allowedMethods("GET", "HEAD", "POST", "PUT", "DELETE", "OPTIONS")
                .maxAge(3600)
                .allowCredentials(true)
                .allowedHeaders("*");
    }
}