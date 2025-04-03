/*
 * Question: Count Triplets with Given Sum
 * 
 * Description:
 * Given an array of integers and a target sum `s`, find the number of triplets 
 * (i, j, k) such that i < j < k and x[i] + x[j] + x[k] == s.
 * 
 * Input:
 * The first line contains the number of test cases (T).
 * For each test case:
 *  - Line 1: Integer N (size of the array)
 *  - Line 2: N space-separated integers (array elements)
 *  - Line 3: Integer S (target sum)
 * 
 * Output:
 * For each test case, print the number of valid triplets.
 * 
 * Example:
 * Input:
 * 2
 * 5
 * 1 2 3 4 5
 * 9
 * 4
 * 1 1 1 1
 * 3
 * 
 * Output:
 * 2
 * 4
 * 
 * Explanation:
 * - For the first case: (1,3,5) and (2,3,4) are valid.
 * - For the second case: all 4 possible triplets of 1s sum to 3.
 */


package assignments;
import java.util.Scanner;

public class Triplet_Sum {
	
	public static int triplet(int x[],int s)
	{
		int count = 0;
		for (int i=0;i<x.length;i++)
		{
			for (int j=i+1;j<x.length;j++)
			{
				for (int k=j+1;k<x.length;k++)
				{
					if (x[i]+x[j]+x[k]==s)
					{
						count++;
					}
				}
			}
		}
		return count;
		
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
			System.out.println("Enter the sum");
			sum = Obj.nextInt();
			System.out.println();
			ans = triplet(aa,sum);
			System.out.println();
			System.out.println(ans);
			
			
			count--;
		}	

	}

}
