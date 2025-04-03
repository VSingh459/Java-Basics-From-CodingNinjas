package assignments;
import java.util.Scanner;
import java.util.Arrays;

public class Array_Intersection {
	
	public static void intersection(int x1[],int x2[])
	{
		int flag = 0;
		int r[] = new int[x2.length];
		for (int i=0;i<x1.length;i++)
		{
			flag = 0;
			for (int j=0;j<x2.length;j++)
			{
				if (x1[i]==x2[j] && flag==0 && r[j] == 0)
				{
					System.out.print(x1[i]+" ");
					flag = 1;
					r[j] = 1;
				}
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {
		
		System.out.println("Enter the number of  Test cases ");
		Scanner Obj = new Scanner(System.in);
		int t = Obj.nextInt();
		int ans;
		
		int count = t;
		
		while (count > 0 )
		{
			System.out.println("Enter the size of the 1st array ");
			int size = Obj.nextInt();
			int aa[] = new int[size];
			System.out.println("Enter the elements of the 1st array");
			for (int i=0;i<size;i++)
			{
				aa[i] = Obj.nextInt();
			}
			
			System.out.println("Enter the size of the 2nd array ");
			int size1 = Obj.nextInt();
			int aa1[] = new int[size1];
			System.out.println("Enter the elements of the 2nd array");
			for (int i=0;i<size1;i++)
			{
				aa1[i] = Obj.nextInt();
			}
			
			intersection(aa,aa1);
			count--;
		}	
		

	}

}
