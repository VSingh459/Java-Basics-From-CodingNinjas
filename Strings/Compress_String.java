package assignments;
import java.util.Scanner;

public class Compress_String {
	
	public static String compression(String str)
	{
		String r = "";
		int count = 1;
		char c = str.charAt(0);
		r = r+c;
		for (int i=1;i<str.length();i++)
		{
			if (c==str.charAt(i))
			{
				count++;
				//System.out.println(count);
			}
			else
			{
				if (count>1)
					r=r+count;
				r = r+str.charAt(i);
		
				count=1;
			
			}
			
			c = str.charAt(i);
		}
		if (count>1)
			r = r+count;
		
		return r;
	}

	public static void main(String[] args) {
		
		Scanner Obj = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = Obj.nextLine();
		
		String a = compression(s);
		System.out.println(a);

	}

}
