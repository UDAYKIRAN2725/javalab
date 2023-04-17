import java.util.Scanner;
class Arrayoperation
{
	public static void main(String args[])
	{
	
		
		int size,max,min,sum=0;
		System.out.println("Every array size ");
		size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter array items");
		for(int i=0;i<a.length;i++)
			a[i]=sc.nextInt();
		max=min=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max) max=a[i];
			if(a[i]<min) min=a[i];
			sum+=a[i];
		}
		System.out.println("Array items are :");
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
		System.out.println("sum="+sum+"max="+max+"min="+min);
	}
}

