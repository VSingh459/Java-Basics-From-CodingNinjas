package assignments;
import java.util.Scanner;

public class SumOfTwoArrays {
	
	public static void  sum2Arrays(int x1[],int x2[],int Out[])
	{
		int s=0;
		int r;
		int c = 0;
		int OS = Out.length-1;
		int s1 = x1.length-1;
		int s2 = x2.length-1;
		
		for (int i=OS;i>=0;i--)
		{
			if (s1 >= 0)
			{
			s = x1[s1]+c;
			s1--;
			}
			else
			{
				s = c;
			}
			if (s2 >= 0)
			{
				s = s+x2[s2];
				s2--;
			}
			if (s > 9)
			{
				System.out.println("HHH");
				r = s%10;
				c = s/10;
			}
			else
			{
				System.out.println("GGG");
				r = s;
				c = 0;
			}
			Out[i] = r;
		}
		
		System.out.println();
		for (int i=0;i<Out.length;i++)
		{
			System.out.print(Out[i]+" ");
		}
		
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
			System.out.println("Enter the size of the array ");
			int size1 = Obj.nextInt();
			int aa1[] = new int[size1];
			System.out.println("Enter elements of the array ");
			for (int i=0;i<size1;i++)
			{
				aa1[i] = Obj.nextInt();
			}
		    int d;
		    if (size > size1)
		    	d = size;
		    else 
		    	d = size1;
		    int O[] = new int[d+1];
		    
		    sum2Arrays(aa,aa1,O);
		    System.out.println();
			count--;
		}	
	}
}
