import java.util.*;
	
class DccendiingOr
{
	public static void main(String args[])
	{
		int arr[]=new int[]{5,7,2,1,3};
		int temp=0;
		int i;
		System.out.println("Before sorting Array ele is:");
		
		for(i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}

		for(i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])	
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}

		System.out.println("After Sorting Array ele is:");
		for(i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}
	}
}