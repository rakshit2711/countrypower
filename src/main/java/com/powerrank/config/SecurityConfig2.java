package com.powerrank.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
//
//@EnableWebSecurity
public class SecurityConfig2
extends WebSecurityConfigurerAdapter {
	
//	
//	
//	@Autowired
//	DataSource dataSource;
//	
//	@Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		auth.jdbcAuthentication().dataSource(dataSource);
//	}
//	
//	
//	@Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		auth.inMemoryAuthentication().withUser("rak").password("rak").roles("ADMIN")
//		.and().withUser("fff").password("fff").roles("USER");
//	}
//	
//	@Bean
//	public PasswordEncoder getpassswordEncoder() {
//		return NoOpPasswordEncoder.getInstance();
//	}
//	
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		http.authorizeRequests().
//		antMatchers("/*/countrypower","/*/country").hasRole("ADMIN").
//		antMatchers("/*/country").hasRole("USER").
//		and().formLogin();
//	}
}
