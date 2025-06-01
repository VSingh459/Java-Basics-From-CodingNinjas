package lectures;
import java.util.Scanner;

public class Input_Printing_2D {

	public static void main(String[] args) {
		
		System.out.println("Enter the No of row of 2D Array");
		Scanner Obj = new Scanner(System.in);
		int r = Obj.nextInt();
		System.out.println("Enter the No of columns of 2D Array");
		int c = Obj.nextInt();
		
		int A2D[][] = new int[r][c];
		
		System.out.println("Enter the elements of 2d array");
		
		for (int i=0;i<r;i++)
		{
			for (int j=0;j<c;j++)
			{
				A2D[i][j] = Obj.nextInt();
			}
		}
		
		System.out.println();
		
		for (int i=0;i<r;i++)
		{
			for (int j=0;j<c;j++)
			{
				System.out.print(A2D[i][j]+" ");
			}
			System.out.println();
		}

	}

}
