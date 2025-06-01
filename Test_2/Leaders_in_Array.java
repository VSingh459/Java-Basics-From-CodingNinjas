import java.util.Scanner;
public class Leaders_in_Array {
	
	public static void leaders(int input[])
	{
		int lead= input[0];
		lead = input[input.length-1];
		int ans[] = new int[input.length];
		int cc= 1;
		ans[0] = input[input.length-1];
		
		for (int i=input.length-2;i>=0;i--)
		{
			if (lead < input[i])
			{
				//System.out.print(input[i]+" ");
				
				lead = input[i];
				ans[cc] = input[i];
				cc++;
				
			}
		}
		for (int i=cc-1;i>=0;i--)
		{
			System.out.print(ans[i]+" ");
		}
		
		
		
	
		
	}

	public static void main(String[] args) {
		
		Scanner Obj = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = Obj.nextInt();
		System.out.println("Enter the array");
		int a[] = new int[size];
		
		for (int i=0;i<size;i++)
		{
			a[i] = Obj.nextInt();
		}
		leaders(a);

	}

}
