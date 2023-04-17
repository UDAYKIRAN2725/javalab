import java.util.Random;
class RandomNumber
{
	public static void main(String args[])
	{
		Random r=new Random();
		int num=r.nextInt(10000);
		System.out.println("Random number ="+num);

	}

}

