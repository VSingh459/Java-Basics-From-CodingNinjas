package for_Loop;
import java.util.Scanner;

public class Fibonacci_Series {

	public static void main(String[] args) {
		
		System.out.println("Enter the Integer");
		Scanner Obj = new Scanner(System.in);
		int n = Obj.nextInt();
		Obj.close();
		
		if (n == 1)
		{
			System.out.println(0);
			return;
		}
		else if (n == 2)
		{
			System.out.println(1);
			return;
		}
		
		int x1=0;
		int x2 = 1;
		int sum=0;
		
		for (int i=0;i<=n-2;i++)
		{
			sum = x1+x2;
			x1 = x2;
			x2 = sum;
		}
		System.out.println(sum);

	}

}
