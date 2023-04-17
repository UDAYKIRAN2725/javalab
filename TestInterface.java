//program to demonstrate the interfaces
interface A
{
	int k=10;
	void m1();
	default void m2()
	{
		 System.out.println("method-2 called from A");
	}
}
class B implements A
{
	public void m1()
	{
		 System.out.println("method -1 is called from B");
	}
	public void m2()
	{
		 System.out.println("method -2 called from B");
	}
}
class TestInterface
{
	public static void main(String args[])
	{
		B b=new B();
		b.m1();
		b.m2();
		//A a=new A();  error
		System.out.println(b.k);
		//b.k=20;   error
		A a=new B();
		a.m1();
		a.m2();


	}
}

