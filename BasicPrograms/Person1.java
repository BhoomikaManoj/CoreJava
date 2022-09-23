public class Person1
{
	String name;
	int age;
	String[] petName = new String[20];
	int count = 0;

	public void dance()
	{
		if(age <= 0)
			System.out.println("set your age");
		else if(age < 25)
			System.out.println("He is dancing chacha");
		else
			System.out.println("He is dancing waltz");
	}

	public void sing()
	{
		String song = "";int n;
		for(int i = 0; i < petName.length; i++)
		{
			n = (int)(20 * Math.random());
			song = song + petName[n];
		}
		System.out.println(petName[n]);
	}
	public void addPetName(String n)
	{
		if(count < petName.length)
			petName[count++] = n;
		else
			System.out.println("more than 20 times");
	}

	public boolean searchPetName(String n)
	{
		for(String s : petName)
		{
			if(s.equals(n))
				return true;
		}
		return false;
	}

	public static void main(String[] args)
	{
		Person1 p1 = new Person1();
		p1.addPetName("abc");
		p1.age = 26;
		p1.dance();
		p1.name = "Earth";
		System.out.println("Name = " + p1.name);
		System.out.println("Age = "+ p1.age);
		System.out.println("PetName = " + p1.petName[0]);
	}
}