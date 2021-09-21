import java.util.Scanner;

class Swapwithoutthird
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the first No:");
		int no1=sc.nextInt();
		System.out.println("Enter the Secound No:");
		int no2=sc.nextInt();

		no1=no1+no2;
		no2=no1-no2;
		no1=no1-no2;
	
	System.out.println("First No:"+no1);
	System.out.println("Second No:"+no2);
	
	}		
}