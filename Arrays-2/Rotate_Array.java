/*
* Question: Left Rotate an Array by D Elements (Naive Approach)
*
* Description:
* Given an integer array and a number D, rotate the array to the left by D positions.
* This solution performs the rotation one element at a time, D times.
*
* Input:
* - First line: Integer T (number of test cases)
* For each test case:
* - Line 1: Integer N (size of the array)
* - Line 2: N space-separated integers (array elements)
* - Line 3: Integer D (number of positions to rotate)
*
* Output:
* - The array after D left rotations
*
* Example:
* Input:
* 2
* 5
* 1 2 3 4 5
* 2
* 4
* 10 20 30 40
* 3
*
* Output:
* 3 4 5 1 2
* 40 10 20 30
*
* Note:
* This is a basic approach using shifting inside a loop.
* More optimized approaches are available for large arrays.
*/


package assignments;
import java.util.Scanner;

public class Rotate_Array {
	
	public static void leftRotate(int x[],int d)
	{
		int j;
		int temp;
		
		for (int i=0;i<d;i++)
		{
			temp = x[0];
			for ( j=0;j<x.length-1;j++)
			{
				x[j] = x[j+1];
			}
			x[j] = temp;
		}
		
		System.out.println();
		for (int i=0;i<x.length;i++)
		{
			System.out.print(x[i]+" ");
		}
		
	}

	public static void main(String[] args) {
		
Scanner Obj = new Scanner(System.in);
		
		System.out.println("Enter the number of  Test cases ");
		
		int t = Obj.nextInt();
		int count = t;
		
		while (count > 0 )
		{
			System.out.println("Enter the size of the array ");
			int size = Obj.nextInt();
			int aa[] = new int[size];
			System.out.println("Enter elements of the array ");
			for (int i=0;i<size;i++)
			{
				aa[i] = Obj.nextInt();
			}
			System.out.println("Enter the numbers of elements which should be rotated");
			int d;
			d = Obj.nextInt();
		    leftRotate(aa,d);
			count--;
		}	

	}

}
