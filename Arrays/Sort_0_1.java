/*
 * Question: Sort an array of 0s and 1s
 * 
 * Description:
 * You are given an array containing only 0s and 1s. Your task is to sort
 * the array so that all 0s come before all 1s. Do this in linear time.
 * 
 * Input:
 * The first line contains the number of test cases (T).
 * For each test case:
 *  - Line 1: Integer N (size of the array)
 *  - Line 2: N space-separated integers (0s and 1s only)
 * 
 * Output:
 * Print the sorted array for each test case.
 * 
 * Example:
 * Input:
 * 2
 * 5
 * 0 1 0 1 0
 * 4
 * 1 1 0 0
 * 
 * Output:
 * 0 0 0 1 1
 * 0 0 1 1
 */


package assignments;
import java.util.Scanner;

public class Sort_0_1 {
	
//	

	public static void sort(int x[])
	{
		int count = 0;
		for (int i=0;i<x.length;i++)
		{
			if (x[i]==0)
			{
				count++;	
			}
		}
		for (int i=0;i<count;i++)
		{
			x[i] = 0;
		}
		for (int i=count;i<x.length;i++)
		{
			x[i] = 1;
		}
	}

	public static void main(String[] args) {
		
		System.out.println("Enter the number of  Test cases ");
		Scanner Obj = new Scanner(System.in);
		int t = Obj.nextInt();
		int ans;
		
		int count = t;
		
		while (count > 0 )
		{
			int sum;
			System.out.println("Enter the size of the array ");
			int size = Obj.nextInt();
			int aa[] = new int[size];
			System.out.println("Enter the elements of array");
			for (int i=0;i<size;i++)
			{
				aa[i] = Obj.nextInt();
			}
			System.out.println();
			sort(aa);
			
			count--;
		}	

	}

}
