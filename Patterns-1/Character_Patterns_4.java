/*
Question: Print a Triangular Alphabet Pattern – Increasing Characters

Write a program that takes an integer N as input and prints a triangular pattern with N rows.

In each row:
- The number of characters is equal to the row number.
- Characters start from a specific letter based on the row number and increase alphabetically across the row.

Example:
Input: 4
Output:
A
BC
CDE
DEFG
*/


package character_Patterns;
import java.util.Scanner;

public class Character_Patterns_4 {

	public static void main(String[] args) {
		
		System.out.println("Enter the Integer");
		Scanner Obj = new Scanner(System.in);
		int n = Obj.nextInt();
		Obj.close();
		
		int x=1;
		int y=1;
		int Z=1;
		
		while(x <= n)
		{
			y = 1;
			Z = x;
			while (y <= x)
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
