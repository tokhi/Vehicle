package com.tok;

public class Toyota extends Car{

	public Toyota(String name) {
		// super points to the super class constructor (car)
		super(name);
	}

	@Override
	String carStatus() {
		return name+" says: I'm a low model toyta!";
		
	}

}
