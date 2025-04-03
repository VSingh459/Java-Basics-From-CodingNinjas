import java.util.Scanner;
public class Zero_Star_Pattern_CodingNinjas {

	public static void main(String[] args) {
		
		System.out.println("Enter the Integer");
		Scanner Obj = new Scanner(System.in);
		int n = Obj.nextInt();
		Obj.close();
		
		int start, end,mid;
		start=1;
		end= 2*n+1;
		mid = n+1;
		
		for (int i=1;i<=n;i++)
		{
			for (int j=1;j<=2*n+1;j++)
			{
				if (j==start || j==end || j==mid)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(0);
				}
			}
			start++;
			end--;
			System.out.println();
		}

	}

}
