package Assignments_Lec_6;
import java.util.Scanner;

public class Half_Diamonds_Coding_Ninjas {

	public static void main(String[] args) {
		
		System.out.println("Enter the Integer");
		Scanner Obj = new Scanner(System.in);
		int n = Obj.nextInt();
		Obj.close();
		
		int x =1;
		int y=1;
		
		System.out.println("*");
		
		while (x <= n)
		{
			System.out.print("*");
			y = 1;
			while (y <= x)
			{
				System.out.print(y);
				y++;
			}
			
			y = y-2;
			while (y >=1)
			{
				System.out.print(y);
				y--;
			}
			
			System.out.println("*");
			x++;
		}
		x=1;
		
		while (x <= n-1)
		{
			System.out.print("*");
			y=1;
			while (y <= n-x)
			{
				System.out.print(y);
				y++;
			}

			y= y-2;
			while (y >= 1 )
			{
				System.out.print(y);
				y--;
			}
			System.out.println("*");
			x++;
		}
		System.out.println("*");

	}

}
