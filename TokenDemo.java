import java.util.StringTokenizer;
import java.util.Scanner;
class TokenDemo
{
	public static void main(String args[])
	{
		String str;
		int sum=0;
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		StringTokenizer st=new StringTokenizer(str);
		int count=st.countTokens();
		System.out.println("No of tokens generated ="+count);
		System.out.println("Printing each token");
		while(st.hasMoreTokens())
		{
			String s=st.nextToken();
			System.out.println(s);
			int k=Integer.parseInt(s);
			sum+=k;
		}
		System.out.println(sum);
	}
}
