import java.util.Scanner;

class Matrix
{
	public static void main(String arsg[])
	{	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row");
		int row=sc.nextInt();
		System.out.println("Enter the column");
		int col=sc.nextInt();
		
		int arr1[][]=new int[row][col];
			
		System.out.println("Enter the ele: ");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				arr1[i][j]=sc.nextInt();
			}
		}	
	
		System.out.println("Print two dia array is:");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(arr1[i][j]+" ");			
			}
			System.out.println();
		}	
	}
}