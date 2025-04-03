package While_Loops;
import java.util.Scanner;

 // User will enter a number. Our goal is to find out whether the number is prime or not ?

public class Prime_Number {

	public static void main(String[] args) {
		
		System.out.println("Enter the number");
		Scanner Obj = new Scanner(System.in);
		int N;
		N = Obj.nextInt();
		int d = 2;
		
		while (d < N)
		{
			if (N % d == 0)
			{
				System.out.println("The number is not prime");
				return;
			}
			d = d+1;
		}
		System.out.println(N+" is a prime number");

	}

}
