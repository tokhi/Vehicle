package com.tok;

public class RunCar {

	private static Vehicle vehicle;

	public static void main(String[] args) {
		vehicle = new Vehicle(new Car("Benz"){
			// we have to override the carStatus() method, because Car is an abstract class and we need to implement abstract methods defined in the car
			@Override
			String carStatus() {
				return name+" says: I'm a brand new Benz";
				
			}
			
		});
		
		System.out.println("******************************");
		
		vehicle = new Vehicle(new Car("Mitsubishi"){

			@Override
			String carStatus() {
				 return name+ " says: I'm a brand new Mitsubishi";
			}
			
		});
		
		System.out.println("********************************");
		
		vehicle = new Vehicle(new Toyota("Toyota2.0"){
			// here we don't have to override because we passed the subclass Toyota as the parameter not directly the abstract method
			// we can also skip overriding the carStatus() method here.
			public String carStatus(){
				return name+" says: I'm the lates version";
			}
		});
		
		System.out.println("*********************************");
		// here we only passed the existing Toyota which is the subclass of Car model to the vehicle class
		vehicle = new Vehicle(new Toyota("Toyota"));
	}

}
