package task;
import java.util.Scanner;

public class Merge_2_Arrays {
	
	public static int[] merge_Sort(int arr1[],int arr2[])
	{
		int j=0;
		int k=0;
		int m[] = new int[arr1.length+arr2.length];
		for (int i=0;i<arr1.length+arr2.length;i++)
		{
			if (j >=arr1.length)
			{
				m[i] = arr2[k];
				k++;
				continue;
			}
			else if (k >=arr2.length)
			{
				m[i] = arr1[j];
				j++;
				continue;
			}
			if (arr1[j] < arr2[k])
			{
				//System.out.println("Hello");
				m[i] = arr1[j];
				j++;
			}
			else if (arr1[j] > arr2[k])
			{
				//System.out.println("Gello");
				m[i] = arr2[k];
				k++;
			}
			else
			{
				//System.out.println("Bello");
				m[i] = arr1[j];
				i++;
				m[i] = arr2[k];
				j++;
				k++;
			}
		}
		return m;
	}

	public static void main(String[] args) {
		
        Scanner Obj = new Scanner(System.in);
		
		System.out.println("Enter the number of  Test cases ");
		
		int t = Obj.nextInt();
		int count = t;
		
		while (count > 0 )
		{
			System.out.println("Enter the size of the 1st array ");
			int size = Obj.nextInt();
			int aa[] = new int[size];
			System.out.println("Enter elements of the 1st array ");
			for (int i=0;i<size;i++)
			{
				aa[i] = Obj.nextInt();
			}
			System.out.println("Enter the size of the 2nd array");
			int size2 = Obj.nextInt();
			int aa1[] = new int[size2];
			System.out.println("Enter the integers of the 2nd array ");
			for (int i=0;i<size2;i++)
			{
				aa1[i] = Obj.nextInt();
			}
			int s[] = new int[size+size2];
		    s = merge_Sort(aa,aa1);
		    System.out.println();
		    for (int i=0;i<size+size2;i++)
		    {
		    	System.out.print(s[i]+" ");
		    }
			count--;
		}	

	}

}
