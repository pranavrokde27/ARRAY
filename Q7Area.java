/* Write a program to print the area of a rectangle by creating a class named 'Area' taking the values of
its length and breadth as parameters of its constructor and having a method named 'returnArea' which
returns the area of the rectangle. Length and breadth of rectangle are entered through keyboard. */

import java.util.*;
class Q7Area
{
	int len,br, area;
	Q7Area(int x, int y) 
	{
			len=x;
			br=y;
	}
	int returnArea(int a, int b) //formal arguments
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
		
		Q7Area obj = new Q7Area(l,b);
	
		System.out.println("\nThe Area is : "+obj.returnArea(l,b));
	}
}