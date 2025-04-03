package Tasks;
import java.util.Scanner;

public class Diamond_of_Stars_Coding_Ninjas {

	public static void main(String[] args) {
		
		System.out.println("Enter the Integer");
		Scanner Obj = new Scanner(System.in);
		int n = Obj.nextInt();
		Obj.close();
		
		int x=1;
		int y = 1;
		int k = (n+1)/2;
		int p= n/2;
		System.out.println(p);
		
		
		while (x <= k)
		{
			y=1;
			while (y <= k-x)
			{
				System.out.print(" ");
				y++;
			}
			y = 1;
			
			
			while (y <= 2*x-1)
			{
				System.out.print("*");
				y++;
			}
			
			System.out.println();
			x++;
			
		}
		x= p;
		
		while (x >= 1)
		{
			y=1;
			while (y <= p-x+1)
			{
				System.out.print(" ");
				y++;
			}
			y=1;
			while (y <= 2*x-1)
			{
				System.out.print("*");
				y++;
			}
			System.out.println();
			x--;
		}
		
	}

}
