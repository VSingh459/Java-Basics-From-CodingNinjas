package tasks;
import java.util.Scanner;

public class Largest_Row_Column {
	
	public static void largest_Row_Column(int mat[][])
	{
		if (mat.length==0)
		{
			System.out.println("row"+" "+0+" "+Integer.MIN_VALUE);
			return;
		}
		int sum=0;
		int max=Integer.MIN_VALUE;
		int c=0;
		for (int i=0;i<mat.length;i++)
		{
			sum=0;
			for (int j=0;j<mat[i].length;j++)
			{
				sum = sum+mat[i][j];
			}
			if (max < sum)
			{
				max = sum;
				c=i;
			}
			//System.out.print(sum+" ");
		}
		
		sum=0;
		int max1 = Integer.MIN_VALUE;
		System.out.println();
		int k = 0;
		int f=0;
		
		for (int i = 0; i < mat[0].length; i++)
		{
	         sum = 0;
	        for (int j = 0; j < mat.length; j++)
	        {
	            sum = sum+mat[j][i];
	        }
	        if (max1 < sum)
	        {
	        	max1 = sum;
	        	k=i;
	        	//System.out.println(max1);
	        }
	    }
		if (max>max1 || max==max1)
		{
			System.out.println("row"+" "+c+" "+max);
		}
		else 
		{
			System.out.println("column"+" "+k+" "+max1);
			
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
		largest_Row_Column(A2D);
		
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
