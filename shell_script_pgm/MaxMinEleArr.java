import java.util.*;
	
class MaxMinEleArr
{
	public static void main(String args[])
	{
		int arr[]=new int[]{22,11,43,75,21};
		int max=arr[0];
		int min=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
			if(arr[i]<min)
			{
				min=arr[i];
			}
				
		}
		System.out.println("largest element is:"+max);
		System.out.println("smallest element is:"+min);
	}
}