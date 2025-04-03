package for_Loop;
import java.util.Scanner;

public class For_Loop_1 {

	public static void main(String[] args) {
		
		System.out.println("Enter the value of N");
		Scanner Obj = new Scanner(System.in);
		int n = Obj.nextInt();
		Obj.close();
		
		int sum=0;
		
		for (int i=0, j=-10; i <=n || j < 0; i++,j++ )
		{
			sum=sum+i+j;
			
		}
		System.out.println(sum);
		
		for(int i = 0; i < 2; i = i + 1) {
		     for(int j = 0; j < 2; j = j + 1) {
		          if (j == 1)
		              break;
		          System.out.print(j +" ");
		      }
		 } 

	}

}
