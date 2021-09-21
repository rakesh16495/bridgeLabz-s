import java.util.*;

class PalindromeNo
{
	public static void main(String ar[])
	{
		int no=124;
		int temp,rem;
		int sum=0;

		temp=no;
		while(no>0)
		{
			rem=no%10;
			sum=sum*10+rem;
			no=no/10;
		}
		if(temp==sum)
		{
			System.out.println("No is Palindrome");
		}
		else
		{
			System.out.println("No is Not Palindrome");
		}	
	}		
}