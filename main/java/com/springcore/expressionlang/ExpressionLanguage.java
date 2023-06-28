package com.springcore.expressionlang;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ExpressionLanguage {
	//Using expression inside @value
	@Value("#{19+123}")
	int x;
	//Assigning static methods
	@Value("#{T(java.lang.Math).sqrt(16)}")
	int sqrt;
	
	//Assigning static variable
	@Value("#{T(java.lang.Math).PI}")
	double pi;

	//Assigning non static method
	@Value("#{new String('Shivakumar')}")
	String nameString;
	
	//Assigning boolean
	@Value("#{8>3}")
	boolean isActive;

	@Override
	public String toString() {
		return "ExpressionLanguage [x=" + x + ", sqrt=" + sqrt + ", pi=" + pi + ", nameString=" + nameString
				+ ", isActive=" + isActive + "]";
	}
	
	
	
}
