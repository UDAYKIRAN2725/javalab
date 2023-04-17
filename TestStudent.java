class Student 
{
	static int count;
	void getCount()
	{
		++count;
	}
}
class TestStudent
{
	public static void main(String args[])
	{
		Student s1=new Student();
		s1.getCount();
		System.out.println("no.of objects created far="+s1.count);
		Student s2=new Student();
		s2.getCount();
		System.out.println("no.of objects created far="+s2.count);

	}
}
