package p1;
import p1.P;
public class R
{
	public R()
	{
		System.out.println("Constructor R called");
		P r=new P();
		System.out.println("k_public ="+r.k_pub);
	//	System.out.println("k_private="+k_priv);
                System.out.println("k_protected ="+r.k_pro);
                System.out.println("k_default="+r.k_def);
	}
}
