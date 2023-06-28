package com.springcore.noxml;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class WithComponent {
	
	@Value("#{new String('This is temp string for NOXML configuration with Component Annotation')}")
	private String tempString;
	@Value("#{24+234}")
	private int num;
	@Value("true")
	private boolean isComponentAnnotation;
	@Override
	public String toString() {
		return "WithComponent [tempString=" + tempString + ", num=" + num + ", isComponentAnnotation="
				+ isComponentAnnotation + "]";
	}
}
