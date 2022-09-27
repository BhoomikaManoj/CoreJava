package com.uttara.interfaces;

public interface Thing {

	public void doSomething();
}

class Tool implements Thing
{
	@Override
	public void doSomething() {
		System.out.println("Thing doing something");
	}
}
class Spanner extends Tool
{
	@Override
	public void doSomething() {
		System.out.println("Spanner doing something");
	}
}
class TubeLight implements Thing
{
	@Override
	public void doSomething()
	{
		System.out.println("TubeLight doing something");
	}
}

class Vehicle implements Thing
{
	String name;
	
	public Vehicle(String name) {
		super();                     
		this.name = name;
	}
	
	@Override
	public void doSomething()
	{
		System.out.println(name+" Car is driven");
	}
}

class Person12 {
    void testThing(Thing t)     // This is Polymorphic method..
    {
    	System.out.println("person is testing ");
    	t.doSomething(); // we can get to know here..which implementation is picked..
    	
    } 
}

class TestThing
{
	public static void main(String[] args)
	{
		Thing t=new Spanner();  // Interface parent reference
		Tool t2=new Spanner();  // Class parent reference
		Spanner s=new Spanner();  // own class refrence
		Thing t1 =  new TubeLight();
		t1.doSomething();
		t.doSomething();  // spanner's implementation is picked here
		t2.doSomething(); // spanner's implementation is picked here
		s.doSomething();  // spanner's implementation is picked here { Run time polymorphism concept}


		Thing y=new Vehicle("BMW");
		y.doSomething();

		Person12 p=new Person12();
		p.testThing(s);   // we have pass Any THING here...
		p.testThing(y);

	
	}
}