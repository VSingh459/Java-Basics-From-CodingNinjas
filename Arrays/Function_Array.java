package lectures;
import java.util.Scanner;

public class Function_Array {
	
	public static int[] input_Array()
	{
		System.out.println("Enter the size of the array");
		Scanner Obj = new Scanner(System.in);
		int size = Obj.nextInt();
		System.out.println("Enter the elements of the array ");
		
		int ab[] = new int[size];
		for (int i=0;i<size;i++)
		{
			ab[i] = Obj.nextInt();
		}
		return ab;
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
		
		int arr[] = input_Array();
		print(arr);
	}

}
