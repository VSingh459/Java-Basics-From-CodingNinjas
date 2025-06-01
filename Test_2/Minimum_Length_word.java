import java.util.Scanner;
public class Minimum_Length_word {
	
	public static String minimum_Word(String str)
	{
		String ans = "";
		int min=0;
		String A[] = str.split(" ");
		String c = A[0];
		min = c.length()-1;
		int DD=0;
		
		for (int i=1;i<A.length;i++)
		{
			c = A[i];
			if ((c.length()-1) < min)
			{
				min = c.length()-1;
				DD = i;
			}
			
		}
		ans = A[DD];
		
		return ans;
		
	}
	public static void main(String[] args) {
		
		Scanner Obj = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = Obj.nextLine();
		
		String a = minimum_Word(s);
		System.out.println(a);

	}

}
