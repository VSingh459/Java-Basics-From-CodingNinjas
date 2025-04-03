package Assignments_Lec_6;
import java.util.Scanner;
public class Parallelogram_Coding_Ninjas {

	public static void main(String[] args) {
		
		System.out.println("Enter the Integer");
		Scanner Obj = new Scanner(System.in);
		int n = Obj.nextInt();
		Obj.close();
		
		int x=1;
		int y=1;
		
		while (x <= n)
		{
			y=1;
			while (y <= x-1)
			{
				System.out.print(" ");
				y++;
			}
              
			y=1;
			
			while (y <= n)
			{
				System.out.print("*");
				y++;
			}
			System.out.println();
			x++;
		}

	}

}
