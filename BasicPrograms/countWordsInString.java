public class countWordsInString
{
   public static void main(String[] args)
   {
	   String str, word;

		  //Scanner s = new Scanner(System.in);

		  //System.out.print("Enter the String: ");
		  //str = s.nextLine();
		  str = "hi and hi";


			str = str.toLowerCase();
		  String words[] = str.split("\\s+");
		  int wordsLen = words.length;

      System.out.println("\n----Occurrences of Each Word----");
      for(int i=0; i<wordsLen; i++)
      {
         int count = 1;
         for(int =j(i+1); j<(wordsLen); j++)
         {
            if(words[i].equals(words[j]))
            {
               count++;
               for(int k=j; k<(wordsLen-1); k++)
                  words[k] = words[k+1];
               wordsLen--;
               j--;
            }
         }
         if(count==1)
            System.out.println("The word \"" +words[i]+ "\" occurs only 1 time.");
         else
            System.out.println("The word \"" +words[i]+ "\" occurs " +count+" times.");
         count = 0;
      }
   }
}
class CountOccuranceOfChar1
{
	static final int MAX_CHAR = 256;
	static void getOccuringChar(String str)
	{
		//creating an array of size 256 (ASCII_SIZE)
		int count[] = new int[MAX_CHAR]; // empty array default value is 0

		//initialize count array index str.charAt(i) = B = 66
		// type casting automatically convert char value int to store a int datatype variable
		for (int i = 0; i < str.length(); i++)
		{
			count[str.charAt(i)]++;
		}
		//create an array of given String size
		/*char ch[] = new char[str.length()];
		for (int i = 0; i < len; i++)
		{
			ch[i] = str.charAt(i);
			int find = 0;
			for (int j = 0; j <= i; j++)
			{
				System.out.println(str.charAt(i) + " = " + ch[j] + " ,i ="+i);
				//if any matches found
				if (str.charAt(i) == ch[j])
					find++;
			}
			if(find == 1)
				System.out.println("The occurrence of "+ str.charAt(i)+ " is: " + count[str.charAt(i)]);
		}*/
	}
		//driver Code
	public static void main(String args[])
	{
		String str = "Bhoomioo"; //lung disease
		//function calling
		getOccuringChar(str);
	}

}