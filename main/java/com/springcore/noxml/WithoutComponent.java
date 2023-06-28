package com.springcore.noxml;

import org.springframework.beans.factory.annotation.Value;

public class WithoutComponent {
	@Value("This is temp string for NOXML cofiguration without @Component Annotation")
	String tempString;
	@Value("false")
	boolean isComponentAnnotation;
	@Override
	public String toString() {
		return "WithoutComponent [tempString=" + tempString + ", isComponentAnnotation=" + isComponentAnnotation + "]";
	}
	
	
}
