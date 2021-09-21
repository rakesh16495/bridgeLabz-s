import java.util.*;

class IFlargeele
{
	public static void main(String args[])
	{
		int a=40,b=10,c=20;

		if(a>=b && a>=c)
		{
			System.out.println(a+"is the largest number");
		}
		else if(b>=a && b>=c)
		{
			System.out.println(b+"is the largest number");
		}
		else
		{
			System.out.println(c+"is the largest number");	
		}
	}
}