public class PersonSetterGetter
{
	private String name;
	private int age;

	public Person()
	{
		System.out.println("empty constructor");
	}
	public Person(String n)
	{
		name = n;
	}

	public void setName(String n)
	{
		if(n == null || n.trim().equals(""))
			System.out.println("It's a empty.enter your name");
		else
			name = n;
	}

	public void setAge(int a)
	{
		if(a < 0 || a >150)
			System.out.println("enter correct age");
		else
			age = a;

	}

	public String getName()
	{
		return name;
	}

	public int getAge()
	{
		return age;
	}

	public static void main(String[] args)
	{
		Person p =new Person("abc");
		//p.setName("bhoomi");
		//p.setAge(29);
		System.out.println(p.getName());
		//System.out.println(p.getAge());
	}
}