interface Outer 
{
	int k=10;
	void m1();
	interface Inner
	{
		int j=20;
		void m2();
	}
}
class NestedImp implements Outer,Outer.Inner
{
	public void m1()
	{
		System.out.println("from m1,k="+k);
	}
	public void m2()
	{
		System.out.println("from m2,k="+k);
		System.out.println("from m2,j="+j);
	}

}
class NestedInterface 
{
	public static void main(String args[])
	{
		NestedImp obj=new NestedImp();
		obj.m1();
		obj.m2();
	}



}
