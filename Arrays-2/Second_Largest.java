package assignments;
import java.util.Scanner;
import java.util.Arrays;

public class Second_Largest {
	
	public static int  Second(int[] x)
	{
		int s2 = 0;
		int L = Integer.MIN_VALUE;
		int e;
		int count = 0;
		
		if (x.length <= 1)
		{
			return Integer.MIN_VALUE;
		}
		
		for (int i=0;i<1;i++)
		{
			e = x[i];
			for (int j=1;j<x.length;j++)
			{
				if (e==x[j])
				{
					count++;
				}
			}
		}
		if (count==x.length-1)
		{
			return Integer.MIN_VALUE;
		}
		
		int temp;
		for (int i=0;i<x.length;i++)
		{
			for (int j=i;j<x.length;j++)
			{
				if (x[i] < x[j])
				{
					temp = x[i];
					x[i] = x[j];
					x[j] = temp;
				}
			}
		}
		System.out.println();
		for (int i=0;i<x.length;i++)
		{
			System.out.print(x[i]+" ");
		}
		
		for (int i=1;i<x.length;i++)
		{
			if (x[0] != x[i])
			{
				s2 = x[i];
				break;
			}
		}
		return s2;

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

		



