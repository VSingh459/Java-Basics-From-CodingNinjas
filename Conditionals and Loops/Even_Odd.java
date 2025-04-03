/*
 * Write a program to check whether a given number is even or odd.
 */


package If_else;
import java.util.Scanner;

public class Even_Odd {

	public static void main(String[] args) {
		
	
		
		System.out.println("Enter the integer");
		Scanner Obj = new Scanner(System.in);
		int k;
		k = Obj.nextInt();
		
		if (k % 2 == 0)
		{
			System.out.println("Even");
			return;
		}
		
		System.out.println("Odd");
		

		
	}

}
