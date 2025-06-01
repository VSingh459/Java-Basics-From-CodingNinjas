package assignments;
import java.util.Scanner;

public class Reverse_Each_Word_2 {
	
	public static String  reverseEachWord(String str)
	{
		String a = "";
		String b[] = str.split(" ");
		String c;
		String d;
		for (int i=0;i<b.length;i++)
		{
			c = b[i];
			d = "";
			for (int j=c.length()-1;j>=0;j--)
			{
				d = d+c.charAt(j);
			}
			a = a + d+  " ";
		}
		return a;
	}

	public static void main(String[] args) {
		
		Scanner Obj = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = Obj.nextLine();
		
		String a = reverseEachWord(s);
		System.out.println(a);

	}

}
