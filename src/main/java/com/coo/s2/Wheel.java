package com.coo.s2;

import org.springframework.stereotype.Component;

@Component
public class Wheel {
	
	private String brand;
	private int size;
	
//	public Wheel() {
//	
//	}
	
	public Wheel(String brand, int size) { // 생성자에서 매개변수로 멤버변수의 값을 설정
		this.brand = brand;
		this.size = size;
	}
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
}
