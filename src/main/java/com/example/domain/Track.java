package com.example.domain;

public class Track {

	private Integer tire;
	private Integer speed;
	public Integer getTire() {
		return tire;
	}
	public void setTire(Integer tire) {
		this.tire = tire;
	}
	public Integer getSpeed() {
		return speed;
	}
	public void setSpeed(Integer speed) {
		this.speed = speed;
	}
	@Override
	public String toString() {
		return "Track [tire=" + tire + ", speed=" + speed + "]";
	}
	
	
}
