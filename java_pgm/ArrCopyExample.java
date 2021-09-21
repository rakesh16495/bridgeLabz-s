import java.util.Scanner;

class ArrCopyExample
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		int arr1[]=new int[10];
		int arr2[]=new int[10];
	
		System.out.println("Enter the size :");			
		int size=sc.nextInt();

		System.out.println("Enter the ele:");
		for(int i=0;i<size;i++)
		{
			arr1[i]=sc.nextInt();
		}
	
		System.out.println("Printing Ele is:");
		for(int j=0;j<size;j++)
		{
			System.out.println(arr1[j]+"");
		}
		
		for(int i=0;i<size;i++)
		{
			arr2[i]=arr1[i];		
			System.out.print(arr2);
		}

		
		System.out.println("Copy Array is:");
		
			
		for(int i=0;i<size;i++)
		{		
			System.out.print(arr2[i]);
		}
	}
}

