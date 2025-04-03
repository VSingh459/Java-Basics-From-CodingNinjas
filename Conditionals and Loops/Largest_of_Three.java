/*
 * Write a program that takes three integers as input and prints the largest among them.
 * 
 * 
 */


package If_else;
import java.util.Scanner;

public class Largest_of_Three {

	public static void main(String[] args) {
		
		System.out.println("Enter the 3 integers");
		
		Scanner Obj =  new Scanner(System.in);
		int a,b,c;
		a = Obj.nextInt();
		b = Obj.nextInt();
		c = Obj.nextInt();
		
		if (a >= b && a >= c)
		{
			System.out.println(-10);
			System.out.println(a+" is the largest");
		}
		else if (b >= a && b >= c)
		{
			System.out.println(b+" is the largest");
		}
		else
		{
			System.out.println(c+" is the largest");
		}

	}

}
