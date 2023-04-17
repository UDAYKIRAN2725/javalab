abstract class Vehicle
{
	abstract void drive();
	abstract int getSeatCapacity();
}
class Bike extends Vehicle
{
        void drive()
	{
		System.out.println("bike class");
	}
        int getSeatCapacity()
	{
		return 2;
	}
}
class Car extends Vehicle
{
        void drive()
        {
                System.out.println("Car class");
        }
        int getSeatCapacity()
        {
                return 4;
	}
}
class Train extends Vehicle
{
        void drive()
        {
                System.out.println("Train class");
        }
        int getSeatCapacity()
        {
                return 500;
        }
}       
class AbstractDemo
{
	public static void main(String args[])
	{
		Vehicle v;
		v=new Bike();
		v.drive();
		System.out.println(v.getSeatCapacity());
		v=new Car();
                v.drive();
                v.getSeatCapacity();System.out.println(v.getSeatCapacity());
		v=new Train();
                v.drive();
                System.out.println(v.getSeatCapacity());
	}
}
