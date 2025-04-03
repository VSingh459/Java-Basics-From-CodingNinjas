package task;
import java.util.Scanner;

public class Swap_Alternate {
	
	public static void alternate(int x[])
	{
		int alt;
		for (int i=0;i<x.length-1;i++)
		{
			if (i%2==0)
			{
				alt = x[i+1];
				x[i+1] = x[i];
				x[i] = alt;	
			}
		}
		for (int i=0;i<x.length;i++)
		{
			System.out.print(x[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		
		System.out.println("Enter the number of  Test cases ");
		Scanner Obj = new Scanner(System.in);
		int t = Obj.nextInt();
		
		int count = t;
		
		while (count > 0 )
		{
			System.out.println("Enter the size of the array ");
			int size = Obj.nextInt();
			int aa[] = new int[size];
			System.out.println("Enter the elements of array");
			for (int i=0;i<size;i++)
			{
				aa[i] = Obj.nextInt();
			}
			alternate(aa);
			count--;
		}
		
		
		

	}

}
