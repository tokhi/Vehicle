package com.tok;

public abstract class Car {
	String name;

	public Car(String name) {
		this.name = name;
	}

	abstract String carStatus();
	
	public String toString(){
		return carStatus();
	}
}
