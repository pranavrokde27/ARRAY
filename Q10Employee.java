/* Write a program that would print the information (name, year of joining, salary, address) of three
Q10Employees by creating a class named 'Q10Employee'. The output should be as follows:

Name 	Year of joining 	Address
Robert 	1994 				64C- WallsStreat
Sam 	2000				68D- WallsStreat
John 	1999 				26B- WallsStreat */

class Q10Employee
{
	String name;
	int Year;
	String Address;
	int salary;
	
	Q10Employee(String n, int y, String Add, int sal)
	{
		this.name=n;
		int Year=y;
		String Address=Add;
		int salary=sal;

		System.out.println("\n "+name+"\t\t"+Year+"\t\t\t"+Address+"\t\t\t"+salary);
	}
	
		
	public static void main(String[] args)
	{
			System.out.println("\n The Details of Employees are as Follows : ");
			System.out.println("\n Name\t\tYear of joining\t\tAddress\t\t\t\tSalary\n");
			
			Q10Employee a = new Q10Employee("Robert",1994,"64C-WallsStreet",5000);
			Q10Employee b = new Q10Employee("Sam",2000,"68D-WallsStreet",25000);
			Q10Employee c = new Q10Employee("Jhon",1999,"26B-WallsStreet",250000);

	}

}