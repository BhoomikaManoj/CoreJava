package com.uis.testWrapper;

public class isPerfectSquareRoot {
 
	static boolean checkPerfectSquare(double number) {

		double sqrt = Math.sqrt(number);
		
		// floor() method rounds the specified double value downward and returns it. ex: 4.472, Math.floor(sqrt) = 4.0  
		return ((sqrt - Math.floor(sqrt)) == 0);
	}

//main method  
	public static void main(String[] args) {

		double number = 20;
//calling the user defined method  
		if (checkPerfectSquare(number))
			System.out.print("Yes, the given number is perfect square.");
		else
			System.out.print("No, the given number is not perfect square.");
	}
}