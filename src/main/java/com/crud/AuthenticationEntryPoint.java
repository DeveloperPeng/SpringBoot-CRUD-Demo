package com.crud;

import java.io.IOException;
import java.io.PrintWriter;

import javax.security.sasl.AuthenticationException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;
import org.springframework.stereotype.Component;

/**
 * The Class AuthenticationEntryPoint.
 */
@Component
public class AuthenticationEntryPoint extends BasicAuthenticationEntryPoint {
	
	/**
	 * Logger Instance.
	 */
	final static Logger LOGGER = LoggerFactory.getLogger(AuthenticationEntryPoint.class);
	
	/** 
	 * @see org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint#commence(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, org.springframework.security.core.AuthenticationException)
	 */
	// @Override
	public void commence(HttpServletRequest request,
			HttpServletResponse response, AuthenticationException authEx)
			throws IOException, ServletException {
		LOGGER.info("In AuthenticationEntryPoint - commence method");
		response.addHeader("LoginUser", "Basic " + getRealmName());
		response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
		PrintWriter writer = response.getWriter();
		writer.println("HTTP Status 401 - " + authEx.getMessage());
	}

	/** 
	 * @see org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint#afterPropertiesSet()
	 */
	@Override
	public void afterPropertiesSet() throws Exception {
		LOGGER.info("In AuthenticationEntryPoint - afterPropertiesSet method");
		setRealmName("Spring Boot");
		super.afterPropertiesSet();
	}

}