package Assignments_Lec_6;
import java.util.Scanner;
public class Sum_Pattern_Coding_Ninjas {

	public static void main(String[] args) {
		
		System.out.println("Enter the Integer");
		Scanner Obj = new Scanner(System.in);
	    int n = Obj.nextInt();
	    Obj.close();
	    
	    int x=1;
	    int y=1;
	    int sum = 0;
	    
	    while (x <= n)
	    {
	    	y=1;
	    	sum=sum+x;
	    	
	    	while (y <= x)
	    	{
	    		System.out.print(y);
	    		if (y == x)
	    		{
	    			System.out.print("=");
	    		}
	    		else
	    		{
	    			System.out.print("+");
	    		}
	    		y++;
	    	}
	    	
	    	System.out.println(sum);
	    	x++;
	    	
	    }
	}
}
