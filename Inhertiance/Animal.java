class Animal
{
	String name;
	public void eat()
	{
		System.out.println("Animal Eating...");
	}

	public void dance()
	{
		System.out.println("Animal Dancing");
	}

	public void sleep()
	{
		System.out.println("Animal is sleeping");
	}
}

class Hippo extends Animal
{
	public void smoke()
	{
		System.out.println("Hippo smoke");
	}
}

class Croc extends Animal
{
	public void swim()
	{
		System.out.println("Croc is swimming");
	}
}

class Vet
{
	public void treat(Animal a)
	{
		a.eat();
		a.dance();
		a.sleep();
		if(a instanceof Hippo)
		{
			Hippo h = (Hippo) a;
			h.smoke();
		}
		if(a instanceof Croc)
		{
			Croc c = (Croc) a;
			c.swim();
		}
	}
}
class TestAnimal
{
	public static void main(String[] args)
	{
		Animal a = new Animal();
		a.name = "Gunda";
		Hippo h = new Hippo();
		Croc c = new Croc();
		Vet v = new Vet();
		v.treat(a);
		v.treat(h);
		v.treat(c);
	}
}