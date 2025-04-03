/*
* Question: Left Rotate an Array by D Elements
*
* Description:
* Given an integer array and a number D, rotate the array to the left by D positions.
* The rotation should be done in linear time using an extra array.
*
* Input:
* - First line: Integer T (number of test cases)
* For each test case:
* - Line 1: Integer N (size of the array)
* - Line 2: N space-separated integers (array elements)
* - Line 3: Integer D (number of positions to rotate)
*
* Output:
* - The array after left rotation
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
*/


package assignments;
import java.util.Scanner;

public class Left_Rotate_Array {
	
	public static void leftRotate(int x[],int d)
	{
		int rot[] = new int[x.length];
		int pos;
		
		for (int i=0;i<x.length;i++)
		{
			pos = (i+x.length-d)%x.length;
			rot[pos] = x[i];
		}
		
		System.out.println();
		for (int i=0;i<x.length;i++)
		{
			System.out.print(rot[i]+" ");
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
