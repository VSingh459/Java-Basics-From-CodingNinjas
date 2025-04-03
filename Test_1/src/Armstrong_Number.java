/*
 Problem statement
You are given an integer 'n'. Return 'true' if 'n' is an Armstrong number, and 'false' otherwise.


An Armstrong number is a number (with 'k' digits) such that the sum of its digits raised to 'kth' power is equal to the number itself. For example, 371 is an Armstrong number because 3^3 + 7^3 + 1^3 = 371.

Detailed explanation ( Input/output format, Notes, Images )
Sample Input 1 :
1


Sample Output 1 :
true


Explanation of Sample Input 1 :
1 is an Armstrong number as, 1^1 = 1.


Sample Input 2 :
103


Sample Output 2 :
false*/

import java.util.Scanner;
public class Armstrong_Number {

	public static void main(String[] args) {
		
		System.out.println("Enter the Number");
		Scanner Obj = new Scanner(System.in);
		int n = Obj.nextInt();
		Obj.close();
		
		int rem,x,prod,sum,y;
		x=n;
		int count=0;
		sum=0;
		prod=1;
		
		while (x != 0)
		{
			rem = x%10;
			count++;
			x=x/10;
		}
		//System.out.println(count);
		x=n;
		y=1;
		while (x !=0)
		{
			rem = x%10;
			y=1;
			while (y <= count)
			{
				prod = prod*rem;
				y++;
			}
			sum=sum+prod;
			x=x/10;
			prod=1;
		}
		if (sum==n)
		{
			System.out.println("true");
		}
		else
			System.out.println("false");

	}

}
