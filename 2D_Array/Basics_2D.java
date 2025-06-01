package lectures;
import java.util.Scanner;

public class Basics_2D {

	public static void main(String[] args) {
		
		int a2D[][] = new int[3][4];
		System.out.println(a2D[1][2]);
		a2D[2][3] = 15;
		System.out.println(a2D[2][3]);
		
		System.out.println(a2D);
		System.out.println(a2D[0]);
		System.out.println(a2D[1]);
		System.out.println(a2D[0][2]);
		
		System.out.println(a2D.length);
		System.out.println(a2D[0].length);
		
		int mat[][] = new int[0][0];
		
		System.out.println(mat);
		

	}

}
