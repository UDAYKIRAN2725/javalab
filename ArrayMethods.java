import java.util.Arrays;
class ArrayMethods
{
	public static void main(String args[])
	{
		int a[]={1,2,3,4,5};
		int b[]={10,20,30,40,50};
		int c[];
		System.out.println("Arrray A:");
		for(int i:a)
			System.out.println(i);
		System.out.println("Before copy Array B:");
		for(int i:b)
			System.out.println(i);
		
		System.arraycopy(a,1,b,2,2);
		System.out.println("After copy Array B:");
		for(int i:b)
			System.out.println(i);
		System.out.println("Array c= Entire copy of Array A");
		c=Arrays.copyOf(a,a.length);
		for(int i:c)
			System.out.println(i);
		c=Arrays.copyOfRange(a,0,4);
		System.out.println("After copy Array C:");
		for (int i:c)
			System.out.println(i);
		Arrays.sort(b);
		System.out.println("After sort ,Array B:");
		for (int i:b)
			System.out.println(i);
		int result=Arrays.binarySearch(a,30);
		System.out.println("Search result ="+result);
		Arrays.fill(a,1);
		System.out.println("After fill ,Array A:");
		for (int i:a)
			System.out.println(i);


	}
}
