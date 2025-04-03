/*
 * Question: Find the Unique Element in an Array
 *
 * Description:
 * You are given an array of integers in which every element occurs twice,
 * except for one element which occurs only once. Your task is to find and return
 * that unique element.
 *
 * Input:
 * The first line contains the number of test cases (T).
 * For each test case:
 *  - Line 1: An integer N (size of the array)
 *  - Line 2: N space-separated integers (array elements)
 *
 * It is guaranteed that:
 *  - The size of the array is odd (since one element appears once and the rest appear twice)
 *
 * Output:
 * For each test case, print the unique element that occurs only once.
 *
 * Example:
 * Input:
 * 2
 * 7
 * 1 2 3 4 3 2 1
 * 5
 * 7 9 7 5 5
 *
 * Output:
 * 4
 * 9
 */


package assignments;
import java.util.Scanner;

public class Find_Unique {
	
	public static int unique(int x[])
	{
		int u,p,flag;
		flag = 1;
		u=0;
		for (int i=0;i<x.length;i++)
		{
			flag = 1;
			p = x[i];
			for (int j=0;j<x.length;j++)
			{
				if (j==i)
				{
					continue;
				}
				if (p==x[j])
				{
					flag = 0;
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
			
			ans = unique(aa);
			System.out.println();
			System.out.print(ans);
			count--;
		}	

	}

}
