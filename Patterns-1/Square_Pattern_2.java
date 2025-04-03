import java.util.Scanner;

public class Square_Pattern_2 {

	public static void main(String[] args) {
		
		System.out.println("Enter the Integer");
		Scanner Obj = new Scanner(System.in);
		int n = Obj.nextInt();
		Obj.close();
		
		int x=1;
		int y=1;
		
		while (x <= n)
		{
			y = 1;
			while (y <= n)
			{
				System.out.print(y);
				y=y+1;
			}
			System.out.println();
			x++;
		}

	}

}
