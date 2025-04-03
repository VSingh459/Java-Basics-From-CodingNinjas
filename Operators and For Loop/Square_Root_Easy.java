package assignments;
import java.util.Scanner;

public class Square_Root_Easy {

	public static void main(String[] args) {
		
		System.out.println("Enter the Number");
		Scanner Obj = new Scanner(System.in);
		int n = Obj.nextInt();
		Obj.close();
		
		int start=0;
		int end=n;
		int mid;
		int ans=0;
		
		while (start <= end)
		{
			mid = (start+end)/2;
			//System.out.println("mid = "+mid);
			if (mid*mid==n)
			{
				ans = mid;
				break;
			}
			if (mid*mid < n)
			{
				//System.out.println("H");
				start = mid+1;
				ans=mid;
			}
			else
			{
				//System.out.println("G");
				end = mid-1;
			}
		}
		   System.out.println(ans);
		   

	}

}
