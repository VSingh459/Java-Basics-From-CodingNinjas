package assignments;
import java.util.Scanner;

public class Find_Unique_codingNinjas {
	
	public static int duplicate(int[] x)
	{
		
		for (int i=0;i<x.length;i++)
		{
			int j;
			for  (j=0;j<x.length;j++)
			{
				if (i != j)
				{
					if (x[i]==x[j])
					{
						break;
					}
					
				}
			}
			if (j==x.length)
			{
				return x[i];
			}
		
		}
		return Integer.MAX_VALUE;
		
	}

	public static void main(String[] args) {
		
		System.out.println("Enter the number of  Test cases ");
		Scanner Obj = new Scanner(System.in);
		int t = Obj.nextInt();
		int ans;
		
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
			
			ans = duplicate(aa);
			System.out.println();
			System.out.print(ans);
			count--;
		}	

	}

}
