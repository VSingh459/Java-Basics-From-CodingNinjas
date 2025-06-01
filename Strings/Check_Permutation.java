package assignments;
import java.util.Scanner;
import java.util.Arrays;

public class Check_Permutation {
	
	public static boolean permutation(String  str1,String str2)
	{
		if (str1.length() != str2.length())
			return false;
		boolean P = true;
		int n1 = str1.length();
		int n2 = str2.length();
		
		char A[] = str1.toCharArray();
		char B[] = str2.toCharArray();
		Arrays.sort(A);
		Arrays.sort(B);
		
		for (int i=0;i<n1;i++)
		{
			if (A[i] != B[i])
			{
				P = false;	
			}
		}
		
		return P;
			
//		boolean f = false;
//		for (int i=0;i<str1.length();i++)
//		{
//			f = false;
//			for (int j=0;j<str2.length();j++)
//			{
//				if (str1.charAt(i)==str2.charAt(j))
//				{
//					f = true;
//				}
//			}
//			if (f == false)
//			{
//				break;
//			}
//		}
//		return f;
//		
	}

	public static void main(String[] args) {
		
		Scanner Obj = new Scanner(System.in);
		System.out.println("Enter the 1st string");
		String s = Obj.nextLine();
		System.out.println("Enter the 2nd String");
		String s1 = Obj.nextLine();
		
		boolean a = permutation(s,s1);
		System.out.println(a);
		
	}

}
