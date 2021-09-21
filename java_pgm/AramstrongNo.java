import java.util.*;

class AramstrongNo
{
	public static void main(String args[])
	{
		int no=153;
		int rem,temp;
		int sum=0;
		
		temp=no;	
		while(temp>0)
		{
			rem=temp%10;
			sum=sum+(rem*rem*rem);
			temp=temp/10;
		}
		if(temp==sum)
		{
			System.out.println("Armstrong");
		}
		else
		{
			System.out.println("Not armstrong");
		}
	}	
}