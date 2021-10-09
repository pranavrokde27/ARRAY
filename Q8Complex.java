/*8. Print the average of three numbers entered by user by creating a class named 'Average' having a
method to calculate and print the average.*/
import java.util.Scanner;
class Q8Complex
{
float a;
float b;
float c;
int avg;
public void  averageofnumber(float a,float b,float c)
{
	this.a=a;
	this.b=b;
	this.c=c;
}
int total()
{
	avg=(int)((this.a+this.b+this.c)/3);
	return avg;
}
}
class Average
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the first number");
		float a=sc.nextFloat();
		System.out.println("Enter the second number");
		float b=sc.nextFloat();
		System.out.println("Enter the third number");
		float c=sc.nextFloat();
		Q8Complex ab=new Q8Complex();
		ab.averageofnumber(a,b,c);
		System.out.println("The average of the three number is:"+ab.total());
	}
}

		
	