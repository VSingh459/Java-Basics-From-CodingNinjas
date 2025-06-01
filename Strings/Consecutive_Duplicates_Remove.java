package assignments;
import java.util.Scanner;

public class Consecutive_Duplicates_Remove {
	
	public static String removeConsecDuplic(String str)
	{
		char c;
		String A1 = "";
		for (int i=0;i<str.length()-1;i++)
		{
			c = str.charAt(i);
			if (c != str.charAt(i+1))
			{
				A1 = A1+c;	
			}
		}
		
			A1 = A1+str.charAt(str.length()-1);
		
		return A1;
	}

	public static void main(String[] args) {
		
		Scanner Obj = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = Obj.nextLine();
		
		String a = removeConsecDuplic(s);
		System.out.println(a);

	}

}
