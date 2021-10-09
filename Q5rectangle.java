/* 5.Write a program to print the area of two rectangles having sides (4,5) and (5,8) respectively by
creating a class named 'Rectangle' with a method named 'Area' which returns the area and length
and breadth passed as parameters to its constructor.*/
class Q5rectangle
{
int length;
int breadth;
int area;
Q5rectangle(int x,int y)
{
length =x;
breadth=y;
}
public int area()
{
area=length*breadth;
return area;
}
public static void main(String[] args)
{
Q5rectangle a=new Q5rectangle(4,5);
Q5rectangle a1=new Q5rectangle(5,8);

System.out.println(a.area());
System.out.println(a1.area());
}
}


