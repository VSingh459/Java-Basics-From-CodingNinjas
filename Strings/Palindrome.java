package tasks;
import java.util.Scanner;

public class Palindrome {
	
	public static boolean isPalindrome(String str)
	{
        String r = "";
        int x = str.length()-1;
        int flag = 0;
		
		for (int i=0;i<str.length()/2;i++)
		{
			if (str.charAt(i)==str.charAt(x-i))
			{
				flag = 1;
			}
			else
			{
				flag = 0;
			}
		}
		boolean a;
		if (flag == 1)
			a = true;
		else
			a = false;

		return a;
	}

	public static void main(String[] args) {
		
Scanner Obj = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String s = Obj.nextLine();
		
		boolean b;
		b = isPalindrome(s);
		System.out.println();
		System.out.println(b);

	}

}
