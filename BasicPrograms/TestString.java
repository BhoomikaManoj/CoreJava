public class TestString
{
	public static void main(String[] args)
	{
		String str = "abcedf";
		System.out.println("length of the String is " + str.length());
		System.out.println(str);

		System.out.println("convert char array");
		char[] ca1 = new char[str.length()];
		for(int i = 0; i < str.length(); i++)
		{
			ca1[i] = str.charAt(i);
			System.out.println(ca1[i]);
		}
      	System.out.println("Convert Uppercase a string is " + str.toUpperCase());
      	System.out.println("Convert Lowercase a string is " + str.toLowerCase());

      	String str1 = "Bhoomika";
      	String str2 = "bhoomi";
      	if(str1.equals(str2))
      		System.out.println(str1 + " and " + str2 + " both Strings are Equal");
      	else
      		System.out.println(str1 + " and " + str2 + " both Strings are not Equal");
      	if(str.equals(str1))
			System.out.println(str + " and " + str1 + " both Strings are Equal");
		else
      		System.out.println(str + " and " + str1 + " both Strings are not Equal");

		int compare = str1.compareTo(str2);
		if(compare == 0)
			System.out.println("comparing both the strings are equal");
		else if(compare < 0)
			System.out.println(str1 +" smaller than " +str2);
		else
			System.out.println(str1 +" greater than " +str2);

		// am converting lowercase because indexOf() is case sentive.
		System.out.println("find the string occurence of index is " + str1.toLowerCase().indexOf(str2.toLowerCase()));
	}
}
class TestString1
{
	public void isPalindrome(String s)
	{
		String sl = s.toLowerCase();
		char[] ca = sl.toCharArray();
		for(int i = 0; i < ca.length/2; i++)
		{
			//xor truth table is TT =F , TF = T, FT = T, FF = F
			ca[i] = (char)(ca[i] ^ ca[ca.length-i-1]);
			ca[ca.length-i-1] = (char)(ca[i] ^ ca[ca.length-i-1]); // T,F= F
			ca[i] = (char)(ca[i] ^ ca[ca.length-i-1]);
		}
		s = new String(ca);
		if(sl.equals(s))
			System.out.println("Without bultin function to finding Given String is palindrome");
		else
			System.out.println("Without bultin function to finding Given String is  not palindrome");

		StringBuffer sb = new StringBuffer(sl);
		sb.reverse();
		String data = sb.toString();
		if(sl.equals(data))
			System.out.println("using bultin function reverse string to finding Given String is palindrome");
		else
			System.out.println("using bultin function reverse string to finding Given String is  not palindrome");
	}

	public void swapTwoNum(int a, int b)
	{
		int temp;
		temp = a;
		a = b;
		b = temp;
		System.out.println("Swap two number using temp variable a = " + a + ",b= "+b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("Swap two number without using temp variable a = " + a + ",b= "+b);
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println("Swap two number using xor approach variable a = " + a + ",b= "+b);
	}

	public void reverseEachWord(String s)
	{
		/* String[] words = s.split(" ");
		String reverseWord= "";
		for(String w:words)
		{
			StringBuffer sb = new StringBuffer(w);
			sb.reverse();
			reverseWord += sb.toString();
		}
		System.out.println(reverseWord.trim()); */

		StringBuilder sb1 = new StringBuilder(s);
		sb1.reverse();
		System.out.println(sb1.reverse());
		if(s.equals(sb1.toString()))
			System.out.println("is palindrome");
		else
			System.out.println("is not palindrome");

	}

	public static void main(String[] args)
	{
		TestString1 ts = new TestString1();
		ts.reverseEachWord("hello world hello");


		//ts.swapTwoNum(10,5);


		String s1 = "abc";
      	String s2 = "abc";
      	String s3 = new String("abc");
      	System.out.println(s1 == s2);
      	System.out.println(s1 == s3);

      	String str1 = "HappyNew";
      	str1.concat("year");
		System.out.println("before store the value the variable is " + str1);
		str1 = str1.concat("year");
		System.out.println("After storing the value is " + str1);

		StringBuilder sb = new StringBuilder();
		System.out.println("Append the string is " + sb.append("abc"));
		System.out.println("Reverse the String is " + sb.reverse());
		System.out.println("Convert String is " + sb.toString());
		System.out.println("replace the string is " + sb.replace(1,2,"x"));

		//swap first and last letter of the string
		String s = s1.charAt(s1.length()-1) + s1.substring(1,s1.length()-1) +s1.charAt(0);
		System.out.println("swap first and last letter of the string is = " +s);

	}
}






















































