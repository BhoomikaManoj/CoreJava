public class Person
{
	String name;
	int age;
	static int count = 0;
	public Person()
	{
			count++;
	}

	public void eat()
	{
		if(age < 0 || age > 150)
			System.out.println("Invalid Age Number");
		else
		{
			if(age < 40)
				System.out.println(" and eat less");
			else
				System.out.println(" and eat more");
		}
	}
	public void sleep()
	{
		if(age < 0 || age > 150)
			System.out.println("Invalid Age Number");
		else
		{
			if(age < 40)
				System.out.print(name + " is sleep more");
			else
				System.out.print(name + " is sleep less");
		}
	}
	public static void main(String[] args)
	{
		Person p1 = null;
		//p1.eat();
		for(int i = 0; i < 10; i++)
		{
			p1 = new Person();
		}
		System.out.println(p1.count);

		/* Person p1 = new Person();
		p1.name = "abc";
		p1.age = 31;
		p1.sleep();
		p1.eat();
		p1.name = "abc";
		p1.age = 41;
		p1.sleep();
		p1.eat();
		p1.age = -21;
		p1.sleep(); */
	}
}