/* Prdouble the average of three numbers entered by user by creating a class named 'Average' having a
method to calculate and prdouble the average. */

import java.util.*;

class Q9Average
{
	double cal(double a,double b, double c)
	{
		
		double avg = ((a+b+c)/3);
		return avg;
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("\n Enter the Numbers: ");
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		Q9Average a1=new Q9Average();
		System.out.println("\n The Average is : "+String.format("%.2f",a1.cal(a,b,c)));

	}

}