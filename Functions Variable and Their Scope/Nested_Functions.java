/*
 * Program Name: Nested_Functions
 * Description: This program calculates the value of nCr (combinations) using nested function calls.
 *              It defines a factorial function and an NcR function that uses factorial to compute combinations.
 *              The user is prompted to enter values for n and r, and the result of nCr is displayed.
 * Author: [Your Name]
 * Date: [Optional - Add date if needed]
 */


package lectures;
import java.util.Scanner;

public class Nested_Functions {
	
	public static int factorial(int n)
	{
		int ans = 1;
		for (int i=1;i<=n;i++)
		{
			ans = ans*i;
		}
		return ans;
	}
	
	public static int NcR(int N,int R)
	{
		int num = factorial(N);
		int den1 = factorial(R);
		int den2 = factorial(N-R);
		
		int ans = num/(den1*den2);
		
		return ans;
	}

	public static void main(String[] args) {
		
		System.out.println("Enter the value of N and R");
		Scanner Obj = new Scanner(System.in);
		int n = Obj.nextInt();
		int r = Obj.nextInt();
		Obj.close();
		
		int ans = NcR(n,r);
		System.out.println(ans);
	}

}
