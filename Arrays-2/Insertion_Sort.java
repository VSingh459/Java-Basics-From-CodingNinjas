package task;
import java.util.Scanner;

public class Insertion_Sort {
	
	public static void insertion(int x[])
	{
		int temp;
		for (int i=0;i<x.length-1;i++)
		{
			for (int j=i+1;j>0;j--)
			{
				if (x[j] < x[j-1])
				{
					temp = x[j];
					x[j] = x[j-1];
					x[j-1] = temp;
				}
			}
		}
		System.out.println();
		for (int i=0;i<x.length;i++)
		{
			System.out.print(x[i]+" ");
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
		    insertion(aa);
			count--;
		}	

	}

}
