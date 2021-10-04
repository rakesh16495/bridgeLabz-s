import java.util.*;
	
class Bike
{
	void run()
	{
		System.out.println("running..");	
	}
}	
class xpro extends Bike
{
	void run()
	{
		System.out.println("xpro running..");
	}
}
class Polymorp
{
	public static void main(String args[])
	{
		Bike x=new xpro();
		x.run();
	}
}