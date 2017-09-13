package com.gistmap.filter;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.gistmap.comm.Const;


public class AuthorizeFilter implements Filter {
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		//ServletContext context = filterConfig.getServletContext();  
        //ApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext(context);
	}
	
	private List<String> whiteList = Arrays.asList("/static", "/login", "/favicon.ico", "/img");
	
	private boolean containsWhite(String uri) {
		for (String bkUri : whiteList) {
			if (uri.contains(bkUri.toLowerCase())) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest)request;
		HttpServletResponse resp = (HttpServletResponse) response;
		String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort();
		req.setAttribute("basePath", basePath);
		String path = req.getContextPath();
		String uri = req.getRequestURI();
		String loginUrl = basePath + path + "/login";
		if (!containsWhite(uri)) {
			if (req.getSession().getAttribute(Const.LOGIN_SESSION_KEY) == null) {
				resp.sendRedirect(loginUrl);
			} else {
				chain.doFilter(request, response);
			}
		} else {
			chain.doFilter(request, response);
		}
	}
	
	@Override
	public void destroy() {
		
	}

}
