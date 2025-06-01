package assignments;
import java.util.Scanner;

public class Reverse_Each_Word {
	
	public static String reverse_Word(String str)
	{		
		String a = "";
		int start;
		int end = 0;
		for (int i=0;i<str.length();i++)
		{
			if (str.charAt(i)==' ')
			{
				start = i-1;
				while (start >=end)
				{
					a = a+str.charAt(start);
					start--;
				}
				a = a+' ';
				end = i+1;
			}
		}
		
		for (int i=str.length()-1;i>=end;i--)
		{
			a = a+str.charAt(i);
		}
		
//		String a = "";
//		String b = "";
//		int start = 0;
//		int end = 0;
//		for (int i=0;i<str.length();i++)
//		{
//			if (str.length() != ' ')
//			{
//				a = str.charAt(i)+a;
//			}
//			else
//			{
//				a = a+" ";
//			}
//			b = b+a;
//		}
		
		
		return a;
	}

	public static void main(String[] args) {
		
		Scanner Obj = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = Obj.nextLine();
		
		String a = reverse_Word(s);
		System.out.println(a);
		System.out.println(a.length());
		System.out.println(s.length());

	}

}
