import java.util.*;

class PrimeNorange
{
	public static void main(String ar[])
	{
		
		int flag=0;
		
		for(int i=1;i<=20;i++)
		{
			for(int j=2;j<i/2;j++)
			{
				if(i%j==0)
				{
					flag=1;
					break;	
				}
			}
			

			 if(flag==0)
		 	 {
	 			System.out.println("No is prime"+i);
			 }
			 else
			 {
				System.out.println("No is not prime"+i);	
			 }
		}
	}
}