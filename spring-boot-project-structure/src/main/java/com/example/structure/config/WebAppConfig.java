package com.example.structure.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * web 配置
 *
 * @author yunan
 */
@Configuration
public class WebAppConfig implements WebMvcConfigurer {

  @Override
  public void addCorsMappings(CorsRegistry registry) {
    registry
        .addMapping("/**")
        .allowedOrigins("*") // 这里替换成对应的域名
        .allowCredentials(true)
        .allowedHeaders("*")  // 这里是请求头
        .allowedMethods("*"); // 这里是方法
  }
}
