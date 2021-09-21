import java.util.Scanner;

class ReverseNo
{
	public static void main(String args[])
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the Number :");
		int no=ob.nextInt();			
		int sum=0,rem;

		while(no!=0)
		{
			rem=no%10;
			sum=sum*10+rem;
			no=no/10;		
		}
		
		System.out.println("Reverse Number is:"+sum);
	}	
}