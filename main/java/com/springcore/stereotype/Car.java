package com.springcore.stereotype;

import java.util.Set;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("carObject")
public class Car {
	@Value("Red")
	private String colorString;
	@Value("10.5")
	private double price;
	//Using springEL to inject collections
	@Value("#{emailId}")
	private Set<String> emailID;
	@Override
	public String toString() {
		System.out.println(emailID);
		return "Car [colorString=" + colorString + ", price=" + price + " Lakhs]";
	}
	
}
