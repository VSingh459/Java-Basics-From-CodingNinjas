/*
* Question: Arrange Numbers in a Specific Pattern
* 
* Description:
* Given an integer N, fill an array of size N such that:
* - All odd numbers from 1 to N appear in the beginning (in increasing order)
* - All even numbers from 1 to N appear in the end (in decreasing order)
*
* Input:
* The first line contains the number of test cases (T).
* For each test case:
* - Line 1: Integer N (size of the array)
*
* Output:
* For each test case, print the arranged array.
*
* Example:
* Input:
* 2
* 7
* 4
*
* Output:
* 1 3 5 7 6 4 2
* 1 3 4 2
*/


package task;

import java.util.Scanner;

public class Arrange_Numbers {
	
	public static void arrange(int a[],int n)
	{
		int c = 0;
		for (int i=1;i<=n;i++)
		{
			if (i%2 == 1)
			{
				a[c] = i;
				c++;
			}
		}
		for (int i=n;i>0;i--)
		{
			if (i%2 == 0)
			{
				a[c] = i;
				c++;
			}
		}
		for (int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
	}

	public static void main(String[] args) {
		
		System.out.println("Enter the number of  Test cases ");
		Scanner Obj = new Scanner(System.in);
		int t = Obj.nextInt();
		
		int k = 0;
		int result[] = new int[t];
		int count = t;
		int cc;
		
		while (count > 0 )
		{
			System.out.println("Enter the size of the array ");
			int size = Obj.nextInt();
			int aa[] = new int[size];
			System.out.println("Enter the elements of array");
			
			arrange(aa,size);
			count--;
		}
		
		

	}

}
