import java.util.Scanner;
	
class MulTwoMatrix
{
	public static void main(String ars[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the row:");
		int row=sc.nextInt();
		System.out.println("Enter the column");
		int col=sc.nextInt();

		int ar1[][]=new int[row][col];
		int ar2[][]=new int[row][col];
		int temp[][]=new int[row][col];	
	
		System.out.println("first array input:");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				ar1[i][j]=sc.nextInt();
			}
		}
		System.out.println("Secound array input:");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				ar2[i][j]=sc.nextInt();
			}
		}

		for(int i=0;i<row;i++)
		{	
			for(int j=0;j<col;j++)
			{
				
			    temp[i][j]=0;
				for(int k=0;k<row;k++)
				{				
				
					temp[i][j]=temp[i][j]+ar1[i][k]*ar2[k][j];	
				}
			}
		}

		System.out.println("Multiplication of Array is:");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(temp[i][j]+" ");
			}
			System.out.println();
		}		
	}
}