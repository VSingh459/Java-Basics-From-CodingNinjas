/*
* Question: Binary Search in a Sorted Array
*
* Description:
* Given a sorted array of integers and a target value, use the binary search algorithm 
* to find the index of the target value in the array.
* If the value is not present, return -1.
*
* Input:
* - First line: Integer N (size of the array)
* - Second line: N space-separated integers (sorted array elements)
* - Third line: Integer T (number of test cases)
* - For each test case: An integer X (value to be searched)
*
* Output:
* - For each test case, print the index of X if found, otherwise print -1
*
* Example:
* Input:
* 5
* 1 3 5 7 9
* 2
* 7
* 2
*
* Output:
* 3
* -1
*/


package task;
import java.util.Scanner;

public class Binary_Search {
	
	public static int binarySearch(int x[],int y)
	{
		int mid;
		int start=0;
		int end = x.length-1;
		mid = (start+end)/2;
		
		while (start <= end)
		{
			//System.out.println("Hello");
			if (x[mid]==y)
			{
				return mid;
			}
			else if (x[mid] > y)
			{
				end = end-1;
				mid = (start+end)/2;
			}
			else
			{
				System.out.println("Hello");
				start = mid+1;
				mid = (start+end)/2;
			}
			
			 if (start > x.length-1 )
			{
				return -1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		
		Scanner Obj = new Scanner(System.in);
		System.out.println("Enter the size of the array ");
		int size = Obj.nextInt();
		
		int aa[] = new int[size];
		System.out.println("Enter the elements of array");
		for (int i=0;i<size;i++)
		{
			aa[i] = Obj.nextInt();
		}
		System.out.println();
		
		System.out.println("Enter the number of  Test cases ");
		
		int t = Obj.nextInt();
		int ans;
		
		int count = t;
		int k;
		
		while (count > 0 )
		{
			int z;
			System.out.println("Enter the integer to be searched in the array ");
			z = Obj.nextInt();
			k = binarySearch(aa,z);
			System.out.println(k);
			count--;
		}	
		

	}

}
