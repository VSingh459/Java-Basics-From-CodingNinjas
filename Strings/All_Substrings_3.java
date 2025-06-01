package tasks;
import java.util.Scanner;

public class All_Substrings_3 {
	
	public static void printSubstring(String str)
	{
		int n;
		for (int i=1;i<=str.length();i++)
		{
			for (int j=0;j<=str.length()-i;j++)
			{
				n = j+i-1;
				for (int k=j;k<=n;k++)
				{
					System.out.print(str.charAt(k));
				}
				System.out.println();
			}
		}
	}

	public static void main(String[] args) {
		
Scanner Obj = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String s = Obj.nextLine();
		
		printSubstring(s);

	}

}
