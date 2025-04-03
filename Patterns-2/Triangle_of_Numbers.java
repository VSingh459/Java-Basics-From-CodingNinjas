/*
Question: Print a Triangle of Numbers Pattern

Write a program that takes an integer N as input and prints a centered triangle pattern made of numbers.

Pattern Details:
- The triangle has N rows.
- Each row starts with spaces to center the numbers.
- Then, increasing numbers starting from the row number.
- Followed by decreasing numbers.

Example:
Input: 4
Output:
   1
  232
 34543
4567654
*/


package Tasks;
import java.util.Scanner;

public class Triangle_of_Numbers {

	public static void main(String[] args) {
		
		System.out.println("Enter the Integer");
		Scanner Obj = new Scanner(System.in);
		int n = Obj.nextInt();
		Obj.close();
		
		int x=1;
		int y = 1;
		int p;
		int k = 1;
		
		while (x <= n)
		{
			y=1;
			while (y <= n-x)
			{
				System.out.print(" ");
				y++;
			}
			 y = 1;
			 
			 k = x;
			 
			while (y <= x)
			{
				System.out.print(k);
				y++;
				k++;
			}
			
			p = 2*x-2;
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
