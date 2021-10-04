import java.util.*;

class Bank
{
	float getRateOfInterest()
	{
		return 9.8f;
	}
}
class Axis extends Bank
{
	float getRateOfInterest()
	{
		return 7.6f;
	}
}
class Icic extends Bank
{
	float getRateOfInterest()
	{
		return 11.6f;
	}
}

class UpcastingH
{
	public static void main(String args[])
	{
		Bank b=new Bank();
	
		b=new Axis();
		System.out.println("Axis Bank rate :"+b.getRateOfInterest()); 
		b=new Icic();
		System.out.println("Icic Bank rate :"+b.getRateOfInterest());
	}
}