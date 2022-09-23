public class TestPen
{
	public static void main(String[] args)
	{
		Pen p1 = new Pen();
		System.out.println("p1.name = " + p1.name + ", intQty = " + p1.inkQty + ", color = " + p1.color );
		p1.name = "Earth";
		p1.inkQty = 2;
		p1.color = "red";
		System.out.println("p1.name = " + p1.name + ", intQty = " + p1.inkQty + ", color = " + p1.color );
		p1.write("hiiiii");
		p1.refill(5);
		System.out.println("p1.name = " + p1.name + ", intQty = " + p1.inkQty + ", color = " + p1.color );

		Pen p2 = new Pen();
		p2.name = "MB";
		p2.color = "Blue";
		p2.inkQty = 3;
		System.out.println("p2.name = " + p2.name + ", intQty = " + p2.inkQty + ", color = " + p2.color );
	}
}