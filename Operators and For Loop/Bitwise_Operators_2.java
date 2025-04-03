package Bitwise_Operators;

public class Bitwise_Operators_2 {

	public static void main(String[] args) {
		
		int a,b,c;
		
		a = 34;
		a = a >> 1;
		System.out.println(a);
		b = 34;
		b = b >> 2;
		System.out.println(b);
		c = -4;
		c = c >> 1;
		System.out.println(c);
		c = -4 << 1;
		System.out.println(c);
		
		a = 1;
		++a;
		System.out.println(a);
		System.out.println(a++);
		
		int d = a;
		System.out.println(d);
		
		int e = a++;
		System.out.println(e);
		
		
		

	}

}
