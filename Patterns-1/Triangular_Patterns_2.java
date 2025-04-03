import java.util.Scanner;
public class Triangular_Patterns_2 {

	public static void main(String[] args) {
		
		System.out.println("Enter the Integer");
		Scanner Obj = new Scanner(System.in);
		int n = Obj.nextInt();
		Obj.close();
		
		int A = 1;
		int x =1;
		int y=1;
		
		while (x <= n)
		{
			y = 1;
			A = x;
			while (y <= x)
			{
				System.out.print(A);
				y++;
				A++;
			}
			System.out.println();
			x++;
		}

	}

}
