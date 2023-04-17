import java.util.Scanner;
class Phone
{
	String name;
	String type;
	int price;
	Phone()
	{
		name="Iphone";
                type="Smartphone";
                price=99999;
	}
	void makeCall()
	{
		System.out.println("make a call");
	}
	void receiveCall()
	{
		System.out.println("receive a call");
	}
}
class Mobile extends Phone
{
	String netwktype;
	String netwk;
	Mobile()
	{
		netwktype="5G";
		netwk="JIO";
	}
	void sendSms()
	{
		System.out.println("send sms");
	}
	void receiveSms()
	{
		System.out.println("recieves sms");

	}
	void mobileDetails()
	{
		System.out.println("Name="+name);
		System.out.println("Type="+type);
		System.out.println("Price="+price);
		System.out.println("Network Type="+netwktype);
		System.out.println("Network="+netwk);
	}

}
class Landline extends Phone
{
	String ntwkcable;
	int code;
	Landline()
	{
		ntwkcable="xstream";
		code=3456;
	}
	void getBroadband()
	{
		System.out.println("Broadband");
	}
	void landlineDetails()
	{
		System.out.println("Name="+name);
                System.out.println("Type="+type);
                System.out.println("Price="+price);
		 System.out.println("Network cable="+ntwkcable);
		  System.out.println("Code="+code);
	}
}
class Hierarical
{
	public static void main(String args[])
	{
		Mobile M=new Mobile();
		M.sendSms();
		M.receiveSms();
		M.mobileDetails();
		Landline L=new Landline();
		L.getBroadband();
		L.landlineDetails();
	}
}





