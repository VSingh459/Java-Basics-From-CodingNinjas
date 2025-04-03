/*
Question: Print a Centered Triangle Star Pattern

Write a program that takes an integer N as input and prints a centered triangle pattern using stars.

Pattern Details:
- The pattern has N rows.
- Each row contains spaces followed by stars.
- The number of stars increases by 2 in each row to form a centered triangle.

Example:
Input: 4
Output:
   *
  ***
 *****
*******
*/


package Tasks;
import java.util.Scanner;
public class Star_Pattern {

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
			while (y <= n-x)
			{
				System.out.print(" ");
				y++;
			}
			y = 1;
			
			
			while (y <= 2*x-1)
			{
				System.out.print("*");
				y++;
			}
			
			
			
			System.out.println();
			x++;
			
			
		}

	}

}
