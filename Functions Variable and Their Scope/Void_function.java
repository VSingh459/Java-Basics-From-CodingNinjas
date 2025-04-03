package lectures;
import java.util.Scanner;

public class Void_function {
	
	public static void print1toN(int n)
	{
		if (n < 0)
			return;
		
		for (int i=1;i<=n;i++)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		return;
	}

	public static void main(String[] args) {
		
		System.out.println("Enter the value of N");
		Scanner Obj = new Scanner(System.in);
		int n = Obj.nextInt();
		Obj.close();
		
		print1toN(n);

	}

}
