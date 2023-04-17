import java.util.Scanner;
class Palindrome
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str,str2;
		str=sc.nextLine();
		StringBuffer sb=new StringBuffer(str);
		System.out.println("before reverse sb="+sb);
		sb.reverse();
		System.out.println("after reverse sb="+sb);
		str2=sb.toString();
		if(str.equals(str2))
			System.out.println(str+" is palindrome");
		else
			System.out.println(str+" is not palindrome");

	}

}
