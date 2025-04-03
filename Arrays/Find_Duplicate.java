/*
 * Question: Find the Duplicate Number in an Array
 *
 * Description:
 * You are given an array of integers where exactly one number is repeated.
 * Your task is to find and return the duplicate number.
 *
 * Input:
 * The first line contains the number of test cases (T).
 * For each test case:
 *  - Line 1: An integer N (size of the array)
 *  - Line 2: N space-separated integers (array elements)
 * 
 * It is guaranteed that:
 *  - Each array contains exactly one duplicate
 *  - All other elements are unique
 * 
 * Output:
 * For each test case, print the duplicate element.
 * 
 * Example:
 * Input:
 * 2
 * 5
 * 1 3 4 2 2
 * 6
 * 0 1 5 4 3 5
 * 
 * Output:
 * 2
 * 5
 */


package assignments;
import java.util.Scanner;

public class Find_Duplicate {
	
	public static int duplicate(int x[])
	{
		int u,p,flag;
		flag = 1;
		u=0;
		for (int i=0;i<x.length;i++)
		{
			flag = 0;
			p = x[i];
			for (int j=0;j<x.length;j++)
			{
				if (j==i)
				{
					continue;
				}
				if (p==x[j])
				{
					flag = 1;
				}
			}
			if (flag==1)
			{
				u=p;
			}
		}
		return u;
		
	}

	public static void main(String[] args) {
		
		System.out.println("Enter the number of  Test cases ");
		Scanner Obj = new Scanner(System.in);
		int t = Obj.nextInt();
		int ans;
		
		int count = t;
		
		while (count > 0 )
		{
			System.out.println("Enter the size of the array ");
			int size = Obj.nextInt();
			int aa[] = new int[size];
			System.out.println("Enter the elements of array");
			for (int i=0;i<size;i++)
			{
				aa[i] = Obj.nextInt();
			}
			
			ans = duplicate(aa);
			System.out.println();
			System.out.print(ans);
			count--;
		}	

	}

}
