import java.util.Scanner;

class ATM
{
	public static void main(String args[])	
	{
		int balance=15000;
		int withdraw,deposit;

		Scanner sc= new Scanner(System.in);
		
		while(true)	
		{
			System.out.println("*****ATM*****");
			System.out.println("1.Withdrawal");
			System.out.println("2.Deposit");
			System.out.println("3.Check Balance");
			System.out.println("4.Exit");
			System.out.println("5.Choice your above option");
			
			int choice=sc.nextInt();	
			
			switch(choice)
			{
				case 1:
					System.out.println("Enter Money to be withdrawn..");
					withdraw=sc.nextInt();
					
					if(balance>=withdraw)
					{
						balance=balance-withdraw;
						System.out.println("Successfully withdrawal..");		
					}
					else
					{
						System.out.println("Insufficient Balance..");
					}
					break;		
				
				case 2:
					System.out.println("Enter Money to be deposited..");	
					deposit=sc.nextInt();
					
					deposit=balance+deposit;
					System.out.println("Successfully deposited..");
					break;		
				
				case 3:
					System.out.println("Balance is:"+balance);
					System.out.println("");			
					break;
				case 4:
					System.exit(0);
			}	
		}
	}	
}