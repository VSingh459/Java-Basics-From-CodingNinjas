package While_Loops;
import java.util.Scanner;

// User will enter an integer N. Out goal is to find the sum of all even integers from 1 to N.

public class Sum_Even_Numbers {

	public static void main(String[] args) {
	
		
		 System.out.println("Enter the integer");
		
		Scanner Obj = new Scanner(System.in);
		int z = Obj.nextInt();
		
		int x = 2;
		int sum = 0;
		
		while (x <= z)
		{
			if (x % 2 == 0)
			{
				sum = sum+x;
			}
			x = x+1;
		}
		
		System.out.println(sum);
		
	}

}
