/*Write a program that takes a character as input and prints 1, 0, or -1
 according to the following rules.



1, if the character is an uppercase alphabet (A - Z).
0, if the character is a lowercase alphabet (a - z).
-1, if the character is not an alphabet.


Example:
Input: The character is 'a'.

Output: 0

Explanation: The input character is lowercase, so our answer is 0.
Detailed explanation ( Input/output format, Notes, Images )
Sample Input 1 :
v


Sample Output 1 :
0


Explanation of Sample Input 1:
The input character is lowercase, so our answer is 0.


Sample Input 2 :
V


Sample Output 2 :
1 */

package If_else;
import java.util.Scanner;

public class Find_Character_Case {

	public static void main(String[] args) {
		
		 System.out.println("Enter the Character");
		Scanner Obj = new Scanner(System.in);
		String str;
		str = Obj.nextLine();
		char y;
		y = str.charAt(0);
		int a;
		a = y;
		if (a >= 65 && a <= 90)
		{
			System.out.println(1);
		}
		else if (a >= 97 && a <= 122)
		{
			System.out.println(0);
		}
		else
		{
			System.out.println(-1);
		}
		

	}

}
