package tasks;
import java.util.Scanner;

public class All_Substrings {
	
	public static void printSubstring(String str)
	{
		
		for (int i=0;i<str.length();i++)
		{
			for (int j=i+1;j<=str.length();j++)
			{
				System.out.println(str.substring(i,j));
				
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
