/*Write a program to calculate the total salary of a person. The user has to enter the basic salary (an integer) and the grade (an uppercase character), depending upon which the total salary is calculated as:

    Total_salary = Basic + HRA + DA + Allow – PF
where :
HRA   = 20% of basic
DA    = 50% of basic
Allow = 1700 if grade = ‘A’
Allow = 1500 if grade = ‘B’
Allow = 1300 if grade = ‘C' or any other character
PF    = 11% of basic.
Round off the total salary and then print the integral part only.


Detailed explanation ( Input/output format, Notes, Images )
Constraints
0<=salary<=10000
Sample Input 1 :
10000 A
Sample Output 1 :
17600
Sample Input 2 :
4567 B
Sample Output 2 :
8762
Explanation of Input 2:
We have been given the basic salary as Rs. 4567. We need to calculate 
the hra, da and pf. 
Now when we calculate each of the, it turns out to be:
hra =  20% of Rs. 4567 = Rs. 913.4
da = 50% od Rs. 4567 = Rs. 2283.5
pf = 11% of Rs. 4567 = Rs. 502.37

Since, the grade is 'B', we take allowance as Rs. 1500.
On substituting these values to the formula of totalSalary, we get Rs. 8761.53 and now rounding it off will result in Rs. 8762 and hence the Answer. */

package Lecture4_Assignments;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Total_Salary {

	public static void main(String[] args) {
		
		System.out.println("Enter the Basic Salary and Grade, seperated by a space only ");
		Scanner Obj = new Scanner(System.in);
		int b = Obj.nextInt();
		// System.out.println("Enter the Grade");
		// Scanner Obj2 = new Scanner(System.in);
		String str = Obj.next();
		Obj.close();
		char g = str.charAt(0);
		
	     double BS = b;
		 
		double h,d,a,p;
		h = (20*BS)/100;
		// System.out.println(h);
		d = (50*BS)/100;
		// System.out.println(d);
		p = (11*BS)/100;
		//System.out.println(p);
		
		if (g == 'A')
		{
			a = 1700.0;
		}
		else if (g == 'B')
		{
			a = 1500.0;
		}
		else
		{
			a = 1300.0;
		}
		
		double T;
		T = BS+h+d+a-p;
		// System.out.println(T);
		
		double R;
		R = Math.round(T);
	
		int TS;
		TS = (int)R;
		System.out.println(TS);
		

	}

}
