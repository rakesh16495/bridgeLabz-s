import java.util.*;

class PrimeNo
{
	public static void main(String []ar)
	{
		int no=5;
		int flag=0;
		
		for(int i=2;i<=no/2;i++)
		{	
			if(no%i==0)
			{
				System.out.println("No is not prime");
				flag=1;
				break;	
			}
			
		}
		if(flag==0)
		{
			System.out.println("No is prime");
		}
	}
}