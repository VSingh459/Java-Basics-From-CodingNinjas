/*
* Question: Push All Zeros to the End of the Array
*
* Description:
* You are given an integer array. Your task is to shift all 0s in the array 
* to the end while maintaining the relative order of the non-zero elements.
*
* Input:
* - First line: Integer T (number of test cases)
* For each test case:
* - Line 1: Integer N (size of the array)
* - Line 2: N space-separated integers (array elements)
*
* Output:
* - The array after all 0s have been pushed to the end
*
* Example:
* Input:
* 2
* 7
* 2 0 0 1 3 0 0
* 5
* 0 1 0 3 0
*
* Output:
* 2 1 3 0 0 0 0
* 1 3 0 0 0
*
* Note:
* This approach uses in-place shifting and was written while learning array manipulation.
*/


package assignments;
import java.util.Scanner;

public class Push_Zeros_to_End {
	
	public static void pushZerosAtEnd(int x[])
	{
		int j=0;
		int p=0;
		int count2 = 0;
		for (int i=0;i<x.length;i++)
		{
			if (x[i] != 0)
			{
				count2++;
				j = i;
				p = i-count2;
				
				while (p >= 0)
				{
					x[j-1] = x[j];
					x[j] = 0;
					j--;
					p--;
				}
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
		    pushZerosAtEnd(aa);
			count--;
		}	
		
		

	}

}
