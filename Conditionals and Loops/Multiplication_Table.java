// Write a program to print multiplication table of n
// Input Format :
// A single integer, n
// Output Format :
// First 10 multiples of n each printed in new line
// Constraints :
// 0 <= n <= 10,000
// Sample Input 1 :
 //  2
// Sample Output 1 :
// 2
// 4
// 6
// 8
// 10
// 12
// 14
// 16
// 18
// 20


package Lecture4_Assignments;
import java.util.Scanner;

public class Multiplication_Table {

	public static void main(String[] args) {
		
		// System.out.println("Enter the integer");
		Scanner Obj = new Scanner(System.in);
		int x = Obj.nextInt();
		Obj.close();
		
		int i = 1;
		int m = x;
		
		System.out.println(x);
		while (i <= 9)
		{
			m = m+x;
			System.out.println(m);
			i = i+1;
		}

	}

}
