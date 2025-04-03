import java.util.Scanner;
public class Triangular_Pattern_3 {

	public static void main(String[] args) {
		
		System.out.println("Enter the Integer");
		Scanner Obj = new Scanner(System.in);
		int n = Obj.nextInt();
		Obj.close();
		
		int count = 1;
		int x =1;
		int y=1;
		
		while (x <= n)
		{
			y = 1;
			
			while (y <= x)
			{
				System.out.print(count);
				y++;
				count++;
			}
			System.out.println();
			x++;
		}

	}

}
