package tasks;
import java.util.Scanner;


public class Fibonacci_function {
	
	public static boolean fibonacci1(int a)
	{
		
		if (a == 1)
		{
			return true;
		}
		else if (a == 2)
		{
			return true;
		}
		
		int x1=0;
		int x2 = 1;
		int sum=0;
		
		for (int i=0;i<=a;i++)
		{
			sum = x1+x2;
			x1 = x2;
			x2 = sum;
			if (sum==a)
				break;
		}
		if (sum==a)
			return true;
		else
			return false;

	}

	public static void main(String[] args) {
		
		System.out.println("Enter the Integer");
		Scanner Obj = new Scanner(System.in);
		int n = Obj.nextInt();
		Obj.close();
		
		boolean KK;
		KK = fibonacci1(n);
		System.out.println(KK);
	

	}

}
