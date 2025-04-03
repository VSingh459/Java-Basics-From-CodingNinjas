/*
Question: Print a Parallelogram Star Pattern

Write a program that takes an integer N as input and prints a parallelogram pattern using stars.

Pattern Details:
- The pattern consists of N rows.
- Each row contains N stars.
- After each row, the next row is indented by one additional space, creating a parallelogram shape.

Example:
Input: 4
Output:
****
 ****
  ****
   ****
*/


package Assignments_Lec_6;
import java.util.Scanner;
public class Parallelogram_Pattern {

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
			while (y <= n)
			{
				System.out.print("*");
				y++;
			}
			System.out.println();
              
			y=1;
			
			while (y <= x)
			{
				System.out.print(" ");
				y++;
			}
			x++;
		}
	}

}
