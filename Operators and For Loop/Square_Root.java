package assignments;
import java.util.Scanner;

public class Square_Root {

	public static void main(String[] args) {
		
		System.out.println("Enter the Number");
		Scanner Obj = new Scanner(System.in);
		int n = Obj.nextInt();
		Obj.close();
		
		int end = n;
		int start =1;
		int mid;
		int ans=0;
		
		
		while (start <= end)
		{
			mid = start+(end-start)/2;
			if (mid <= n/mid)
			{
				ans=mid;
				start = mid+1;
			}
			else
			{
				end = mid-1;
			}
		}
		System.out.println(ans);	
		
	}

}
