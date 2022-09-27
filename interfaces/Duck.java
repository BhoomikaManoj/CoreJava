package com.uttara.interfaces;

public class Duck {
	int size;
	static int count;  // here we have to make variable as static ..(single copy variable)
	public Duck(int size) {
		super();
		this.size = size;
		count++;
	}
		
	public void swim()
	{
		if(size == 5)
			System.out.println("Duck is swiming fastly");
		else if(size == 10)
				System.out.println("Duck is swiming slowly");
		else if(size == 15)
			System.out.println("Duck is swiming very slowly");
		else
			System.out.println("Duck size should be correct..");
	}
}
class TestDuck
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck d1 = new Duck(5);	// chota duck
		d1.swim();
		System.out.println("Number of Duck ="+Duck.count);
		Duck d2=new Duck(10);           // for bada duck
		d2.swim();
		System.out.println("Number of Duck ="+Duck.count);
		Duck d3=new Duck(15);            // for biggest duck
		d3.swim();
		System.out.println("Number of Duck ="+Duck.count);
		Duck d4=new Duck(60);              // gives error
		d4.swim();
		System.out.println("Number of Duck ="+Duck.count);
	}
}
