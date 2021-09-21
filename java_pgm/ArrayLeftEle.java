import java.util.*;

class ArrayLeftEle
{
	public static void main(String args[])			
	{
	    try
	    { 		
		int []arr=new int[]{1,2,3,4,5};
		int no=3;	
		
		System.out.println("Enter given array is:");
		for(int i=0;i<=arr.length;i++)
		{
			System.out.println(arr[i]+"");
		}
		
		for(int i=0;i<no;i++)
		{
			int j,first;
			first=arr[0];
	
			for(j=0;j<=arr.length-1;j++)
			{
				arr[j]=arr[j+1];		
			}
			arr[j]=first;
		}
	 			
		System.out.println("Array after left Rotation");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+"");
		}
	   }	
	   catch(Exception e)
	   {	
		System.out.println(e);
	   }	
					
	}	
}