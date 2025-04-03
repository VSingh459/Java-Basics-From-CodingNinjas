package break_Continue;

public class Continue_1_1 {

	public static void main(String[] args) {
		
		int n=10;
		int i=1;
		
		while (i <=n)
		{
			System.out.println("Good");
			if (i==5)
			{
				
				continue;
			}
			System.out.print(i+" ");
			i++;
		}
		
		System.out.println();
		

	}

}
