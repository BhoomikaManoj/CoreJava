package com.uis.testWrapper;

public class Car {

	String name;
	int fuelQty;
	boolean isstarted;

	public void start() {
		if (fuelQty > 0) {
			isstarted = true;
			System.out.println("Car " + name + " has started");

		} else
			System.out.println("No fuel!!!");
	}

	public void drive() {
		if (isstarted) {
			if (fuelQty > 0) {
				System.out.println("Car " + name + " is being driven");
				fuelQty--;
			}
			if (fuelQty == 0)
				stop();
		} else
			System.out.println("Car has to be started");
	}

	public void stop() {
		System.out.println("Car " + name + " has stopped");
	}

	public void reverse() {
		System.out.println("Car " + name + " is taking a reverse");
	}
}
