class Varargs
{
	static int m1(int x,int y,int z)
	{
		System.out.println("From m1");
		return x+y+z;
	}
	static int m2(int x,int y)
	{
		System.out.println("From m2");
		return x+y;
	}
	static int m3(int...x)
	{
		int sum=0;
		System.out.println("no of args="+x.length);
		for k in x:
			sum+=k;
		return sum;
	}
	public static void main(String args[])
	{
		System.out.println(m1(1,3,6));
		System.out.println(m2(5,8));
		System.out.println(m3(4,34,6,8,9,1,6);
	}
}
