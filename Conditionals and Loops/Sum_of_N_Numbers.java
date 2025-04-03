/*
 * Write a program to calculate the sum of the first N natural numbers.
 * 
 */


package While_Loops;
import java.util.Scanner;

public class Sum_of_N_Numbers {

	public static void main(String[] args) {
		
		System.out.println("Enter the number");
		Scanner Obj = new Scanner(System.in);
		int n;
		n = Obj.nextInt();
		int x = 1;
		int sum = 0;
		
		while (x <= n)
		{
			sum = sum + x;
			x = x+1;
		}
		System.out.println("The sum to "+n+" is = "+sum);
	}

}
