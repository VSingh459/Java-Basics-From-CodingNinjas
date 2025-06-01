package assignments;
import java.util.Scanner;

public class Print_Wave {
	
	public static void print_Wave(int mat[][])
	{
		if (mat.length==0)
		{
			return;
		}
		int x=0;
		int c=mat.length-1;
		
		for (int i=0;i<mat[c].length;i++)
		{
			if (i%2==0)
			{
				x=0;
			}
			else
			{
				x=mat.length-1;
			}
			for (int j=0;j<mat.length;j++)
			{
				System.out.print(mat[x][i]+" ");
				if (i%2==0)
				{
					x++;
					
				}
				else
				{
					x--;
				}
			}
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
		
		System.out.println();
		print_Wave(A2D);

	}

}
