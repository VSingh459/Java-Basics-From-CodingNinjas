/*
Question: Print a Half Diamond Number-Star Pattern

Write a program that takes an integer N as input and prints a half-diamond pattern using numbers and stars.

Pattern Details:
- The pattern starts and ends with a single star (*).
- The top half consists of increasing rows of numbers with stars at the borders.
- The bottom half mirrors the top, decreasing in length.
- Each row begins with a star, followed by increasing numbers, then decreasing numbers, and ends with a star (if not already printed).

Example:
Input: 3
Output:
*
*1*
*121*
*12321*
*121*
*1*
*

Note:
- The full pattern has (2N + 1) lines.
- The middle line contains numbers from 1 to N and back to 1, wrapped with stars.
*/


package Assignments_Lec_6;
import java.util.Scanner;


public class Half_Diamond_Pattern {

	public static void main(String[] args) {
		
		System.out.println("Enter the Integer");
		Scanner Obj = new Scanner(System.in);
		int n = Obj.nextInt();
		Obj.close();
		
		int x =1;
		int y=1;
		int p=1;
		int k = n-1;
		int t = n-2;
		int r = t;
		int flag;
		
		System.out.println("*");
		
		while (x <= n)
		{
			y = 1;
			flag = 1;
			while (y <= x)
			{
				if (flag==1)
				{
					System.out.print("*");
				}
				flag =0;
				System.out.print(y);
				y++;
			}
			y=1;
			p=x-1;
			if (x==1)
			{
				System.out.print("*");
			}
			while (y <= x-1)
			{
				System.out.print(p);
				y++;
				p--;
				if (p==0)
				{
					System.out.print("*");
				}
			}
			
			System.out.println();
			x++;
		}
		x=1;
		
		while (x <= n-1)
		{
			y=1;
			flag=1;
			while (y <= k)
			{
				if (flag==1)
				{
					System.out.print("*");
				}
				flag = 0;
				System.out.print(y);
				y++;
			}
			if (x==n-1)
			{
				System.out.print("*");
			}
			k--;
			y=1;
			while (y <= t )
			{
				System.out.print(r);
				y++;
				r--;
				if (r==0)
				{
					System.out.print("*");
				}
			}
			t--;
			r=t;
			System.out.println();
			x++;
		}
		System.out.println("*");
		

	}

}
