// Sum_of_Even_Digits Sum_of_Odd_Digits

// (Print first even sum and then odd sum separated by space)
 //   Constraints
//    0 <= N <= 10^8
//     Sample Input 1:
//     1234
//     Sample Output 1:
//     6 4
//     Sample Input 2:
//     552245
//     Sample Output 2:
//     8 15
package Lecture4_Assignments;
import java.util.Scanner;

public class Sum_of_Even_Odd {

	public static void main(String[] args) {
		
		// System.out.println("Enter the Integer");
		
		Scanner Obj = new Scanner(System.in);
		int x = Obj.nextInt();
		Obj.close();
		
		int count = 0;
		int num = x;
		
		while (num !=0)
		{
			num = num/10;
			count = count+1;
		}
		// System.out.println(count);
		
		int R,E,Odd,B;
		E = 0;
		Odd = 0;
		B = x;
		
		while (count > 0)
		{
			R = B%10;
			if (R%2 == 0)
			{
				E = E+R;
			}
			else 
			{
				Odd = Odd + R;
			}
			count = count-1;
			B = B/10;
		}
		System.out.println(E+" "+Odd);
		
			
	}

}
