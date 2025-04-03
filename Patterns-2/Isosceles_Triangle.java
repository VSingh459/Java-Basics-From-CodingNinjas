/*
Question: Print an Isosceles Number Triangle

Write a program that takes an integer N as input and prints an isosceles number triangle with N rows.

Pattern Rules:
- Each row starts with spaces to center the numbers.
- The numbers increase from 1 up to the row number, then decrease back to 1.
- The triangle is symmetrical and pyramid-shaped.

Example:
Input: 4
Output:
   1
  121
 12321
1234321
*/


package Lecture_Programs;
import java.util.Scanner;
public class Isosceles_Triangle {

	public static void main(String[] args) {
		
		System.out.println("Enter the Integer");
		Scanner Obj = new Scanner(System.in);
		int n = Obj.nextInt();
		Obj.close();
		
		int x=1;
		int y = 1;
		int p;
		
		while (x <= n)
		{
			y=1;
			while (y <= n-x)
			{
				System.out.print(" ");
				y++;
			}
			y = 1;
			
			while (y <= x)
			{
				System.out.print(y);
				y++;
			}
			
			p = x-1;
			y = 1;
			
			while (y <= x-1)
			{
				System.out.print(p);
				y++;
				p--;
			}
			
			
			System.out.println();
			x++;
			
			
		}
		
		

	}

}
