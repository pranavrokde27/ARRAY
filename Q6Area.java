/* Write a program to print the area of a rectangle by creating a class named 'Area' having two methods.
First method named as 'setDim' takes length and breadth of rectangle as parameters and the second
method named as 'getArea' returns the area of the rectangle. Length and breadth of rectangle are
entered through keyboard. */
import java.util.*;
class Q6Area
{
	int len,br, area;
	void setDim(int x, int y)
	{
			len=x;
			br=y;
	}
	int getArea(int a, int b) //formal arguments
	{
		area = a*b; //actual arguments
		return area;
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter the Length : ");
		int l=sc.nextInt();
		System.out.println("\nEnter the Breadth : ");
		int b=sc.nextInt();
		
		Q6Area obj = new Q6Area();
		obj.setDim(l,b);
		
		System.out.println("\nThe Area is : "+obj.getArea(l,b));
	}
}