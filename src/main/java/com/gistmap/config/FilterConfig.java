package com.gistmap.config;

import java.util.ArrayList;
import java.util.List;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.gistmap.filter.AuthorizeFilter;

@Configuration
public class FilterConfig {
	
	/*@Bean
    public FilterRegistrationBean httpBasicFilter() {  
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();  
        AuthorizeFilter httpBasicFilter = new AuthorizeFilter();
        registrationBean.setFilter(httpBasicFilter);
        List<String> urlPatterns = new ArrayList<String>(1);  
        urlPatterns.add("/*");  
        registrationBean.setUrlPatterns(urlPatterns);  
        return registrationBean;  
    }*/
	
}
