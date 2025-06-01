package tasks;
import java.util.Scanner;

public class Row_Wise_Sum {
	
	public static void row_Sum(int[][] mat)
	{
		int sum=0;
		for (int i=0;i<mat.length;i++)
		{
			sum=0;
			for (int j=0;j<mat[i].length;j++)
			{
				sum = sum+mat[i][j];
			}
			System.out.print(sum+" ");
		}
		
	}

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
		row_Sum(A2D);
		
//		System.out.println();
//		
//		for (int i=0;i<r;i++)
//		{
//			for (int j=0;j<c;j++)
//			{
//				System.out.print(A2D[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		

	}

}
