package assignments;
import java.util.Scanner;

public class Sort_0_1_CodingNinjas {
	
	public static void sort(int x[])
	{
		int nextZero=0;
		for (int i=0;i<x.length;i++)
		{
			if (x[i]==0)
			{
				int temp = x[nextZero];
				x[nextZero] = x[i];
				x[i] = temp;
				nextZero++;
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
		int ans;
		
		int count = t;
		
		while (count > 0 )
		{
			int sum;
			System.out.println("Enter the size of the array ");
			int size = Obj.nextInt();
			int aa[] = new int[size];
			System.out.println("Enter the elements of array");
			for (int i=0;i<size;i++)
			{
				aa[i] = Obj.nextInt();
			}
			System.out.println();
			sort(aa);
			
			count--;
		}	
		



	}

}
