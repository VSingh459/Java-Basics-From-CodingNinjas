package assignments;
import java.util.Scanner;

public class Remove_Character {
	
	public static String remove_Char(String str,char x)
	{
		String s = "";
		for (int i=0;i<str.length();i++)
		{
			if (str.charAt(i) != x)
			{
				s = s+str.charAt(i);
			}
		}
		return s;
	}

	public static void main(String[] args) {
		
		Scanner Obj = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = Obj.nextLine();
		System.out.println("Enter the character");
		char x = Obj.next().charAt(0);
		
		String a = remove_Char(s,x);
		System.out.println(a);

	}

}
