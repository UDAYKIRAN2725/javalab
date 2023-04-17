import java.util.Scanner;
class Employee
{
	String name;
	int eid;
	double salary;
	void read()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee details:");
		System.out.println("enter name:");
		name=sc.nextLine();
		System.out.println("Enter Eid:");
		eid=sc.nextInt();
		System.out.println("enter salary");
		salary=sc.nextDouble();
	}
	void display()
	{
		System.out.println("Emplyee detalis are:");
		System.out.println("Name:"+name);
		System.out.println("Eid"+eid);
		System.out.println("Salary:"+salary);
	}
}
class TestEmployee
{
	public static void main(String args[])
	{
		Employee E[]=new Employee[5];
		for(int i=0;i<E.length;i++)
		{	E[i]=new Employee();
			E[i].read();
			E[i].display();
		}	
	}
}

