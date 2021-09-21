import java.util.*;

class PrimNorange
{
	public static void main(String ar[])
	{
		int start=1;
		int end=20;
		flag=0;
		
		for(int i=start;i<=end;i++)
		{
			for(int j=2;j<start/2;j++)
			{
				if(start%2==0)
				{
					System.out.println("NO is not prime"+start);	
					flag=1;
					break;	
				}
			}
		}
		if(flag==0)
		{
			System.out.println("No is prime"+start);
		}
	}
}