/*
Question: Print a Triangular Number Pattern

Write a program that takes an integer N as input and prints a triangle pattern with N rows.

Each row should have the row number printed as many times as the row number.

Example:
Input: 4
Output:
1
22
333
4444
*/


import java.util.Scanner;
public class Triangular_Number_Pattern {

	public static void main(String[] args) {
		
		System.out.println("Enter the number of rows that should be in the pattern");
		
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
				System.out.print(x);
				y++;
			}
			System.out.println();
			x++;
		}


	}

}
