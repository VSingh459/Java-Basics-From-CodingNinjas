package assignments;
import java.util.Scanner;

public class Total_Sum {
	
	public static void totalSum(int mat[][])
	{
		if (mat.length==0)
		{
			System.out.println("row"+" "+0+" "+Integer.MIN_VALUE);
			return;
		}
		int sum=0;
		int max=Integer.MIN_VALUE;
	
		int sum1=0;
		int sum2 =0;
		int sum3=0;
		int total=0;
		int sum4=0;
		int sum5=0;
		int x = mat.length-1;
		int y = mat.length-1;
//		for (int i=0;i<mat.length;i++)
//		{
//			x = y-i;
//			sum = sum+mat[0][i];
//			if (i != 0)
//			{
//				sum1 = sum1+mat[i][0];
//				sum2=sum2+mat[mat.length-1][i];
//			}
//			if (i!= 0 && i != mat.length-1)
//			{
//				sum3=sum3+mat[i][mat.length-1];
//				sum4 = sum4+mat[i][i];
//			}
//			if (i != mat.length-1 && i != 0 && i != x)
//			{
//				sum5 = sum5+mat[i][x];
//			}
//		}
//		total=sum+sum1+sum2+sum3+sum4+sum5;
//		System.out.println(total);
		for (int i=0;i<mat.length;i++)
		{
			x = y-i;
			sum = sum+mat[0][i];
			if (i != 0)
			{
				sum = sum+mat[i][0];
				sum=sum+mat[mat.length-1][i];
			}
			if (i!= 0 && i != mat.length-1)
			{
				sum=sum+mat[i][mat.length-1];
				sum = sum+mat[i][i];
			}
			if (i != mat.length-1 && i != 0 && i != x)
			{
				sum = sum+mat[i][x];
			}
		}
		System.out.println(sum);
		
	}

	public static void main(String[] args) {
		
		System.out.println("Enter the dimensions of a square2D Array");
		Scanner Obj = new Scanner(System.in);
		int r = Obj.nextInt();
		
		int A2D[][] = new int[r][r];
		
		System.out.println("Enter the elements of 2d array");
		
		for (int i=0;i<r;i++)
		{
			for (int j=0;j<r;j++)
			{
				A2D[i][j] = Obj.nextInt();
			}
		}
		System.out.println();
		totalSum(A2D);

	}

}
