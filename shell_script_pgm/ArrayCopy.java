import java.util.Scanner;

class ArrayCopy
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		int arr1[]=new int[10];
		int arr2[]=new int[10];
	
		System.out.println("Enter the size :");			
		int size=sc.nextInt();

		System.out.println("Enter the ele:");
		for(int i=0;i<=size;i++)
		{
			arr1[i]=sc.nextInt();
		}	
	}
}

