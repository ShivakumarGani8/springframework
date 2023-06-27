package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class AnnotationConfigure {
	private String confString;
	
	public void setConfString(String confString) {
		System.out.println("Set AnnotationConfigure bean properties");
		this.confString=confString;
	}
	public String getConfString() {
		return this.confString;
	}
	
	@PostConstruct
	public void start() {
		System.out.println("AnnotationConfigure Bean lifecycle start");
	}
	
	@PreDestroy
	public void end() {
		System.out.println("AnnotationConfigure Bean lifecycle end");
	}
}
