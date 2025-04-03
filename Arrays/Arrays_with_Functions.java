package lectures;
import java.util.Scanner;

public class Arrays_with_Functions {
	
	public static void increment(int x[])
	{
		x = new int[5];
		for (int i=0;i<x.length;i++)
		{
			x[i]++;
		}
	}

	public static void main(String[] args) {
		
		System.out.println("Enter the size of the array ");
		Scanner Obj = new Scanner(System.in);
		int size = Obj.nextInt();
		int aar[] = new int[size];
		System.out.println("Enter the elements of the array");
		for (int i=0;i<size;i++)
		{
			aar[i] = Obj.nextInt();
		}
		
		increment(aar);
		System.out.println();
		
		for (int i=0;i<size;i++)
		{
			System.out.print(aar[i]+" ");
		}
		
		
		

	}

}
