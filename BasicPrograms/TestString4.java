public class TestString4
{
	public void uniqueCharacter(String str)
	{
		for(int i = 0; i < str.length(); i++)
		{
			int flag = 0;
			for(int j = 0; j < str.length(); j++)
			{
				if(str.charAt(i) == str.charAt(j) && i != j)
				{
					flag = 1;
					break;
				}
			}
			if(flag == 0)
				System.out.println(str.charAt(i));
		}
	}
	public void countCharacter(String str)
	{
		int count = 1;
		for(int i = 0; i < str.length(); i++)
		{
			if(i < str.length()-1 && str.charAt(i)== str.charAt(i + 1))
			{
				count++;
				i++;
			}
			if(count == 1)
				System.out.println(str.charAt(i)+ "1");
			else
			{
				System.out.print(str.charAt(i));
				System.out.println(count);
			}
		}

	}
	public void compressChar(String str)
	{
		int count = 1,j;
		if(str.length() == 0)
			System.out.println("Empty String");
		else
		{
			for(int i = 0; i < str.length();)
			{
				for(j = i+1; j < str.length(); j++)
				{
					if(str.charAt(i) == str.charAt(j))
						count++;
					else
						break;
				}
				System.out.print(str.charAt(i));
				System.out.print(count);
				count = 1;
				i = j;
			}
		}
	}

	public static void main(String[] args)
	{
		TestString4 st = new TestString4();
		st.compressChar("aaaaagggwewweeeee");
	}
}







