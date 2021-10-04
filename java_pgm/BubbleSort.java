import java.util.*;

class BubbleSort
{
	public static void main(String args[])
	{
		int ar[]={50,25,5,20,10};
		int temp,i,j;
		
		System.out.println("After Bubble sort is:");
		for(i=0;i<5;i++)
		{
			System.out.println(ar[i]);
		}	
	
		for(i=0;i<5;i++)
		{	
			for(j=i+1;j<5;j++)
			{
				if(ar[i]>ar[j])
				{
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}

		System.out.println("Bubble sort is:");
		for(i=0;i<5;i++)
		{
			System.out.println(ar[i]);
		}	
	}
}