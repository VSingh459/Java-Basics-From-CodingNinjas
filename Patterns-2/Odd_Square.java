package Assignments_Lec_6;
import java.util.Scanner;

public class Odd_Square {

	public static void main(String[] args) {
		
		System.out.println("Enter the Integer");
		Scanner Obj = new Scanner(System.in);
		int n = Obj.nextInt();
		Obj.close();
		
		int x=1;
		int y=1;
		int p = 1;
		int k = 1;
		int d= 1;
		int Lock=0;
		
		while (d <= n)
		{
			System.out.print(p);
			d=d+1;
			Lock = p;
			p=p+2;
		}
		System.out.println();
		
		while (x <= n-1)
		{
			y=1;
			p=k+2;
			k=k+2;
			
			while (y <= n)
			{
				System.out.print(p);
				if (p == Lock)
				{
					p=1;
				}
				else
				{
					p=p+2;
				}
				y++;
			}
			System.out.println();
			x++;
		}
		
	}

}
