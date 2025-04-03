/*
Question: Print an Odd Square Pattern

Write a program that takes an integer N as input and prints a square pattern of N rows and N columns.

The pattern should:
- Start from 1 and print only odd numbers (1, 3, 5, ...).
- Each row continues printing odd numbers in sequence.
- If the maximum odd number (2N - 1) is reached, wrap around and continue from 1.

Example:
Input: 4
Output:
1357
3571
5713
7135

Explanation:
- The first row starts from 1.
- The second row starts from the next odd number after the first row's first number (3), and so on.
- The sequence wraps around after 7 (since 2*N - 1 = 7).
*/



package Assignments_Lec_6;
import java.util.Scanner;

public class Odd_Square_Better_Code {

	public static void main(String[] args) {
		
		System.out.println("Enter the Integer");
		Scanner Obj = new Scanner(System.in);
		int n = Obj.nextInt();
		Obj.close();
		
		int x=1;
		int y=1;
		int p = 1;
		int Lock= 2*n-1;
		int t = 1;
		
		
		
		while (x <= n)
		{
			y=1;
			t=t+2;
			while (y <= n)
			{
				System.out.print(p);
				if (p == Lock)
				{
					p=1;
				}
				else
				{
				p=p+2;
				}
			    y++;
			}
			p=t;
			System.out.println();
			x++;
		}
	}

}
