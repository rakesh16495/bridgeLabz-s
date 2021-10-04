import java.util.*;

class BianarySearch
{
	public static void binarySearch(int ar[],int first,int last,int key)
	{
		int mid=(first+last)/2;
		
			while(first<=last)
			{
				if(ar[mid]<key)
				{	
					first=mid+1;
				}
				else if(ar[mid]==key)
				{
					System.out.println("ele found as index "+mid);
					break;
				}		
				else
				{
					last=mid-1;			
				}
				mid=(first+last)/2;
			}
			if(first>last)
			{
				System.out.println("Element is not found");
			}
	}
	public static void main(String ar[])
	{
		int arr[]={10,20,30,40,50,60};
		int key=30;
		int last=arr.length-1;
		
		 binarySearch(arr,0,last,key);
	}
}