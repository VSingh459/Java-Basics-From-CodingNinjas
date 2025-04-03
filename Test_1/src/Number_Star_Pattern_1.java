/*
 Problem statement
Print the following pattern for given number of rows.

Detailed explanation ( Input/output format, Notes, Images )
Sample Input :
   5
Sample Output :
 5432*
 543*1
 54*21
 5*321
 *4321*/

import java.util.Scanner;
public class Number_Star_Pattern_1 {

	public static void main(String[] args) {
		
		System.out.println("Enter the Integer ");
		
		Scanner Obj = new Scanner(System.in);
		int n = Obj.nextInt();
		Obj.close();
		
		int x=1;
		int y=1;
		
		while (x <= n)
		{
			y = 1;
			while (y <= n)
			{
				if (y == n-x+1)
				{
					System.out.print("*");
					
				}
				else
				{
					System.out.print(n-y+1);
				}
				y= y+1;
			}
			System.out.println();
			x++;
		}

	}

}
