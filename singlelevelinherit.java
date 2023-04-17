class A
{
	int x;
	A()
	{
		System.out.println("x from A="+x);
	}
}
class B extends A
{
	int y;
	B()
	{
		System.out.println("Constructor -B called");
		y=20;
	}
	void m2()
	{
		System.out.println("x from B="+x);
		System.out.println("y from  B="+y);
	}
}
class Inheritance
{
	public static void main(String args[])
	{
		B b1=new B();
		b1.m2();
	}

}
