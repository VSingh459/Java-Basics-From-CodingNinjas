package assignments;

import java.util.Scanner;

public class Find_Duplicate_CodingNinjas {
	
	public static int duplicate(int arr[])
	{
		for (int i=0;i<(arr.length-1);++i)
		{
			for (int j=i+1;j<arr.length;++j)
			{
				if (arr[i]==arr[j])
				{
					return arr[j];
				}
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
