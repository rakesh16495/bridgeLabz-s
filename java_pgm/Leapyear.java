import java.util.*;

class Leapyear
{
	public static void main(String args[])
	{
		int year=16;

		if(year%4==0)
		{
			System.out.println("Leap year:"+year);
		}
		else if(year%100==0)
		{	
			System.out.println("Not Leap year:"+year);			
		}
		else if(year%400==0)
		{
			System.out.println("Leap year:"+year);
		}
		else
		{
			System.out.println("not valid");
		}
	}
}