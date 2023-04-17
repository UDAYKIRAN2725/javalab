class Overload
{
	static void sum(int x,int y)
	{
		System.out.println("Sum-1="+(x+y));
	}
	static void sum(float x,float y,float z)
	{
		System.out.println("Sum-2="+(x+y+z));
	}
	void sum(int x,float y)
	{
		System.out.println("Sum-3="+(x+y));

	}
	String sum(String x,String y)
	{
		System.out.println("Sum-4="+(x+y));
		return (x+y);
	}
	public static void main(String args[])
	{
		sum(2,3);
		sum(1,2,3);
		Overload obj=new Overload();
		obj.sum(2,3.4F);
		String z;
		z=obj.sum("abc","xyz");
	}
}

