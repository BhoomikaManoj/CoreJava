package com.uttara.exception;

import java.util.ArrayList;

public class ExceptionEx2 {

	public static void main(String[] args) {
		
		int i = 0;
		
		try {
			System.out.println(args[0]);
			ArrayList list = new ArrayList();
			for (i = 0; i < 999999999; i++) {
				list.add(new Thing());
			}
			
		}
		catch(NullPointerException e) {
			System.out.println("NullPointerException : "+e.getMessage());
			e.printStackTrace();
		}
		catch(ClassCastException e) {
			System.out.println("ClassCastException :"+e.getMessage());
			e.printStackTrace();
		}
		catch(NumberFormatException e) {
			System.out.println("NumberFormatException :"+e.getMessage());
			e.printStackTrace();
		}
		catch(OutOfMemoryError e) {
			System.out.println("OutOfMemoryError :"+e.getMessage());
			e.printStackTrace();
		}
		catch(Throwable e) {
			System.out.println("Throwable :"+e.getMessage());
			e.printStackTrace();
		}
		
	}
}
class Thing
{
	public void example()
	{
		System.out.println("Example class");
	}
}