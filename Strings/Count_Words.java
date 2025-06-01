package tasks;
import java.util.Scanner;

public class Count_Words {
	
	public static int count(String str)
	{
		char s;
		int c = 0;
		int ans;
		if (str.length()==0)
			return 0;
		
		for (int i=0;i<str.length();i++)
		{
			
		
			s = str.charAt(i);
			if (s==' ')
			{
				c++;
			}
		
	}
		ans = c+1;
		return ans;
		
	}
	

	public static void main(String[] args) {
		
Scanner Obj = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String s = Obj.nextLine();
		
		int a;
		a = count(s);
		System.out.println("No of words is = "+a);

	}

}
