
/*
 * Print the following pattern for n = 4:
 *
 * 1
 * 12
 * 123
 * 1234
 */


package While_Loops;

public class Pattern_1 {

	public static void main(String[] args) {
		
		int n = 4;
		int i=1;
		while (i <= n)
		{
			int j=1;
			while (j <= i)
			{
				System.out.print(j);
				j = j+1;
			}
			System.out.println();
			i = i+1;
		}

	}

}
