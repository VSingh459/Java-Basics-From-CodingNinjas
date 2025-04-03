/*/*
 * Question:
 * Write a Java program to print all prime numbers up to a given number `n`.
 *
 * Requirements:
 * - Prompt the user to enter an integer `n`.
 * - Print all prime numbers between 2 and `n` (inclusive).
 * - A prime number is only divisible by 1 and itself.
 * - Use nested loops to check divisibility and identify primes.
 *
 * Note:
 * - Avoid using built-in methods for prime checking.
 * - Display the prime numbers in a single line, separated by spaces.
 */
 

package tasks;
import java.util.Scanner;

public class All_Prime_Numbers {

	public static void main(String[] args) {
		
		System.out.println("Enter the Integer");
		Scanner Obj = new Scanner(System.in);
		int n = Obj.nextInt();
		Obj.close();
		
		boolean div = false;
		int x;
		
		for (int i =2; i<=n;i++)
		{
			div = false;
		
		  for (int j=2;j<i;j++)
		  {
			  if (i % j == 0)
			  {
				  div = true;
				  continue;
			  }
		   }
		  if (div == false)
		  {
			  System.out.print(i+" ");
		  }
		}
	}

}
