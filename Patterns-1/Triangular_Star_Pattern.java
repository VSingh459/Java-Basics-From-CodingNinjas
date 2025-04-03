/*
Question: Print a Triangular Star Pattern

Write a program that takes an integer N as input and prints a triangle made of stars with N rows.

Each row should contain stars equal to the row number.

Example:
Input: 4
Output:
*
**
***
****
*/


import java.util.Scanner;
public class Triangular_Star_Pattern {

	public static void main(String[] args) {
		
		System.out.println("Enter the Integer");
		Scanner Obj = new Scanner(System.in);
		int n = Obj.nextInt();
		Obj.close();
		
		int x =1;
		int y=1;
		
		while (x <= n)
		{
			y = 1;
			
			while (y <= x)
			{
				System.out.print("*");
				y++;
			}
			System.out.println();
			x++;
		}

	}

}
