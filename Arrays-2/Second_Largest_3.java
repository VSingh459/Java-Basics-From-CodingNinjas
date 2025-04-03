package assignments;

import java.util.Scanner;

public class Second_Largest_3 {
	
	public static int  Second(int[] x)
	{
		if (x.length==0)
		{
			return Integer.MIN_VALUE;
		}
		int L1 = x[0];
		int L2 = Integer.MIN_VALUE;
		
		for (int i=1;i<x.length;i++)
		{
			if (L1 < x[i])
			{
				L2 = L1;
				L1 = x[i];
			}
			else if (L2 < x[i] && x[i] != L1)
			{
				L2 = x[i];
			}
		}
		return L2;

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
		    d = Second(aa);
		    System.out.println();
		    System.out.println("The 2nd largest element in the array is = "+d);
			count--;
		}	

	}

}
