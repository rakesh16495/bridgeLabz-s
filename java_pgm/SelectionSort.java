import java.util.*;

class SelectionSort
{
	public static void selection_sort(int st[],int len)
	{
		int temp,low;
		for(int i=0;i<len;i++)
		{
			 low=i;
			for(int j=i+1;j<len;j++)
			{
				if(st[j]<st[low])
				{   
					low=j;
				}
			}
			if(low!=i)
			{
				temp=st[i];
				st[i]=st[low];
				st[low]=temp;		
			}
		}	
		
	} 
	public static void main(String args[])
	{
		int arr[]={23,25,12,22,11};
		int len=arr.length;
		selection_sort(arr,len);
		System.out.println("Selection Sorted Array is:");
		for(int i=0;i<len;i++)
		{
			System.out.println(arr[i]+" ");
		}		
	}
}