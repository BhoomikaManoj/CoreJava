package com.uis.testWrapper;

public class Add {
	public long sum(int a, int b) {
		return ((long)a+b);
	}
	
	public double sum(double a, double b) {
		return (a+b);
	}
	
	public static Complex sum(Complex c1, Complex c2)
	{
		int r = c1.getReal() + c2.getReal();
		int i = c1.getImage() + c2.getImage();
		
		Complex c = new Complex(r,i);
		return c;
		
	}
}

class Complex
{
	private int real;
	private int image;
	public Complex(int r,int i)
	{
		this.real = r;
		this.image = i;
	}
	public int getReal() {
		return real;
	}
	public void setReal(int real) {
		this.real = real;
	}
	public int getImage() {
		return image;
	}
	public void setImage(int image) {
		this.image = image;
	}
	
}

class TestAdd {
	public static void main(String[] args)
	{
		Add a = new Add();
		System.out.println("Sum of two integer numbers "+ a.sum(10,20));
		System.out.println("Sum of two double numbers "+ a.sum(10.09,20.1));
		
		Complex c1 = new Complex(10,20);
		Complex c2 = new Complex(20,30);
		Complex c3 = a.sum(c1, c2);
		System.out.println("Sum of two double numbers "+c3.getReal()+"+"+c3.getImage()+"i");
		
	}
}