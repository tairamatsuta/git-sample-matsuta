package com.example.domain;

public class Car {

	private Integer speed;
	private String bodyColor;
	
	public Integer getSpeed() {
		return speed;
	}
	public void setSpeed(Integer speed) {
		this.speed = speed;
	}
	public String getBodyColor() {
		return bodyColor;
	}
	public void setBodyColor(String bodyColor) {
		this.bodyColor = bodyColor;
	}
	
	@Override
	public String toString() {
		return "Car [speed=" + speed + ", bodyColor=" + bodyColor + "]";
	}
	
}
