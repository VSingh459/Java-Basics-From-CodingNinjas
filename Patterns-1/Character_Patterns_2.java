/*
Question: Print a Square Alphabet Pattern – Row-wise Increasing Characters

Write a program that takes an integer N as input and prints a square pattern with N rows and N columns.

In each row, characters should start from a different alphabet and increase across the row.
- The first character of each row is based on the row number.
- Characters increase alphabetically from left to right.

Example:
Input: 4
Output:
ABCD
BCDE
CDEF
DEFG
*/



package character_Patterns;
import java.util.Scanner;

public class Character_Patterns_2 {

	public static void main(String[] args) {
		
		System.out.println("Enter the Integer");
		Scanner Obj = new Scanner(System.in);
		int n = Obj.nextInt();
		Obj.close();
		
		int x=1;
		int y=1;
		int Z=1;
		
		while (x <= n)
		{
			y=1;
			Z = x;
			while (y <=n)
			{
				System.out.print((char)('A'+Z-1));
				y++;
				Z++;
			}
			System.out.println();
			x++;
		}

	}

}
