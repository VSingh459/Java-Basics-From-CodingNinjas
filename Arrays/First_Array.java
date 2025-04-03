package lectures;
import java.util.Scanner;

public class First_Array {

	public static void main(String[] args) {
		
		System.out.println("Enter the size of the array");
		Scanner Obj = new Scanner(System.in);
		int size = Obj.nextInt();
		
		
		int aa[] = new int[size];
		for (int i=0;i<size;i++)
		{
			aa[i] = Obj.nextInt();
		}
		System.out.println();
		
		for (int i=0;i<size;i++)
		{
			System.out.print(aa[i]+" ");
		}
		System.out.println();

	}

}
