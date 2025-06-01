package assignments;
import java.util.Scanner;

public class Highet_Occuring_Characters {
	
	public static char highest_Char(String str)
	{
		char c = ' ';
		int x[] = new int[127];
		for (int i=0;i<str.length();i++)
		{
			x[str.charAt(i)]++;
		}
		int h=0;
		int max = -1;
		for (int i=0;i<str.length();i++)
		{
			if (x[str.charAt(i)] > max)
			{
				max = x[str.charAt(i)];
				c = str.charAt(i);
			}
		}
		
		
		return c;
	}

	public static void main(String[] args) {
		
		Scanner Obj = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = Obj.nextLine();
		
		char a = highest_Char(s);
		System.out.println(a);

	}

}
