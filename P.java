package p1;
public class P
{
	public int k_pub=40;
	private int k_priv=20;
	protected int k_pro=30;
	int k_def=10;
	public P()
	{
		System.out.println("Constructor P called ");
		System.out.println("k_public ="+k_pub);
		System.out.println("k_private="+k_priv);
		System.out.println("k_protected ="+k_pro);
		System.out.println("k_default="+k_def);
	}
}
