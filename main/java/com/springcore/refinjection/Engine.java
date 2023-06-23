package com.springcore.refinjection;

public class Engine {
	private int stroke;
	private double cc;
	private String volume;
	public Engine() {
		super();
		
	}
	public int getStroke() {
		return stroke;
	}
	public void setStroke(int stroke) {
		this.stroke = stroke;
	}
	public double getCc() {
		return cc;
	}
	public void setCc(double cc) {
		this.cc = cc;
	}
	public String getVolume() {
		return volume;
	}
	public void setVolume(String volume) {
		this.volume = volume;
	}
	@Override
	public String toString() {
		return "Engine [stroke=" + stroke + ", cc=" + cc + ", volume=" + volume + "]";
	}
	
	

}
