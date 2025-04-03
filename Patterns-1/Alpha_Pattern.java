/*
Question: Print an Alphabet Pattern

Write a program that takes an integer N as input and prints a triangle pattern with N rows.


Example:
Input: 4
Output:
A
BB
CCC
DDDD
*/


package character_Patterns;
import java.util.Scanner;

public class Alpha_Pattern {

	public static void main(String[] args) {
		
		System.out.println("Enter the Integer");
		Scanner Obj = new Scanner(System.in);
		int n = Obj.nextInt();
		Obj.close();
		
		int x=1;
		int y=1;
		
		while(x <= n)
		{
			y = 1;
			while (y <= x)
			{
				System.out.print((char)('A'+x-1));
				y++;
				
			}
			System.out.println();
			x++;
		}
	

	}

}
