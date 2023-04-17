package p3;
import p1.P;
public class S extends P
{
	public S()
	{
		System.out.println("Constructor S called ");
		P p=new P();
		System.out.println("k_public ="+k_pub);
		//System.out.println("k_private="+k_priv);
                System.out.println("k_protected ="+k_pro);
               // System.out.println("k_default="+k_def);
	}
}
