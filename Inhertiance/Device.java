public class Device
{
	private String name;
	public Device()
	{
		System.out.println("Device no-argument constructor");
	}
	public Device(String name)
	{
		//super();
		this.name = name;
		System.out.println("Device parameterised constructor");
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void doSomething()
	{
		System.out.println("shouting its name "+getName());
	}

}
class TestDevice
{
	public static void main(String[] args)
	{
		Device d = new Device("abc");
		d.setName("abc");
		Tv t = new Tv();
		Microwave m = new Microwave();
		Printer p = new Printer();
		Electrician e = new Electrician();

		e.test(d);//picks the device implementation
		e.test(p);//picks the Printer implementation
		e.test(m);//picks the Microwave implementation
		e.test(t);//picks the Tv implementation
		Device d1 = new Tv();//constructor chainig will happens
		d1.doSomething();//picks the tv implementation
	}
}