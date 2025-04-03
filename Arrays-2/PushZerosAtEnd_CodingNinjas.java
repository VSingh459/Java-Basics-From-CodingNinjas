package assignments;
import java.util.Scanner;

public class PushZerosAtEnd_CodingNinjas {
	
	public static void pushZerosAtEnd(int x[])
	{
		int count = 0;
		for (int i=0;i<x.length;i++)
		{
			if (x[i] != 0)
			{
			   int temp = x[i];
			   x[i] = x[count];
			   x[count] = temp;
			   count++;
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
		    pushZerosAtEnd(aa);
			count--;
		}	
		

	}

}
