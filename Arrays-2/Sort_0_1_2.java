/*
* Question: Sort an Array of 0s, 1s and 2s (Dutch National Flag Problem)
*
* Description:
* Given an array consisting only of 0s, 1s, and 2s, sort the array in-place so that
* all 0s come first, then all 1s, and then all 2s. Do not use any sorting algorithm.
* Use constant extra space and linear time.
*
* Input:
* - First line: Integer T (number of test cases)
* For each test case:
* - Line 1: Integer N (size of the array)
* - Line 2: N space-separated integers (only 0s, 1s, 2s)
*
* Output:
* - Sorted array in a single line for each test case
*
* Example:
* Input:
* 2
* 6
* 0 1 2 0 2 1
* 5
* 2 2 1 0 0
*
* Output:
* 0 0 1 1 2 2
* 0 0 1 2 2
*
* Note:
* This code uses three pointers (low, mid, high) to sort the array in one pass.
*/


package assignments;
import java.util.Scanner;

public class Sort_0_1_2 {
	
	public static void sort(int x[])
	{
		int H = x.length-1;
		int M = 0;
		int L = 0;
		int A;
		int temp;
		
		while (M <= H)
		{
			A = x[M];
			if (A==0)
			{
				temp = x[M];
				x[M] = x[L];
				x[L] = temp;
				M++;
				L++;
			}
			else if (A==1)
			{
				M++;
			}
			else
			{
				temp = x[M];
				x[M] = x[H];
				x[H] = temp;
				H--;
			}
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
			int d;
		    sort(aa);
		    System.out.println();
			count--;
		}	

	}

}
