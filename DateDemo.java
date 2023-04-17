import java.util.*;
class DateDemo
{
	public static void main(String args[])
	{
		Date d1=new Date();
		System.out.println("date= "+d1);
		Date d2=new Date(2004-1900,05,25);
		System.out.println("own date= "+d2);
		System.out.println("Age="+(d1.getYear()-d2.getYear()));
		Calendar c=Calendar.getInstance();
		System.out.println("Date= "+c.getTime());
		GregorianCalendar gc=new GregorianCalendar();
		System.out.println("date 4= "+gc.getTime());
	}
}
