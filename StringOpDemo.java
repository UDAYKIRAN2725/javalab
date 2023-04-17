class StringOpDemo
{
	public static void main(String args[])
	{
		String s1="java",s2="JAVA";
		System.out.println("s1 length="+s1.length());
		System.out.println("s1==s2 "+s1.equals(s2));
		System.out.println("s1==s2"+s1.equalsIgnoreCase(s2));
		System.out.println("s1:"+s1.isEmpty());
		String s3=s1.join(":",s1,s2,"abcd","xyz");
		System.out.println("s1 join s2:"+s3);
		String s4=s1.concat(s2);
		System.out.println("s1 concat s2:"+s4);
		String s5="      spaced string    ";
		System.out.println("before trim "+s5);
		System.out.println("after trim "+s5.trim());
		System.out.println("ascii code of 0th char :"+s1.codePointAt(0));
		int a=10;
		double d=12.34;
		System.out.println(String.format("%d , %f",a,d));
		String s6="java program";
		System.out.println("after extraction "+s6.substring(0,5));
	}
}
