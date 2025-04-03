/*
Question: Print a Reverse Triangular Number Pattern

Write a program that takes an integer N as input and prints a triangle pattern with N rows.

Each row should start from the row number and print decreasing numbers down to 1.

Example:
Input: 4
Output:
1
21
321
4321
*/


import java.util.Scanner;
public class Triangular_Reverse_Pattern {

	public static void main(String[] args) {
		
		System.out.println("Enter the number of rows of the required Pattern");
		
		Scanner Obj = new Scanner(System.in);
		int n = Obj.nextInt();
		Obj.close();
		
		int x =1;
		int y=1;
		int A;
		
		while (x <= n)
		{
			y = 1;
			A = x;
			
			while (y <= x)
			{
				System.out.print(A);
				y++;
				A = A-1;
			}
			System.out.println();
			x++;
		}

	}

}
