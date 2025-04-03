package break_Continue;
import java.util.Scanner;

public class Prime_Number_with_break {

	public static void main(String[] args) {
		
		System.out.println("Enter the Integer ");
		Scanner Obj = new Scanner(System.in);
		int n = Obj.nextInt();
		Obj.close();
		
		int d = 2;
		boolean div = false;
		int count = 0;
		
		while (d < n)
		{
			count++;
			if (n % d == 0)
			{
				div = true;
				break;
			}
			d = d+1;
		}
		System.out.println(count);
		if (div)
		{
		   System.out.println("Not Prime");
		}
		else 
		{
			System.out.println("Prime");
		}
	}

}
