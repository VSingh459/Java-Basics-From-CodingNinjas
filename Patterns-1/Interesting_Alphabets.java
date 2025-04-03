/*
Question: Print a Triangular Alphabet Pattern – Reverse Start

Write a program that takes an integer N as input and prints a triangular pattern with N rows.

In each row:
- The number of characters is equal to the row number.
- Characters start from the reverse of the alphabet (based on N) and increase in each row.
- The first row starts from the Nth alphabet and shifts one position earlier in each new row.

Example:
Input: 5
Output:
E
DE
CDE
BCDE
ABCDE
*/


package character_Patterns;
import java.util.Scanner;

public class Interesting_Alphabets {

	public static void main(String[] args) {
		
		System.out.println("Enter the Integer");
		Scanner Obj = new Scanner(System.in);
		int n = Obj.nextInt();
		Obj.close();
		
		int x=1;
		int y=1;
		int Z = n;
		int P = n;
		
		while(x <= n)
		{
			y = 1;
	
			while (y <= x)
			{
				System.out.print((char)('A'+Z-1));
				y++;
				Z++;
			
			}
			System.out.println();
			x++;
			Z = P-1;
			P--;
		
		
		}
	

	}

}
