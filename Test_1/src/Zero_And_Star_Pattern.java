/*
 Problem statement
Print the following pattern

Pattern for N = 4

*000*000*
0*00*00*0
00*0*0*00
000***000
Detailed explanation ( Input/output format, Notes, Images )
Sample Input 1 :
3
Sample Output 1 :
*00*00*
0*0*0*0
00***00
Sample Input 2 :
5
Sample Output 2 :
*0000*0000*
0*000*000*0
00*00*00*00
000*0*0*000
0000***0000 */

import java.util.Scanner;
public class Zero_And_Star_Pattern {

	public static void main(String[] args) {
		
		System.out.println("Enter the Integer");
		Scanner Obj = new Scanner(System.in);
		int n = Obj.nextInt();
		Obj.close();
		
		int x=1;
		int y=1;
		
		while (x <= n)
		{
			y = 1;
			while (y <= x)
			{
				if (y==x)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(0);
				}
				y=y+1;
			}
			y=1;
			while (y <= n-x+1)
			{
				if (y==n-x+1)
				{
					System.out.print("*");
				}
				else
					System.out.print(0);
		
				y++;
			}
			
			y=1;
			while (y <= n)
			{
				if (y == n-x+1)
				{
					System.out.print("*");
					
				}
				else
				{
					System.out.print(0);
				}
				y= y+1;
			}
			
			
			System.out.println();
			x++;
		}

	}

}
