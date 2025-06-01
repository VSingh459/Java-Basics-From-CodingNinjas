package lectures;
import java.util.Scanner;

public class JaggedArrays123 {

	public static void main(String[] args) {
		
		int B[][] = new int[4][];
		System.out.println(B[0]);
		System.out.println(B);
		//System.out.println(B[0][0]);
		
		for (int i=0;i<B.length;i++)
		{
			B[i] = new int[i+2];
		}
		System.out.println();
		for (int i=0;i<B.length;i++)
		{
			for (int j=0;j<B[i].length;j++)
			{
				System.out.print(B[i][j]);
			}
			System.out.println();
		}
		
		int[][] arr = { { 1, 2 }, { 3, 4 } }; 
	    System.out.println(arr[0][0]+arr[1][1]); 

	}

}
