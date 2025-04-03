package task;
import java.util.Scanner;

public class Binary_Search_CodingNinjas {
	
	public static int binarySearch(int x[],int y)
	{
		int start=0;
		int end = x.length-1;
		int mid = start;
		
		while (start <= end)
		{
			mid = (start+end)/2;
			
			 if (x[mid] > y)
			{
				end = mid-1;
			}
			 else if (x[mid] < y)
			 {
				 start = mid + 1;
			 }
			 else
			 {
				 return mid;
			 }
		
		}
		return -1;
	}

	public static void main(String[] args) {
		
		Scanner Obj = new Scanner(System.in);
		System.out.println("Enter the size of the array ");
		int size = Obj.nextInt();
		
		int aa[] = new int[size];
		System.out.println("Enter the elements of array");
		for (int i=0;i<size;i++)
		{
			aa[i] = Obj.nextInt();
		}
		System.out.println();
		
		System.out.println("Enter the number of  Test cases ");
		
		int t = Obj.nextInt();
		int ans;
		
		int count = t;
		int k;
		
		while (count > 0 )
		{
			int z;
			System.out.println("Enter the integer to be searched in the array ");
			z = Obj.nextInt();
			k = binarySearch(aa,z);
			System.out.println(k);
			count--;
		}	
		

	}

}
