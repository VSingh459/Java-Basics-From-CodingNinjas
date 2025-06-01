package assignments;
import java.util.Scanner;

public class Highest_Occuring_Char {
	
	public static char top_Occurence(String str)
	{
		char x = ' ';
		int count=0;
		int p[] = new int[str.length()];
		
		for (int i=0;i<str.length();i++)
		{
			x = str.charAt(i);
			count = 0;
			for (int j=i;j<str.length();j++)
			{
				if (x==str.charAt(j))
				{
					count++;
				}
			}
			p[i] = count;
		}
		int h=0;
		int max = p[0];
		for (int i=1;i<p.length;i++)
		{
			if (p[i] > max)
			{
				max = p[i];
				h = i;
			}
		}
		x = str.charAt(h);
		
		return x;
	}

	public static void main(String[] args) {
		
		Scanner Obj = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = Obj.nextLine();
		
		char a = top_Occurence(s);
		System.out.println(a);

	}

}
