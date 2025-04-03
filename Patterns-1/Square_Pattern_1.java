/*
Question: Print a Square Pattern with Row Numbers

Write a program that takes an integer N as input and prints a square pattern of N rows and N columns.

Each row should contain the same number, and that number should be equal to the row number.

Example:
Input: 4
Output:
1111
2222
3333
4444
*/


import java.util.Scanner;

public class Square_Pattern_1 {

	public static void main(String[] args) {
		
		System.out.println("Enter the Integer");
		Scanner Obj = new Scanner(System.in);
		int n = Obj.nextInt();
		Obj.close();
		
		int x=1;
		int y=1;
		
		while (x <= n)
		{
			y = 1;
			while (y <= n)
			{
				System.out.print(x);
				y=y+1;
			}
			System.out.println();
			x++;
		}

	}

}
