package com.crud;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.AuthenticationEntryPoint;


/**
 * The Class SpringSecurityConfig.
 */
@Configuration
@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {
	
	/**
	 * Logger Instance.
	 */
	final static Logger LOGGER = LoggerFactory.getLogger(SpringSecurityConfig.class);
	
	/** The auth entry point. */
	@Autowired
	private AuthenticationEntryPoint authEntryPoint;

	/** 
	 * @see org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter#configure(org.springframework.security.config.annotation.web.builders.HttpSecurity)
	 */
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		LOGGER.info("In SpringSecurityConfig - configure method");
		http.csrf().disable().authorizeRequests().anyRequest().authenticated()
				.and().httpBasic().authenticationEntryPoint(authEntryPoint);
	}

	/**
	 * Configure global.
	 *
	 * @param auth the auth
	 * @throws Exception the exception
	 */
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth)
			throws Exception {
		LOGGER.info("In SpringSecurityConfig - configureGlobal method");
		auth.inMemoryAuthentication().withUser("saras").password("saras")
				.roles("USER");
	}

}