import java.io.*;
import java .util.*;


public class TestArray2
{
	public void createArray1()
	{
		int[] a1 = new int[10]; // emtpy array
		int[] a2 = {10,20,30};

		for(int i = 0 ; i < a1.length ; i++) // to loop over the array
			System.out.println("value in " + i + "th box = " + a1[i]);

		System.out.println("Using Foreach loop");
		for(int x:a2)
			System.out.println(x);
	}

	public void insertArray1(int[] b)
	{
		int[] ia = new int[10];
		for(int k = 1; k <= b.length-1; k++)
			ia[k] = b[k];

		for(int x:b)
			System.out.println(x);
	}

	public static void main(String[] args)
	{
		TestArray2 ta = new TestArray2();
		//ta.createArray1();
		int[] b = new int[10];
		for(int i = b.length,j = 0; i > 0 ; i--,j++)
			b[j] = i;
		//ta.insertArray1(b);
	}
}
class TestArray3
{
	public void insertArray1()
	{
		int[] b = new int[10];
		for(int i = 0; i < b.length ; i++)
			b[i] = (int)(Math.random()*100);
		for(int x:b)
			System.out.println(x);
	}

	public void insertArray2(int[] a1)
	{
		System.out.println("using For Loop");
		for(int k = 0; k <= a1.length-1; k++)
			System.out.println(a1[k]);

		System.out.println("Using ForEach Loop");
		for(int x:a1)
			System.out.println(x);

	}

	int sum;
	public int addArrayElements(int[] arr)
	{
		for(int i = 0; i < arr.length-1; i++)
			sum = sum + arr[i];
		return sum;
	}

	public static void main(String[] args)
	{
		TestArray3 ta = new TestArray3();
		//ta.insertArray1();
		int[] a1 = {10,20,30,40,50};
		//ta.insertArray2(a1);
		int[] b = new int[10];
		System.out.println("Array elements are");
		for(int i = 0; i < b.length ; i++)
		{
			b[i] = (int)(Math.random()*100);
			System.out.println(b[i]);
		}
		int result = ta.addArrayElements(b);
		System.out.println("Sum of array elements = " + result);
	}
}

class TestArray4
{
	int max1,max2;
	public int maxArray(int[] a,int[] b)
	{
		max1 = a[0];
		max2 = b[0];
		for(int i = 0; i <= a.length-1; i++)
		{
			if(a[i] >= max1)
				max1 = a[i];
		}
		for(int i = 0; i <= b.length-1; i++)
		{
			if(b[i] >= max2)
				max2 = b[i];
		}
		if(max1 > max2)
			return max1;
		else
			return max2;
	}

	int avg;
	public int avgArray(int[] a,int[] b)
	{
		int sum1 = 0, sum2 = 0;
		for(int i = 0; i <= a.length-1; i++)
			sum1 = sum1 + a[i];

		for(int i = 0; i <= b.length-1; i++)
			sum2 = sum2 + b[i];

		avg = (sum1+sum2)/(a.length + b.length);
		return avg;
	}

	public void secondLargest(int[] a,int[] b)
	{
		int a1 = a.length;
		int b1 = b.length;
		int large,secondLarge;

        int[] c = new int[a1 + b1];

		for(int i = 0; i < a1; i++)
			c[i] = a[i];
		for(int i = 0; i < b1; i++)
			c[a1 + i] = b[i];

		large = c[0];
		for(int i = 0; i < c.length; i++)
		{
			if(c[i] > large)
				large = c[i];
		}
		secondLarge = c[0];
		for(int i = 0; i < c.length; i++)
		{
			if(large != secondLarge && c[i] > secondLarge && c[i] != large)
				secondLarge = c[i];
		}
		System.out.println("Second Largest element is " + secondLarge);
	}

	public void uniqueArray(int[] a,int[] b)
	{
		int a1 = a.length;
		int b1 = b.length;
		int[] c = new int[a1 + b1 ];

		//merge two arrays
		for(int i = 0; i < a1; i++)
			c[i] = a[i];
		for(int i = 0; i < b1; i++)
			c[a1 + i] = b[i];

		Arrays.sort(c); // first am sort the array
		System.out.println("Removed duplicate elements in an Array");
       for(int i = 0; i< c.length-1; i++)
       {
			while(i < c.length-1 && c[i] == c[i+1])
				i++;
			System.out.println(c[i]);
	   }
	}

	public void Array2D()
	{
		int[][] arr = {{1,2,3},{4,5,6}};
		//int[][] arr = new int[3][2];


		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
				System.out.print(arr[i][j] + "\t");
			System.out.println();
		}

	}

	public static void main(String[] args)
	{
		TestArray4 ta = new TestArray4();

		ta.Array2D();

		//ta.uniqueArray(a,b);

		//ta.secondLargest(a,b);

		/*int result = ta.avgArray(a,b);
		System.out.println("average of Array Elements is = " + result); */



		/*int[] a = {10,20,30,40,50};
		int[] b = {90,456,34,21,34};
		int result = ta.maxArray(a,b);
		System.out.println("Maximun Array Element is " + result); */
	}
}



































































