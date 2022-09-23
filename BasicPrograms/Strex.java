public class Strex
{
	public void reverse1(String str)
	{

		for(int i = str.length()-1; i >= 0; i--)
		{

			System.out.print(str.charAt(i));
		}
	}

	public static void main(String[] args)
	{
		Strex st = new Strex();
		st.reverse1("Manoj");
	}
}