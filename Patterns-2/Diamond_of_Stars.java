/*
Question: Print a Diamond Star Pattern

Write a program that takes an odd integer N as input and prints a diamond-shaped pattern using stars.

Pattern Details:
- N must be an odd number.
- The pattern consists of N rows.
- The first half forms the top part of the diamond (increasing stars).
- The second half forms the bottom part (decreasing stars).
- The stars are centered with spaces on both sides.

Example:
Input: 5
Output:
  *
 ***
*****
 ***
  *

Note:
- The number of stars in each row increases by 2 until the middle,
  then decreases by 2 after that.
- The middle row has N stars.
*/


package Tasks;
import java.util.Scanner;

public class Diamond_of_Stars {

	public static void main(String[] args) {
		
		System.out.println("Enter the Integer");
		Scanner Obj = new Scanner(System.in);
		int n = Obj.nextInt();
		Obj.close();
		
		int x=1;
		int y=1;
		int k = (n-1)/2;
		int p = 1;
		int t = n-2;
		while (x <= n)
		{
			
			y=1;
			while (y <= k)
			{
				System.out.print(" ");
				y++;
			
			}
			k--;
			 y = 1;
			 
			while (y <= 2*x-1 && 2*x-1 <= n)
			{
				System.out.print("*");
				y++;
			}
			y = 1;
			
		    while (y <= p && 2*x-1 > n)
		   {
			System.out.print(" ");
			    y++;
		    }
		    if (2*x-1 > n)
		    {
		    	p++;	
		    }
		    
		    y=1;
		    
		    while (y <= t && 2*x-1 > n)
		    {
		    	System.out.print("*");
		    	y++;
		    }
		    
		    if (2*x-1 > n && t > 1)
		    {
		    	t=t-2;
		    }
		   
			
			
			System.out.println();
			x++;
			
		}
		

	}

}


	 
	


