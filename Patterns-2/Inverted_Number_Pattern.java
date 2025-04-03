/*
Question: Print an Inverted Number Pattern

Write a program that takes an integer N as input and prints an inverted number pattern.

Pattern Details:
- The pattern has N rows.
- Each row contains the same number repeated.
- The number in each row starts from N and decreases by 1 in each next row.

Example:
Input: 4
Output:
4444
333
22
1
*/


package Tasks;
import java.util.Scanner;

public class Inverted_Number_Pattern {

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
				System.out.print(n-x+1);
				y++;
			}
			System.out.println();
			x++;
		}
		

	}

}
