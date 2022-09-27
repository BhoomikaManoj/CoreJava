class Item
{
	String name;
	double price;

	Item(String name,double price)
	{
		this.name = name;
		this.price = price;
	}
}

class Pen extends Item
{
	Pen(String name,double price)
	{
		super(name,price);
	}
}

class NoteBook extends Item
{
	NoteBook(String name,double price)
	{
		super(name,price);
	}
}

class Bag
{
	String name;
	Item[] items;
	int count;

	public Bag(String name, int size)
	{
		this.name = name;
		items = new Item[size];
	}

	public void addItem(Item it)
	{
		items[count] = it;
		count++;
	}

	public boolean searchItem(String n)
	{
		boolean b=false;
		for(Item h:items)
		{
			if(h.name.equals(n))
			{
				b=true;
				break;
			}
			else
				b=false;
		}
		if(b)
			return true;
		else
			return false;
	}

	public double getItemPrice(String n)
	{
		double hold=0.0;
		for(Item h:items)
		{
			if(h.name.equals(n))
				hold = h.price;
		}
		return hold;
	}

	public double getTotal()
	{
		double sum=0.0;
		for(Item h:items)
		{
			sum=sum+h.price;
		}
		return sum;
	}

	public Item getItem(int pos)
	{
		return items[pos];
	}
}

class TestBag
{
	public static void main(String[] args)
	{
		Bag b=new Bag("WildCraft",4);

		Item item1=new Pen("cello",10.5);
	    Item item2=new Pen("WritoMeter",20.5);
	    Item item3=new NoteBook("classic",30);
	    Item item4=new NoteBook("classmate",96.8);

	    b.addItem(item1);
	    b.addItem(item2);
	    b.addItem(item3);
	    b.addItem(item4);

	    boolean v=b.searchItem("cello");

	    System.out.println("----> "+v);

	    double itemprice=b.getItemPrice("classmate");
	  	System.out.println("item price is "+itemprice);

	  	double tot=b.getTotal();
	  	System.out.println("Total price is "+tot);

	  	Item i=b.getItem(2);
	  	System.out.println("your Item is "+i.toString());
	}
}

