package assignments;
import java.util.Scanner;

public class Second_Largest_2 {
	
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
			e = x[0];
			for (int j=1;j<x.length;j++)
			{
				if (e==x[j])
				{
					count++;
				}
			}
		
		if (count==x.length-1)
		{
			return Integer.MIN_VALUE;
		}
		
		int large = Integer.MIN_VALUE;
		for (int i=0;i<x.length;i++)
		{
			if (large < x[i])
			{
				large = x[i];
			}
		}
		System.out.println("Large = "+large);
		int s1 = Integer.MIN_VALUE;
		for (int i=0;i<x.length;i++)
		{
			if (s1 < x[i] && x[i] != large)
			{
				s1 = x[i];
			}
			
		}
		
		return s1;

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
