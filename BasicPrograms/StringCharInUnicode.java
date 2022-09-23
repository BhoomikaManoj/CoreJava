public class StringCharInUnicode
{
	public void stringCharInUnicode(String str)
	{
		char[] c = str.toCharArray();
		for(int i = 0; i < str.length(); i++)
			System.out.println((int)c[i]+".");
	}
	public static void main(String[] args)
	{
		StringCharInUnicode ss = new StringCharInUnicode();
		ss.stringCharInUnicode("abd");
	}
}