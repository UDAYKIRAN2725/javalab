class Student
{
	Student()
	{
		System.out.println("Student object created");
	}
	protected void finalize()
	{
		System.out.println("Student object destroyed");
	}
}
class Book
{
	Book()
	{
		System.out.println("Book object created");
	}
	protected void finalize()
        {
                System.out.println("Book object destroyed");
        }

}
class FinalizeDemo
{
	public static void main(String args[])
	{
		System.out.println("mainbegin");
		Student s=new Student();
		s=null;
		Book b=new Book();
		b=null;
		System.gc();
		System.out.println("main ends");
	}
}
