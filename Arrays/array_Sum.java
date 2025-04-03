package task;
import java.util.Scanner;

public class array_Sum {
	
	
	public static int sum(int a[])
	{
		int suma=0;
		int s = a.length;
		for (int i=0;i<s;i++)
		{
			suma = suma+a[i];
		}
		
		return suma;
	}
	
	public static void print(int input[])
	{
		int s = input.length;
		System.out.println();
		for (int i=0;i<s;i++)
		{
			System.out.print(input[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		
		//System.out.println("Enter the number of  Test cases ");
		Scanner Obj = new Scanner(System.in);
		int t = Obj.nextInt();
		
		int k = 0;
		int result[] = new int[t];
		int count = t;
		
		while (count > 0 )
		{
			//System.out.println("Enter the size of the array ");
			int size = Obj.nextInt();
			int aa[] = new int[size];
			//System.out.println("Enter the elements of array");
			for (int i=0;i<size;i++)
			{
				aa[i] = Obj.nextInt();
			}
			result[k] = sum(aa);
			count--;
			k++;
		}
		for (int i=0;i < t;i++)
		{
			System.out.println(result[i]);
		}
		
	}

}
