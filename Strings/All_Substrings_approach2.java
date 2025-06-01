package tasks;
import java.util.Scanner;

public class All_Substrings_approach2 {
	
	public static void printSubstring(String str)
	{
		for (int i=0;i<str.length();++i)
		{
			for (int j=i;j<str.length();++j)
			{
				for (int k=i;k<=j;++k)
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
