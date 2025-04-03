package assignments;
import java.util.Scanner;

public class Check_Number_Sequence_CodingNinjas {

	public static void main(String[] args) {
		
		System.out.println("Enter the number of integers in the sequence");
		Scanner Obj = new  Scanner(System.in);
		int n = Obj.nextInt();
		int prev = Obj.nextInt();
		int count = 2;
		int current;
		boolean isDec = true;
		
		while (count <= n)
		{
			current = Obj.nextInt();
			count++;
			
			if (current==prev)
			{
				System.out.println("false");
				return;
			}
			if (current <=prev)
			{
				if (isDec==false)
				{
					System.out.println("false");
					return;
				}
			}
			else
			{
				if (isDec== true)
				{
					isDec = false;
				}
			}
			prev = current;
		}
		System.out.println("true");
	}

}
