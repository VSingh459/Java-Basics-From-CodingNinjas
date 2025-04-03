package task;
import java.util.Scanner;

public class Selection_Sort_CodingNinjas {
	
	public static void selectionSort(int x[])
	{
		for (int i=0;i<x.length;i++)
		{
			int min = x[i];
			int index = i;
			for (int j=i;j<x.length;j++)
			{
				if (min > x[j])
				{
					min = x[j];
					index = j;
				}
			}
			int temp = x[i];
			x[i] = min;
			x[index] = temp;
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
		    selectionSort(aa);
			count--;
		}	

	}

}
