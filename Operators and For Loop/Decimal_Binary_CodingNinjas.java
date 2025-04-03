package assignments;
import java.util.Scanner;

public class Decimal_Binary_CodingNinjas {

	public static void main(String[] args) {
		
		System.out.println("Enter the Number");
		Scanner Obj = new Scanner(System.in);
		long n = Obj.nextInt();
		Obj.close();
		
		long binary=0;
		long pow=1;
		long lastbit;
		
		while (n > 0)
		{
			lastbit = n % 2;
			binary = binary+lastbit*pow;
			pow = pow*10;
			n = n/2;
		}
		System.out.println(binary);
	}
}
