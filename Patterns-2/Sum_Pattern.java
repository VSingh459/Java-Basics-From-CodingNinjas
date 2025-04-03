/*
Question: Print a Sum Pattern

Write a program that takes an integer N as input and prints a pattern of number sums from 1 to N.

Each line should show the sum of numbers from 1 to the current row number, in the format:
1=1
1+2=3
1+2+3=6
... and so on.

Example:
Input: 4
Output:
1=1
1+2=3
1+2+3=6
1+2+3+4=10
*/


package Assignments_Lec_6;
import java.util.Scanner;

public class Sum_Pattern {

	public static void main(String[] args) {
		
		System.out.println("Enter the Integer");
		Scanner Obj = new Scanner(System.in);
	    int n = Obj.nextInt();
	    Obj.close();
	    
	    int x=1;
	    int y=1;
	    int sum = 0;
	    
	    while (x <= n)
	    {
	    	y=1;
	    	sum=0;
	    	
	    	while (y <= x)
	    	{
	    		sum=sum+y;
	    		System.out.print(y);
	    		if (y < x)
	    		{
	    			System.out.print("+");
	    		}
	    		y++;
	    	}
	    	
	    	System.out.println("="+sum);
	    	x++;
	    	
	    }

	}

}
