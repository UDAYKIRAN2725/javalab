import java.util.Scanner;
class StringDemo
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str;
		System.out.println("enter a string ");
		str=sc.nextLine();
		System.out.println("str="+str);
		System.out.println("str length="+str.length());
		System.out.println("str upper Case ="+str.toUpperCase());
		System.out.println("str lower case ="+str.toLowerCase());
		System.out.println("replaced str="+str.replace(str,"Dummy"));
		System.out.println("after concat="+str.concat("Dummy"));
		System.out.println("after join="+str.join(":","abcd","xyz"));

	}
}

