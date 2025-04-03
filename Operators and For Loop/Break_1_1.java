package break_Continue;


public class Break_1_1 {

	public static void main(String[] args) {
		
		int n = 4;
		int x=1;
		int y=0;
		
		while (x<=n)
		{
			y=1;
			while (y<=n)
			{
				System.out.print(y+" ");
				y++;
				if ( y > x)
				{
					break;
				}
			}
			System.out.println();
			x++;
		}

	}

}
