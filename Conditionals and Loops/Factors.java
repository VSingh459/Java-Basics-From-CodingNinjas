/* Write a program that takes a number as input and prints all its factors except 1 and the number itself.. If the number has only two factors (1 and the number itself), then the program should print -1.

Detailed explanation ( Input/output format, Notes, Images )
Constraints :
0 <= n <= 10,000
Sample Input 1 :
8
Sample Output 1 :
2 4
Explanation of Sample Output 1 :
The factors for the number excluding 1 and itself are 2 and 4, so the output is 2 4.
Sample Input 2 :
11
Sample Output 2 :
-1
Explanation of Sample Output 2 :
11 is a prime number having factors 1 and 11 so that output will be -1.*/



package Lecture4_Assignments;
import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		
		 System.out.println("Enter the Integer");
		
		Scanner Obj = new Scanner(System.in);
		int n = Obj.nextInt();
		Obj.close();
		
		int x = 2;
		int d = 1;
		
		while (x <  n)
		{
			if (n % x == 0)
			{
				System.out.print(x+" ");
			}
			x = x+1;
			
		}
		
		

	}

}
