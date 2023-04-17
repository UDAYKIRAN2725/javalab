interface Bank
{
	String name="indian bank";
	String address="malkapur";
	int Bcode=2345;
	void getBankDetails();


}
interface SavingAc extends Bank
{
	int accno=345263546;
	double balance=5784300;
        void getSavingDetails();
}
interface CurrentAc extends Bank
{
	int accno=456742526;
	double balance=8988700;
	void getCurrentDetails();
}
class Customer implements SavingAc,CurrentAc
{
	int custid=342564;
	String name="sai";
	void getCustomerDetails()
	{
		System.out.println("customer id:"+custid);
		System.out.println("Customer name:"+name);
	}

	public void getBankDetails()
	{
		System.out.println("bank name:"+Bank.name);
		System.out.println("bank address:"+address);
		System.out.println("bank code:"+Bcode);
	}
	public void getSavingDetails()
	{
		System.out.println("saving accountno:"+SavingAc.accno);
		System.out.println("saving balance:"+SavingAc.balance);
	}
	public void getCurrentDetails()
        {
                System.out.println("Current accountno:"+CurrentAc.accno);
                System.out.println("Current balance:"+CurrentAc.balance);
        }
	

}
class DiamondInherit
{
	public static void main(String args[])
	{
		Customer c=new Customer();
		c.getCustomerDetails();
		c.getBankDetails();
		c.getSavingDetails();
		c.getCurrentDetails();
	}
}
