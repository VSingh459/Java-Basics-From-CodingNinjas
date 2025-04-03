/*
 * Question: Find the intersection of two arrays
 * 
 * Description:
 * Given two integer arrays, print their intersection.
 * That is, print all the elements that are present in both arrays.
 * The output should maintain the order of elements from the first array,
 * and for each element, match its frequency in both arrays.
 * 
 * Input:
 * First line contains the number of test cases (T)
 * For each test case:
 *  - Line 1: Size of 1st array
 *  - Line 2: Elements of 1st array
 *  - Line 3: Size of 2nd array
 *  - Line 4: Elements of 2nd array
 * 
 * Output:
 * For each test case, print the intersection elements separated by space.
 * 
 * Example:
 * Input:
 * 2
 * 6
 * 2 6 8 5 4 3
 * 4
 * 2 3 4 7
 * 2
 * 10 10
 * 1
 * 10
 * 
 * Output:
 * 2 4 3 
 * 10
 * 
 */


package assignments;
import java.util.Scanner;

public class Array_intersection_CodingNinjas {
	
	public static void intersection(int x1[],int x2[])
	{
		for (int i=0;i<x1.length;i++)
		{
			for (int j=0;j<x2.length;j++)
			{
				if (x1[i]==x2[j])
				{
					System.out.print(x1[i]+" ");
					x2[j] = Integer.MIN_VALUE;
					break;
				}
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {
		
		System.out.println("Enter the number of  Test cases ");
		Scanner Obj = new Scanner(System.in);
		int t = Obj.nextInt();
		int ans;
		
		int count = t;
		
		while (count > 0 )
		{
			System.out.println("Enter the size of the 1st array ");
			int size = Obj.nextInt();
			int aa[] = new int[size];
			System.out.println("Enter the elements of the 1st array");
			for (int i=0;i<size;i++)
			{
				aa[i] = Obj.nextInt();
			}
			
			System.out.println("Enter the size of the 2nd array ");
			int size1 = Obj.nextInt();
			int aa1[] = new int[size1];
			System.out.println("Enter the elements of the 2nd array");
			for (int i=0;i<size1;i++)
			{
				aa1[i] = Obj.nextInt();
			}
			
			intersection(aa,aa1);
			count--;
		}	

	}

}
