package com.gistmap.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @desc :
 * @author : gistmap
 * @date : 2017/10/8  12:50
 */
@Configuration
public class CommonInterceptorConfig extends WebMvcConfigurerAdapter {
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new CommonInterceptor()).addPathPatterns("/**");
	}
}
