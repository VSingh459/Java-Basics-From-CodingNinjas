/*Problem statement
Write a program to generate the reverse of a given number N. Print the corresponding reverse number.

Note : If a number has trailing zeros, then its reverse will not include them. For e.g., reverse of 10400 will be 401 instead of 00401.



Detailed explanation ( Input/output format, Notes, Images )
Constraints:
0 <= N < 10^8
Sample Input 1 :
1234
Sample Output 1 :
4321 */

package assignments;
import java.util.Scanner;

public class Reverse_of_Number {

	public static void main(String[] args) {
		
		System.out.println("Enter the Number");
		Scanner Obj = new Scanner(System.in);
		int n = Obj.nextInt();
		Obj.close();
		
		int rem,rev,x;
		x = n;
		rev = 0;
		
		while (x !=0)
		{
			rem = x % 10;
			rev = rev*10+rem;
			x = x/10;
		}
		System.out.println(rev);
		
		
	}

}
