package javaCoposition;

public class Vehicle {
	
	
	public Car car;
	public Bike bike;
	

	public Vehicle(Car car,Bike bike) {
		super();
		this.car = car;
		this.bike=bike;
	}
	
	public Car getCar() {
		return car;
	}
	
	public Bike getBike() {
		return bike;
	}

}
