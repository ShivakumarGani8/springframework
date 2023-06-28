package com.springcore.noxml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages = "com.springcore.noxml")
@Configuration
public class JavaConfig {
	@Bean
	public WithoutComponent getObject() {
		return new WithoutComponent();
	}
}
