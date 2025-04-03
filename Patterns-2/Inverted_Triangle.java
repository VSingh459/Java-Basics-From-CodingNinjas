/*
Question: Print an Inverted Triangle Star Pattern

Write a program that takes an integer N as input and prints an inverted triangle made of stars.

The first row should have N stars, and each row after that should have one less star than the previous row.

Example:
Input: 5
Output:
*****
****
***
**
*
*/


package Lecture_Programs;
import java.util.Scanner;
public class Inverted_Triangle {

	public static void main(String[] args) {
		
		System.out.println("Enter the Integer");
		Scanner Obj = new Scanner(System.in);
		int n = Obj.nextInt();
		Obj.close();
		
		int x=1;
		int y = 1;
		
		while (x <= n)
		{
			y=1;
			while (y <= n-x+1)
			{
				System.out.print("*");
				y++;
			}
			System.out.println();
			x++;
		}

	}

}
