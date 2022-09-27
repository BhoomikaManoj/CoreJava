// we cannot create the object of Device.
// we inherit subclasses from abstract class and create objects of the subclass.
//A subclass must override all abstract methods of an abstract class.

abstract class Device
{
	Device()
	{
		System.out.println("No-argument Constructor");
	}
	public void doSomething()
	{
		System.out.println("make call");
	}
}

class Phone extends Device
{
	public void call(String number)
	{
		if(number.length() < 10 || number.length() >= 11)
			System.out.println("Invalid number");
		else
			System.out.println("phone calling..."+number);
	}
}

class MobilePhone extends Phone
{
	public void call(String number)
	{
		if(number.length() < 10 || number.length() >= 11)
			System.out.println("Invalid number");
		else
			System.out.println("Mobile Phone calling..."+number);
	}
}

class Person
{
	String name;
	public void use(Device d)
	{
		d.doSomething();
		Phone p = (Phone) d;
		p.call("9876543210");

	}
}
class TestDevice
{
	public static void main(String[] args)
	{
		Person p = new Person();
		p.name = "abc";
		Phone p1 = new Phone();
		p.use(p1);
		MobilePhone mp = new MobilePhone();
		p.use(mp);

	}
}