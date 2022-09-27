package com.uis.testWrapper;

public class SquareRoot {

	  // Program to find if x is a
    // perfect square.
    static boolean isPerfectSquare(int num)
    {
        long left = 1, right = num;
         
        while (left <= right)
        {
            long mid = (left + right) / 2;
           System.out.println(mid);
            // Check if mid is perfect square
            if (mid * mid == num)
            {
                return true;
            }
            
            // Mid is small -> go right to increase mid
            if (mid * mid < num)
            {
                left = mid + 1;
            }
           
            // Mid is large -> to left to decrease mid
            else
            {
                right = mid - 1;
            }
        }
        return false;
    }
     
    // Driver code
    public static void main(String[] args)
    {
        int x = 20;
         
        // Function Call
        if (x == 0 || isPerfectSquare(x))
            System.out.print("Yes");
        else
            System.out.print("No");
    }
}
