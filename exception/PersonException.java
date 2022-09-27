package com.uttara.exception;

class DanceFailureException extends Exception {
	public DanceFailureException(String str) {
		super(str);
	}
}

public class PersonException 
{
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public static void dance(int age) throws DanceFailureException {
		if(age > 50)
			System.out.println("salsa");
		else
			throw new DanceFailureException("For salsa dance age should be greater than 50");
	}
	
	public static void main(String[] args)
	{
		PersonException pe = new PersonException();
		try {
			
			pe.setAge(5);
			pe.dance(pe.getAge());
		}catch(DanceFailureException e)
		{
			System.out.println("Age is "+pe.getAge()+","+e.getMessage());
			e.printStackTrace(); // it print the stack trace
		}
		 
	}
}