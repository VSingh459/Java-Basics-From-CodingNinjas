package tasks;
import java.util.Scanner;

public class Reverse_String_Wordwise {
	
	public static String reverse(String str)
	{
		String Out = "";
		int s;
		int e = str.length();
		
		for (int i=str.length()-1;i>=0;i--)
		{
				if (str.charAt(i) == ' ')
				{
					s = i+1;
					while (s != e)
					{
						Out = Out+str.charAt(s);
						s++;
					}
					Out = Out+" ";
					e = i;
				}
		}
		s = 0;
		while (s !=e)
		{
			Out = Out+str.charAt(s);
			s++;
		}
		return Out;
	}

	public static void main(String[] args) {
		
        Scanner Obj = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String s = Obj.nextLine();
		
		String Out1 = reverse(s);
		System.out.println();
		System.out.println(Out1);
		
	}

}
