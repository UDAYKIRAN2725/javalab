package p2;
import p1.P;
public class Q
{
	public Q()
	{
		System.out.println("Constructor Q called ");
		P p=new P();
		System.out.println("k_public ="+p.k_pub);
	}
}
