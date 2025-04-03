/*
  Program Name: NcR_with_Function
  Description: This program calculates the value of nCr (combinations) using a custom factorial function.
               It takes input values for n and r from the user, computes factorials, 
              and applies the formula: nCr = n! / (r! * (n - r)!).
 
 */


package lectures;
import java.util.Scanner;

public class NcR_with_Function {
	
	public static int factorial(int n)
	{
		int ans = 1;
		for (int i=1;i<=n;i++)
		{
			ans = ans*i;
		}
		return ans;
	}

	public static void main(String[] args) {
		
		System.out.println("Enter the value of N and R");
		Scanner Obj = new Scanner(System.in);
		int n = Obj.nextInt();
		int r = Obj.nextInt();
		Obj.close();
		
		int num = factorial(n);
		System.out.println(num);
		
		int den1 = factorial(r);
		System.out.println(den1);
		
		int den2 = factorial(n-r);
		System.out.println(den2);
		
		int ans = num/den1;
		int ans2 = ans/den2;
		
		
		System.out.println(ans2);

	}

}
