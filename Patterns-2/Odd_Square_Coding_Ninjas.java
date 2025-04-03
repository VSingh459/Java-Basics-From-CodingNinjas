package Assignments_Lec_6;
import java.util.Scanner;

public class Odd_Square_Coding_Ninjas {

	public static void main(String[] args) {
		
		System.out.println("Enter the Integer");
		Scanner Obj = new Scanner(System.in);
		int n = Obj.nextInt();
		Obj.close();
		
		int x=1;
		int y=1;
		int Lock= 2*n-1;
		
		
		
		while (x <= n)
		{
			int Value = 2*x-1;
			y = n;
			
			while (y > 0)
			{
				System.out.print(Value);
				Value = Value+2;
				if (Value > Lock)
				{
					Value=1;
				}
			
			    y--;
			}
			System.out.println();
			x++;
		}
		

	}

}
