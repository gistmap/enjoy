package com.gistmap.config;

import java.util.ArrayList;
import java.util.List;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.gistmap.filter.AuthorizeFilter;


/**
 * @desc : 异步任务线程池配置
 * @author : gistmap
 * @date : 2017/9/14  20:16
 */
@Configuration
public class FilterConfig {
	
//	@Bean
//    public FilterRegistrationBean httpBasicFilter() {
//        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
//        AuthorizeFilter httpBasicFilter = new AuthorizeFilter();
//        registrationBean.setFilter(httpBasicFilter);
//        List<String> urlPatterns = new ArrayList<>(1);
//        urlPatterns.add("/*");
//        registrationBean.setUrlPatterns(urlPatterns);
//        return registrationBean;
//    }
	
}
