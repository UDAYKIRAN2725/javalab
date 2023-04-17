import java.util.Scanner;
class Area
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius :");
		int r=sc.nextInt();
		double d=Math.PI*Math.pow(r,2);
		System.out.println("area of circle"+Math.ceil(d));
	}
}
