package com.springcore.auto.wire;

public class Address {
	private String state;
	private String town;
	private int pincode;
	
	public Address(String state, String town, int pincode) {
		super();
		this.state = state;
		this.town = town;
		this.pincode = pincode;
		System.out.println("Address constructor is called");
	}

	@Override
	public String toString() {
		return "Address [state=" + state + ", town=" + town + ", pincode=" + pincode + "]";
	}

}
