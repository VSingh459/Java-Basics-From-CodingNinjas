/*
 * Question: Count Pairs with Given Sum
 *
 * Description:
 * You are given an array of integers and a number `s`.
 * Your task is to count the number of pairs of elements in the array
 * that sum up to `s`. A pair (i, j) is considered valid if i < j and
 * x[i] + x[j] == s.
 *
 * Input:
 * The first line contains the number of test cases (T).
 * For each test case:
 *  - Line 1: Integer N, the size of the array.
 *  - Line 2: N space-separated integers (the array elements).
 *  - Line 3: Integer S, the target sum.
 *
 * Output:
 * For each test case, print the number of such valid pairs.
 *
 * Example:
 * Input:
 * 2
 * 5
 * 1 3 6 2 5
 * 5
 * 5
 * 1 2 3 4 5
 * 7
 *
 * Output:
 * 1
 * 2
 *
 * Explanation:
 * - In the first test case, only (3, 2) adds up to 5.
 * - In the second test case, pairs (2, 5) and (3, 4) add up to 7.
 */


package assignments;
import java.util.Scanner;

public class Pair_Sum {
	
	public static int pairSum(int x[],int s)
	{
		//System.out.println(x[4]);
		
		int count = 0;
		for (int i=0;i<x.length-1;i++)
		{
			for (int j=i+1;j<x.length;j++)
			{
				if (x[i]+x[j]==s)
				{
					count++;
					//System.out.println(x[i]+"  "+x[j]);
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
			ans = pairSum(aa,sum);
			System.out.println();
			System.out.println(ans);
			
			
			count--;
		}	

	}

}
