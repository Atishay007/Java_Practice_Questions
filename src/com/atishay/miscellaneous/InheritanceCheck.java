package com.atishay.inheritance;

public class InheritanceCheck {

	public static void main(String[] args) {
		Car car = new Honda(20);
		car.printCar("Honda");
	}
}

// This type of pattern is also used in Template Design Pattern
abstract class Car {
	private String seats;
	private boolean sedan;

	Car(String seats, boolean sedan) {
		this.seats = seats;
		this.sedan = sedan;
	}

	abstract int getMileage();

	public String getSeats() {
		return seats;
	}

	public boolean getSedan() {
		return sedan;
	}

	// Below methods will be called for the Created Object
	public void printCar(String carName) {
		System.out.println(getMileage());
		System.out.println(getSeats());
		System.out.println(getSedan());
	}
}

class Honda extends Car {
	private int mileage;

	public Honda(int mileage) {
		super("4", false);
		this.mileage = mileage;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
}