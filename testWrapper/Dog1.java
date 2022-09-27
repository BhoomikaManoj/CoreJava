package com.uis.testWrapper;

public class Dog1 {

	String name;
	private int size;

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public void bark() {
		if (size == 0) {
			System.out.println("You must set the size first.");
		} else {
			if (size > 10)
				System.out.println("Meow");
			if (size <= 10) {
				for (int i = 0; i < 10; i++) {
					System.out.println("bow wow " + name);
				}
			}
		}
	}
}
