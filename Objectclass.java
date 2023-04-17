class Fruit 
{
	String name;
	double price;
	Fruit(String name,double price)
	{
		this.name=name;
		this.price=price;
	}
	public String toString()
	{
		return name+":"+price;
	}
	public boolean equals(Object obj)
	{
		Fruit temp=(Fruit)obj;
		if(this.name.equals(temp.name) && this.price==temp.price)
		{
			return true;
		}
		return false;
	}
}
class Objectclass
{
	public static void main(String args[])
	{
		Fruit f1=new Fruit("Apple",100);
		Fruit f2=new Fruit("Apple",100);
		System.out.println(f1.equals(f2));
		System.out.println(f1.toString());
		System.out.println(f2.toString());
		System.out.println(f1.getClass());
		System.out.println(f2.getClass());
		System.out.println(f1.equals(f2));
		
	}
}

