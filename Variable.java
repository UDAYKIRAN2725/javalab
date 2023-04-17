class Variable
{
	int k;
	static int x;
	void m1()
	{
		int k=10;
		System.out.println("local k from m1="+k);
		System.out.println("instance k from m1="+this.k);
		System.out.println("class varaible from m1="+Variable.x);
		System.out.println("class variable from m1="+this.x);
	}
	void m2()
	{
		System.out.println("k from m2="+k);
	}
}
class TestVariable
{
	public static void main(String args[])
	{
		Variable V=new Variable();
		V.m1();
		V.m2();

	}
}
