/*
Question: Print a Mirror Image Number Pattern

Write a program that takes an integer N as input and prints a right-aligned (mirror image) number pattern.

Pattern Details:
- The pattern has N rows.
- Each row contains spaces followed by increasing numbers starting from 1 up to the row number.
- The numbers shift to the right in each row, creating a mirror image.

Example:
Input: 4
Output:
   1
  12
 123
1234
*/


package Tasks;
import java.util.Scanner;

public class Mirror_Image_Number_Pattern {

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
				System.out.print(y);
				y++;
			}
			System.out.println();
			x++;
		}
		
		

	}

}
