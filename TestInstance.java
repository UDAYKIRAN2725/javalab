class Student{}
class Book{}
class TestInstance
{
	public static void main(String args[])
	{
		Object obj;
		obj=new Student();
		Student s=new Student();
		Book b=new Book();
		boolean res=obj instanceof Student;
		System.out.println(res);
		res=s instanceof Student;
		System.out.println(res);
		res=b instanceof Book;
		System.out.println(res);
	}
}

