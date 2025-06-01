package assignments;
import java.util.Scanner;

public class Print_Spiral {
	
	public static void print_Spiral(int mat[][])
	{
		if (mat.length==0)
		{
			return;
		}
		int c=mat.length-1;
		int m= mat.length*mat[c].length;
		int count=0;
		int minR=0;
		int minC=0;
		int maxR=mat.length-1;
		int maxC = mat[0].length-1;
		
//		while (count < m)
//		{
//			// Left wall
//		    for (int i=minR,j=minC;i<=maxR && count<m;i++)
//		    {
//		    	System.out.print(mat[i][j]+" ");
//		    	count++;
//		    }
//		    minC++;
//		    // Bottom wall
//		    
//		    for (int i=maxR,j=minC;j<=maxC && count<m;j++)
//		    {
//		    	System.out.print(mat[i][j]+" ");
//		    	count++;
//		    }
//		    maxR--;
//		    // Right Wall
//		    for (int i=maxR,j=maxC;i>=minR && count<m;i--)
//		    {
//		    	System.out.print(mat[i][j]+" ");
//		    	count++;
//		    }
//		    maxC--;
//		    // Top Wall
//		    for (int i=minR,j=maxC;j>=minC && count<m;j--)
//		    {
//		    	System.out.print(mat[i][j]+" ");
//		    	count++;
//		    }
//		    minR++;
//		}
		
		while(count<m)
		{
			// Top Wall
			for (int i=minR,j=minC;j<=maxC && count<m;j++)
			{
				System.out.print(mat[i][j]+" ");
				count++;
			}
			minR++;
			// Right Wall
			for (int i=minR,j=maxC;i<=maxR && count<m;i++)
			{
				System.out.print(mat[i][j]+" ");
				count++;
			}
			maxC--;
			// Bottom Wall
			for (int i=maxR,j=maxC;j>=minC && count<m;j--)
			{
				System.out.print(mat[i][j]+" ");
				count++;
			}
			maxR--;
			for (int i=maxR,j=minC;i>=minR && count<m;i--)
			{
				System.out.print(mat[i][j]+" ");
				count++;
			}
			minC++;
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
		print_Spiral(A2D);

	}

}
