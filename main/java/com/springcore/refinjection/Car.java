package com.springcore.refinjection;

public class Car {
	private String color;
	private double price;
	private String drive;
	private Engine engine;
	
	public Car() {
		super();
	
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDrive() {
		return drive;
	}
	public void setDrive(String drive) {
		this.drive = drive;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Car [color=" + color + ", price=" + price + " lakhs, drive=" + drive + ", engine=" + engine + "]";
	}
	
	

}
