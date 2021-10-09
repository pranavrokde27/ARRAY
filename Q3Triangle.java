class Q3Triangle

{
	 int Area;
	int peri;

	Q3Triangle()
	{
		int len=3;
		int wid=4;
		int height=5;
		Area=((wid*height)/2);
		peri=(len+wid+height);
	}
	public static void main(String[] args)	
	{
		Q3Triangle t1=new Q3Triangle();
		System.out.println("\n The Area of the Q3Triangle is : "+t1.Area+" and the Perimeter is : "+t1.peri);
		
	}
}