// Write a program to find x to the power n (i.e. x^n). Take x and n from the user.
// You need to print the answer.
// Note : For this question, you can assume that 0 raised to the power of 0 is 1


//  Input format :
//  Two integers x and n (separated by space)
//  Output Format :
//  x^n (i.e. x raise to the power n)
//  Constraints:
//  0 <= x <= 8 
//  0 <= n <= 9
//  Sample Input 1 :
//  3 4
//  Sample Output 1 :
//  81
//  Sample Input 2 :
//  2 5
//  Sample Output 2 :
//  32

package Lecture4_Assignments;
import java.util.Scanner;

public class Powers_of_Number {

	public static void main(String[] args) {
		
		System.out.println("Enter the integer and the power it should be raised to.");
		
		Scanner Obj = new Scanner(System.in);
		int x = Obj.nextInt();
		int n = Obj.nextInt();
		Obj.close();
		
		int a = n;
		int R = 1;
		
		while (a > 0)
		{
			R = R*x;
			a = a-1;
		}
		
		System.out.println(R);
			
	}

}
