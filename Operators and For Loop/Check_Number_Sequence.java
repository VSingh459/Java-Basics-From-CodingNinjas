package assignments;
import java.util.Scanner;

/*Problem statement
You are given S, a sequence of n integers i.e. S = s1, s2, 
..., sn. Compute if it is possible to split S into two parts 
: s1, s2, ..., si and si+1, si+2, ….., sn (0 <= i <= n) in such a
 way that the first part is strictly decreasing while the second is strictly
  increasing one.

Note : We say that x is strictly larger than y when x > y. So, a strictly
 increasing sequence can be 1 4 8. However, 1 4 4 is NOT a strictly increasing
  sequence.


That is, in the sequence if numbers are decreasing, they can start increasing 
at one point. Thereafter, they cannot decrease at any point further.

Sequence made up of only increasing numbers or only decreasing numbers is a valid
 sequence. So, in both the cases, print true.


You just need to print true/false. No need to split the sequence.
Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= n <= 10^7
Sample Input 1 :
5
9
8
4
5
6
Sample Output 1 :
true
Sample Input 2 :
3
1
2
3
Sample Output 2 :
true */

public class Check_Number_Sequence {

	public static void main(String[] args) {
		
		System.out.println("Enter the number of integers in the sequence");
		Scanner Obj = new  Scanner(System.in);
		int n = Obj.nextInt();
		//Scanner Obj1 = new Scanner(System.in);
		//Scanner Obj2 = new Scanner(System.in);
		
		int x,n1,n2,flag,count;
		flag=-1;
		count=1;
		
		n1 = Obj.nextInt();
		
		for (int i=1;i<=n-1;i++)
		{
			n2 = Obj.nextInt();
			 if (n2 > n1)
			 {
				 if (flag==0)
				 {
					 //System.out.println("Counter");
					 count++;
				 }
				 flag = 1;
				 //System.out.println("H");
				 
			 }
			 else if (n1 > n2)
			 {
				 if (flag==1)
				 {
					 count++;
				 }
				 flag = 0;
				 //System.out.println("G");
				 
			 }
			 else
			 {
				 count=3;
			 }
			 n1=n2;
		}
		//System.out.println(flag);
		//System.out.println("Count = "+count);
		if (count==1 || count==2)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		

	}

}
