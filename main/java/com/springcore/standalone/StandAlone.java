package com.springcore.standalone;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class StandAlone {
	private Set<Long> phoneNumber ;
	private List<String> addressList;
	private Map<Integer, String> courses;
	public Set<Long> getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Set<Long> phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public List<String> getAddressList() {
		return addressList;
	}
	public void setAddressList(List<String> addressList) {
		this.addressList = addressList;
	}
	public Map<Integer, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<Integer, String> courses) {
		this.courses = courses;
	}
	@Override
	public String toString() {
		return "StandAlone [phoneNumber=" + phoneNumber + ", addressList=" + addressList + ", courses=" + courses + "]";
	}
	
	
}
