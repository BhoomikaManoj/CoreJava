public class Dog
{
	String name;
	private int size;
	public void bark(int s)
	{
		if(s <= 0 )
			System.out.println("Enter Invalid Number or Enter Current Whole numbers > 0");
		else if(size > 10)
			System.out.println("My name is " + name + ". bow bow");
		else
			System.out.println("My name is " + name + ". Meows");
	}

	public void setSize(int s)
	{
		size = s;
	}
	public int getSize()
	{
		return size;
	}
	public static void main(String[] args)
	{
		Dog d = new Dog();
		d.name = "abc";
		d.bark(d.getSize());
		d.setSize(20);
		d.bark(d.getSize());
		d.setSize(-20);
		d.bark(d.getSize());
		d.setSize(10);
		d.bark(d.getSize());
	}
}