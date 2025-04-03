/*
Question: Print a Square Alphabet Pattern (A to ...)

Write a program that takes an integer N as input and prints a square pattern with N rows and N columns.

Each row should contain the first N uppercase alphabets in order (A, B, C, ...), repeated in every row.

Example:
Input: 4
Output:
ABCD
ABCD
ABCD
ABCD
*/


package character_Patterns;
import java.util.Scanner;

public class Character_Patterns_1 {

	public static void main(String[] args) {
		
		System.out.println("Enter the Integer");
		Scanner Obj = new Scanner(System.in);
		int n = Obj.nextInt();
		Obj.close();
		
		int x=1;
		int y=1;
		
		while (x <= n)
		{
			y=1;
			while (y <=n)
			{
				System.out.print((char)('A'+y-1));
				y++;
			}
			System.out.println();
			x++;
		}
		

	}

}
