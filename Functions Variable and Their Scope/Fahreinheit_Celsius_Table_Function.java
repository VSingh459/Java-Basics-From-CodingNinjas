package tasks;
import java.util.Scanner;

public class Fahreinheit_Celsius_Table_Function {
	
	public static void fahreinheit_Table(int a,int b,int c)
	{
		int cel;
		int p=a;
		
		while (p <= b)
		{
			cel = (int)(5*(p-32))/9;
			System.out.print(p+" ");
			System.out.println(cel);
			p = p+c;
		}
	}

	public static void main(String[] args) {
		
		Scanner Obj = new Scanner(System.in);
		int S = Obj.nextInt();
		int E = Obj.nextInt();
		int W = Obj.nextInt();
		
		fahreinheit_Table(S,E,W);

	}

}
