class Man
{
	String name;
	Woman wife;

	public Man(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return name;
	}

	public void marry(Woman w)
	{
		if(wife == null && w != null && w.husband == null)
		{
			System.out.println("Man "+getName()+ " marry a woman with name is "+w.getName()+"");
			wife = w;
			wife.husband = this;
		}
		else
			throw new IllegalArgumentException("He is already married");
	}

	public void eat()
	{
		System.out.println("Man is eating..");
	}

	public void information()
	{
		if(wife != null)
			System.out.println("I am "+getName()+", I am marry with woman name is "+wife.getName());
		else
			System.out.println("My name is "+getName()+" ,not married, I am sitll single");
	}
}
class Woman
{
	String name;
	Man husband;

	public Woman(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return name;
	}

	public void divorce()
	{
		System.out.println("I am "+getName()+" ,take divorce with man "+husband.getName());
		husband.wife = null;
		husband = null;
	}

	public void work()
	{
		System.out.println("Woman is working");
	}

	public void information()
	{
		if(husband != null)
			System.out.println("I am "+getName()+", I am marry with man name is "+husband.getName());
		else
			System.out.println("My name is "+getName()+" ,not married, I am sitll single");
	}
}
class TestManWoman
{
	public static void main(String[] args)
	{
		Man m = new Man("Arbaz");
		Woman w = new Woman("Malaika");
		Woman w1 = new Woman("Rosie");
		m.information();
		m.eat();
		m.marry(w);
		m.information();
		w.information();
		w.work();
		w.divorce();
		w.information();
		m.marry(w);
		m.marry(w1);
	}
}