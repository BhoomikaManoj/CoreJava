public class Pen
{
	String name;
	int inkQty;
	String color;

	public void write(String data)
	{
		if(inkQty > 0)
		{
			System.out.println("pen "+name+" writing "+data);
			inkQty--;
		}
		else
			System.out.println("Frist fill the ink and then write");
	}
	public void refill(int qty)
	{
		inkQty = inkQty + qty;
	}
}