package com.uttara.exception;

public class ExceptionEx1 {

	public static void main(String[] args) {
		try {
			if(args.length != 0)
			{
				for(String s : args )
					System.out.println(s);
			}
			System.out.println(args[0]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("printing Stack Trace-----"+e.getMessage());
			e.printStackTrace();
		}
		catch(RuntimeException e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
