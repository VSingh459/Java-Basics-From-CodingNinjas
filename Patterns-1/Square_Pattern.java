// Print the following pattern for the given N number of rows.

// Pattern for N=4
// 4444
// 4444
// 4444
// 4444

import java.util.Scanner;
public class Square_Pattern {

	public static void main(String[] args) {
		
		 System.out.println("Enter the Integer");
		
		Scanner Obj = new Scanner(System.in);
		int n = Obj.nextInt();
		Obj.close();
		
		int x = 0;
		
		while (x < n)
		{
			int y = 0;
			while (y < n)
			{
				System.out.print(n);
				y = y+1;
			}
			System.out.println();
			x = x+1;
		  
		}

	}

}
