package com.uis.testWrapper;

import java.util.Random;

public class ArrayOfStrings {

	public void arrayOfStrings() {

		String[] arr = { "Red", "Black", "white", "Bule", "Yellow" };

		Random random = new Random();

		// random number picked with in the range 0 to arr.length
		int index = random.nextInt(arr.length);

		System.out.println(arr[index]);

	}

	public static void main(String[] args) {
		ArrayOfStrings as = new ArrayOfStrings();
		as.arrayOfStrings();
	}

}
