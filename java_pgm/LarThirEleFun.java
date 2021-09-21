import java.util.*;
	
class LarThirEleFun
{
	public static int getThirdLarge(int ar1[],int total)
	{
		int temp;
		for(int i=0;i<total;i++)
		{
			for(int j=i+1;j<total;j++)
			{
				if(ar1[i]>ar1[j])
				{
					temp=ar1[i];
					ar1[i]=ar1[j];
					ar1[j]=temp;
				}
			}
		}
		return ar1[total-3];
	}	

	public static void main(String args[])
	{
		int ar1[]={22,34,11,55,70,3};
		
		System.out.println("Large Third ele is: "+getThirdLarge(ar1,6));	
	}
}