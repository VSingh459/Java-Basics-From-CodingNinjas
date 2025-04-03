package task;
import java.util.Scanner;

public class Linear_Search {
	
	public static int linear(int a[],int x)
	{
		int s = a.length;
		int m;
		for (int i=0;i<s;i++)
		{
			if (a[i] == x)
			{
				m = i;
				return m;
			}
		}
		return -1;
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
		
		System.out.println("Enter the number of  Test cases ");
				Scanner Obj = new Scanner(System.in);
				int t = Obj.nextInt();
				
				int k = 0;
				int result[] = new int[t];
				int count = t;
				int cc;
				
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
					System.out.println("Enter the element to be searched in array");
					cc = Obj.nextInt();
					result[k] = linear(aa,cc);
					count--;
					k++;
				}
				for (int i=0;i < t;i++)
				{
					System.out.println(result[i]);
				}
				
	}

}
