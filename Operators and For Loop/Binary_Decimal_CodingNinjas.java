package assignments;
import java.util.Scanner;

public class Binary_Decimal_CodingNinjas {

	public static void main(String[] args) {
		
		System.out.println("Enter the Number");
		Scanner Obj = new Scanner(System.in);
		int n = Obj.nextInt();
		Obj.close();
		
		int dec,pow,last;
		dec=0;
		pow=1;
		while (n > 0)
		{
			last = n % 10;
			dec = dec+last*pow;
			pow=pow*2;
			n = n/10;
		}
		System.out.println(dec);
		
	}

}
