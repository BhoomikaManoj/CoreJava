class Item
{
	double price;
	String name;
	int serialNo;

	public Item(String name)
	{
		this.name = name;
		System.out.println(this.name);
	}

	public Item(String name,double price)
	{
		this.name = name;
		this.serialNo = (int)(Math.random()*(1000-1)+1);
		this.price = price;
		System.out.println("Name = "+this.name+",Price = "+this.price+",Serial Number = "+this.serialNo);
	}
}
class TestItem
{
	public static void main(String[] args)
	{
		Item i1 = new Item("xyz");
		Item i = new Item("abc",1223.3);
	}
}
