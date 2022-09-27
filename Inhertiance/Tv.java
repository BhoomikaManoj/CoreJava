public class Tv extends Device
{
	public Tv()
	{

		System.out.println("TV no-argument constructor");
	}
	public void doSomething()
	{
		System.out.println("watching movie ");
	}
	public void switchChannel()
	{
		System.out.println("tv switching channel");
	}

}
class Printer extends Device
{
	public void doSomething()
	{
		System.out.println("printing ");
	}

}
class Microwave extends Device
{
	public void doSomething()
	{
		System.out.println("cooking ");
	}
}
class Electrician
{
	public void test(Device d)
	{
		d.doSomething();
		if(d instanceof Tv)//checking whether Device is instance of TV
		{
			Tv t=(Tv)d;//downcasting
			t.switchChannel();
		}
	}
}