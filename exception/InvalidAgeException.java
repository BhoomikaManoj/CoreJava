package com.uttara.exception;

public class InvalidAgeException extends Exception {

	public InvalidAgeException(String str) {
		super(str);
	}
}

class Person1{
	public static void validate(int age) throws InvalidAgeException {
		if(age <18)
			throw new InvalidAgeException("Invalid age");
		else
			System.out.println("Welcome to vote");
	}
	public static void main(String[] args) {
		try
		{
			validate(9);
		}
		catch(InvalidAgeException e)
		{
			System.out.println("Exception Occured : "+e.getMessage());
		}

	}

}
