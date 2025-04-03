package task;
import java.util.Scanner;

public class Bubble_Sort {
	
	public static void bubble(int x[])
	{
		int temp;
		for (int i=0;i<x.length;i++)
		{
			for (int j=i;j<x.length;j++)
			{
				if (x[i] > x[j])
				{
					temp = x[i];
					x[i] = x[j];
					x[j] = temp;
				}
			}
		}
		System.out.println();
		for(int i=0;i<x.length;i++)
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
		    bubble(aa);
			count--;
		}	

	}

}
