package com.cts.spring.lazy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

	@Lazy(value=true)
	@Bean
	@Scope("prototype")
	public FirstBean firstBean(){
		return new FirstBean();
	}
	@Bean
	public SecondBean secondBean(){
		return new SecondBean();
	}

}
