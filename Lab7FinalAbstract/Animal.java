abstract class Animal
{
	String name;
	public abstract void eat();

	Animal()
	{
		System.out.println("Animal No-argument Constructor");
	}
	Animal(String name)
	{
		this.name = name;
		System.out.println("Animal parameterized constructor");
	}

	public void sleep()
	{
		System.out.println("Closes the eyes and sleep");
	}
}
class Croc extends Animal
{
	Croc()
	{
		System.out.println("Croc No-argument Constructor");
	}
	Croc(String name)
	{
		super(name);
		System.out.println("Croc parameterized constructor");
	}
	public void eat()
	{
		System.out.println("Croc is eating..");
	}
	public void swim()
	{
		System.out.println("Cror is in swimming");
	}
}
class TestAnimal
{
	public static void main(String[] args)
	{
		Croc c = new Croc("abc");
		c.eat();
		c.sleep();
		Animal c1 = new Croc();
		c1.sleep();

	}
}