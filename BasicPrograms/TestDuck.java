public class TestDuck
{
	public static void main(String[] args)
	{
		Duck d1 = new Duck();
		d1.tailSize = 10;
		d1.swim(d1.tailSize);
		Duck d2 = new Duck();
		d2.tailSize = 20;
		d2.swim(d2.tailSize);

		// copy d2 object tailsize to d1 object tailsize
		d1.tailSize = d2.tailSize;
		System.out.println("d1.tailSize = " + d1.tailSize +", d2.tailSize = " + d2.tailSize);

		//re-assign d1 object tailsize
		d1.tailSize = 30;
		System.out.println("d1.tailSize = " + d1.tailSize +", d2.tailSize = " + d2.tailSize);

		//copy d2 object data to d1 object
		d1 = d2;
		System.out.println("after d1 = d2");
		System.out.println("d1.tailSize = " + d1.tailSize +", d2.tailSize = " + d2.tailSize);

		//both the objects are unreachable
		d1 = d2 = null;

		//create new object
		d1 = new Duck(); // only this object is reachable

	}
}