class Q2ClassObject
{
	int roll_no;
	int phone;
	String name;
	String add;;
	public static void main(String[] args)
	{
			Q2ClassObject s1 = new Q2ClassObject(); //1st object
			Q2ClassObject s2 = new Q2ClassObject (); //2nd object 
			s1.name= "John"; // 1st obj ka name 
			s2.name= "Sam"; // 2nd object ka name
			s1.roll_no= 10; // 
			s2.roll_no= 20;
			s1.phone= 100226;
			s2.phone= 951235;
			s1.add="80 E St. Richmond Park, London, E57 Y21";
			s2.add="221 Bakers Street, London, A54 H86";

		System.out.println("Details of first Candidate: ");
		System.out.println("\nName : "+s1.name+"\n Roll Number : "+s1.roll_no+"\n Contact Number : "+s1.phone+"\n Address: "+s1.add);
		System.out.println("\nDetails of Second Candidate: ");
		System.out.println("\nName : "+s2.name+"\n Roll Number : "+s2.roll_no+"\n Contact Number : "+s2.phone+"\n Address: "+s2.add);
	
	
	}

}