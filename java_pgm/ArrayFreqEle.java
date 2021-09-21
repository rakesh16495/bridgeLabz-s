import java.util.*;

class ArrayFreqEle
{
	public static void main(String ar[])
	{
		try
		{
		int arr[]={2,1,2,4,1};
		int brr[]=new int[arr.length];
		int count=0;
		
		for(int i=0;i<arr.length;i++)
		{
			count=1;	
			for(int j=i+1;j<=arr.length;j++)
			{
				
				if(arr[i]==arr[j])
				{
					count++;
					brr[j]=count;
				}				
			}
		}
		System.out.println("\n Frequency of all element is:\n");
		
		for(int i=0;i<=arr.length;i++)
		{
			System.out.println("value:"+arr[i]+"frequencey:"+brr[count]);		
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}	
}