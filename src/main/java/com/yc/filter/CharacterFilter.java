package com.yc.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * Filter的执行顺序：优先执行web.xml中配置的过滤器在执行注解方案配置的过滤器
 * 如果都是web.xml配置的，那么执行顺序根据web.xml文件中的配置顺序来
 * 如果都是注解，则根据过滤器的名字（类名）字母的先后顺序
 */

/*@WebFilter(
		value="/",
		initParams={@WebInitParam(name="encoding",value="utf-8")}
		)*/
@WebFilter("/*")
public class CharacterFilter implements Filter {
	private String encoding="utf-8";
	
	public void destroy() {
		
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request; 
		HttpServletResponse resp = (HttpServletResponse) response; 
		
		req.setCharacterEncoding(encoding);
		resp.setCharacterEncoding(encoding);
		
		chain.doFilter(req, resp);
	}

	public void init(FilterConfig config) throws ServletException {
		String temp=config.getInitParameter("encoding");
		if(temp!=null){
			encoding=temp;
		}
	}
}
