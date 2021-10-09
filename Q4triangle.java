class Q4triangle
{
	int s1,s2,s3,area,peri;
	Q4triangle(int x, int y, int z) //constructor
	{
		this.s1=x;
		this.s2=y;
		this.s3=z;
		area = ((s2*s3)/2);
		peri = (s1+s2+s3);
System.out.println("\n The Area is : "+area+" \n The Perimeter is : "+peri);
	}
	
	public static void main(String[] args)
	{
		Q4triangle t2=new Q4triangle(3,4,5);
	}
}