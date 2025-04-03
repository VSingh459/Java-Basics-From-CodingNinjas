package assignments;
import java.util.Scanner;

public class Sum_or_Product {

	public static void main(String[] args) {
		
		System.out.println("Enter the of number N and choice C");
		Scanner Obj = new  Scanner(System.in);
		int n = Obj.nextInt();
	
		//Scanner Obj1 = new Scanner(System.in);
		int c = Obj.nextInt();
		
		
		int sum=0;
		int prod = 1;
		
		if (c == 1)
		{
			for (int i=1;i<=n;i++)
			{
				sum = sum+i;
				
			}
			System.out.println(sum);
		}
		else if (c==2)
		{
			for (int i=1;i<=n;i++)
			{
				prod = prod*i;
			}
			System.out.println(prod);
		}
		else
		{
			System.out.println(-1);
		}
	}

}
