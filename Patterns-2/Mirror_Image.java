/*
Question: Print a Right-Aligned (Mirror Image) Triangle Star Pattern

Write a program that takes an integer N as input and prints a right-aligned triangle made of stars.

Each row should contain:
- Spaces first, to shift the stars to the right
- Then stars, equal to the row number

Example:
Input: 5
Output:
    *
   **
  ***
 ****
*****
*/


package Lecture_Programs;
import java.util.Scanner;

public class Mirror_Image {

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
			
			while (y <= x)
			{
				System.out.print("*");
				y++;
			}
			System.out.println();
			x++;
		}
		

	}

}
