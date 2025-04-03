/*
	Problem statement
Write a program to print the first x terms of the mathematical series 3N + 2 which are not multiples of 4.

The series is defined as:

T(N) = 3N + 2, where N is a positive integer starting from 1. Your task is to print the first x terms of this series, but you should exclude any term that is a multiple of 4.

Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= x <= 1,000
Sample Input 1 :
10
Sample Output 1 :
5 11 14 17 23 26 29 35 38 41
*/

package assignments;
import java.util.Scanner;

public class Terms_of_AP {

	public static void main(String[] args) {
		
		System.out.println("Enter the integer");
		Scanner Obj = new Scanner(System.in);
		int n = Obj.nextInt();
		Obj.close();
		
		int x = 1;
		int AP;
		
		for (int i=1;i<=n;i++)
		{
			AP = 3*x+2;
			x++;
			
			if (AP % 4 == 0)
			{
				i--;
				continue;
			}
			System.out.print(AP+" ");
			
			
				
			
		}
		

	}

}
