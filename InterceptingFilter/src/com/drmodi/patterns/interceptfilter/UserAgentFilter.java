package com.drmodi.patterns.interceptfilter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import javax.servlet.http.HttpServletRequest;


//@WebFilter("/userAgentFilter")//not to particular request but all the request need to be filter
@WebFilter("/*")
public class UserAgentFilter implements Filter {

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		String header = ((HttpServletRequest) request).getHeader("User-Agent");
		
		//Check if user agent contain the Chrome
		if(header.contains("Chrome")) {
			chain.doFilter(request, response);
		}else {
			RequestDispatcher dispatcher = request.getRequestDispatcher("badBrowser.jsp");
			dispatcher.forward(request, response);
		}
			
		
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
