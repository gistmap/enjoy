package com.gistmap.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @Desc :
 * @User : gistmap
 * @Date : 2017/10/8  12:50
 */
@Configuration
public class CommonInterceptorConfig extends WebMvcConfigurerAdapter {
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new CommonInterceptor()).addPathPatterns("/**");
	}
}
