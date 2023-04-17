class BufferBuilderDemo
{
	public static void main(String args[])
	{
		StringBuffer sb1=new StringBuffer();
		long start=System.currentTimeMillis();
		for(int i=0;i<100000;i++)
		{
			sb1.append("abc").append(":");
		}
		long end=System.currentTimeMillis();
		System.out.println("StringBuffer Time after processing ="+(end-start));
		StringBuilder sb2=new StringBuilder();
		start=System.currentTimeMillis();
		for(int i=0;i<100000;i++)
		{
			sb2.append("abc").append(":");
		}
		end=System.currentTimeMillis();
		System.out.println("StringBuilder Time after processing ="+(end-start));
	}
}
