// Add two distances in inch-feet by creating a class named 'AddDistance'
import java.util.*;
class Q11AddDistance
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("\n Enter the distance in Feets : ");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int res=((x*12)+(y*12));
		System.out.println("\n The total distance in inches is : "+res+"\"");
		
		System.out.println("\n Enter the distance in Inches : ");
		int x1=sc.nextInt();
		int y1=sc.nextInt();
		
		int res1=((x1+y1)/12);
		System.out.println("\n The total distance in Feet is : "+res1+"ft");
	}

}