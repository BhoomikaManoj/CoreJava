public class TestMath
{
	public static void main(String[] args)
	{
		double x = 150;
		double res = Math.sqrt(x);
		System.out.println("sqrt of "+x+" = "+res);
		res = Math.cbrt(x);
		System.out.println("cbrt of "+x+" = "+res);
		x = 5.6;
		res = Math.round(x);
		System.out.println("round of "+x+" = "+res);
		res = Math.floor(x);
		System.out.println("floor of "+x+" = "+res);
		x = 6.4;
		res = Math.ceil(x);
		System.out.println("ceil of "+x+" = "+res);
		x = Math.random();
		//random() returns double random value between 0 - 1 as a decimal
		System.out.println("x = "+x);

		int y;
		for(int i = 0 ; i < 10 ; i++)
		{
			y = (int) (Math.random() * 100); // 0 - 1
			System.out.println("random "+y);
		}

	}
}