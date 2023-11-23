package com.example.upload.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//보안
@Configuration //환경설정하는 클래스로 사용하라는 어노테이션
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**")
                .addResourceLocations("file:/src/main/resources/static/upload/")
                .addResourceLocations("file:///D:/temp/");
    }
}




