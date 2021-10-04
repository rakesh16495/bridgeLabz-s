import java.util.*;

class Car 
{ 
	void run() 
	{	 
		System.out.println(" running"); 
	} 
}
class Innova extends Car 
{ 
	void run() 
	{ 
		System.out.println("running fast at 120km"); 
	} 
}
class OverridingMethod
{
	public static void main(String args[]) 
	{ 
		Car c = new Innova(); 
		c.run(); 
	}
} 