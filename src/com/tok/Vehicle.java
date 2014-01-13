package com.tok;

public class Vehicle {

	public Vehicle(Car car) {
		// here we print the car object which directly goes to the car toString method.
		// in java when ever you print an object it prints the content of toString method in that class
		// if the toString is not available in that class then it takes the default toString method from the Object class
		// in java every class is inherited from the Object class by default.
		System.out.println(car);

	}

}
