/*
 * Question:
 * Write a Java program to convert a given decimal number into its binary equivalent.
 * 
 * Requirements:
 * - The user will input a positive decimal number.
 * - The program should convert it to binary without using built-in conversion methods.
 * - The binary number should be printed in the correct order, including any leading zeroes
 *   that were ignored in the reverse-building process.
 * 
 * Note:
 * - Do not use Integer.toBinaryString() or similar built-in functions.
 * - Use mathematical operations to calculate the binary and display it correctly.
 */


package assignments;
import java.util.Scanner;

public class Decimal_to_Binary {

	public static void main(String[] args) {
		
		System.out.println("Enter the Number");
		Scanner Obj = new Scanner(System.in);
		long n = Obj.nextInt();
		Obj.close();
		
		long x = n;
		long rem;
		long dec = 0;
		int count=0;
		int flag = 0;
		
		while (x > 0)
		{
			rem = x % 2; 
			dec = dec*10+rem;
			x = x/2;
			if (rem==1)
			{
				flag=1;
			}
			if (rem==0 && flag==0)
			{
				count++;
			}
		}
		//System.out.println(dec);
		x=dec;
		rem=0;
		long rev=0;
		while (x != 0)
		{
			rem = x % 10;
			rev = rev*10+rem;
			x = x/10;
		}
		for (int i=0;i<count;i++)
		{
			rev= rev*10;
		}
		System.out.println(rev);

	}

}
