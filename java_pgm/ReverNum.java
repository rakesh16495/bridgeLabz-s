import java.util.*;
	
class ReverNum
{
	public static void main(String args[])	
	{
		int arr[]={1,2,3,4,5};
		
		System.out.println("Given Array is:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}
		
		System.out.println("Array Reverse Order :");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
	}
}