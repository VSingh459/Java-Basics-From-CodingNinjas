package lectures;
import java.util.Scanner;

public class Address_Array {
	
	public static void increment(int x[])
	{
		for (int i=0;i<x.length;i++)
		{
			x[i]++;
		}
	}

	public static void main(String[] args) {
		
		Scanner Obj = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = Obj.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the elements of the array ");
		for (int i=0;i<size;i++)
		{
			arr[i] = Obj.nextInt();
		}
		System.out.println();
		System.out.println(arr);
		
		int b = 10;
		System.out.println(b);
		
		increment(arr);
		System.out.println(arr);
		
		for (int i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}

	}

}
