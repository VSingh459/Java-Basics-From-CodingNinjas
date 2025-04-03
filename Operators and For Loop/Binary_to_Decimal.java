/*
 * Question:


 * Write a Java program to convert a binary number (entered as an integer) into its decimal equivalent.
 * The binary number should be input by the user, and the program should output its corresponding decimal value.
 * Do not use built-in conversion methods; instead, implement the logic manually.
 */


package assignments;
import java.util.Scanner;

public class Binary_to_Decimal {

	public static void main(String[] args) {
		
		System.out.println("Enter the Number");
		Scanner Obj = new Scanner(System.in);
		int n = Obj.nextInt();
		Obj.close();
		
		int x = n;
		int rem;
		int d=1;
		int count = 0;
		int sum = 0;
		int y;
		while (x != 0)
		{
			rem = x % 10;
			y=count;
			count++;
			
			while (y > 0)
			{
				d = d*2;
				y--;
			}
			x = x/10;
			d = d*rem;
			sum=sum+d;
			d=1;
		
		}
		System.out.println(sum);
	}

}
