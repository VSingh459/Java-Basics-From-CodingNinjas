/* Problem statement
You have been given an integer array/list(ARR) of size N. It has been
 sorted(in increasing order) and then rotated by some number 'K' (K is greater than 0) in the right hand direction.

Your task is to write a function that returns the value of 'K',
 that means, the index from which the array/list has been rotated.

Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= t <= 10^2
2 <= N <= 10^5
Time Limit: 1 sec
Sample Input 1:
1
6
5 6 1 2 3 4
Sample Output 1:
2
Sample Input 2:
2
5
3 6 8 9 10
4
10 20 30 1
Sample Output 2:
0
3*/

package assignments;

import java.util.Scanner;

public class Check_Array_Rotation {
	
	public static int rotation_Check(int x[])
	{
		if (x.length==0)
			return 0;
		int r = Integer.MIN_VALUE;
		int t = 0;
		for (int i=0;i<x.length;i++)
		{
			if (r < x[i])
			{
				r = x[i];
				t = i;
			}
			if (t == x.length-1)
			{
				return 0;
			}
		}
		return t+1;
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
		    d = rotation_Check(aa);
		    System.out.println();
		    System.out.println("The index of rotation is  = "+d);
			count--;
		}	
	}
}
