import java.util.Scanner;

class PerfectSqrt
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the no:");
		int no=sc.nextInt();
		int i;	
		for(i=1;i*i<=no;i++)
		{
			if((no%i==0) && (no/i==i))
			{
				System.out.println("No is perfect sqrt"+no);
				break;
			}
	
		}
		System.out.println("No is Not perfect sqrt"+no);
	}
}