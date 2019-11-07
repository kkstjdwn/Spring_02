package com.coo.s2;

import org.springframework.stereotype.Component;

@Component
public class Car {
	
	private Engine engine;
	private Wheel wheel;
	
	
	public Car() {
		// TODO Auto-generated constructor stub
	}
	
	public Car(Engine engine, Wheel wheel) {
		this.engine = engine;
		this.wheel = wheel;
	}
	
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public Wheel getWheel() {
		return wheel;
	}
	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}
	
	public void info() {
		System.out.println("엔진 연료\t: "+ this.engine.getFuel());
		System.out.println("바퀴 브랜드\t: "+this.wheel.getBrand());
	}

}
