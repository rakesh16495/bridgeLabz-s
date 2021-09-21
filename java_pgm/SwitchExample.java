import java.util.*;

class SwitchExample
{
	public static void main(String ar[])
	{
		int no=5;
		
		switch(no)
		{
			case 1:System.out.println("Sunday");
				break;
			case 2:System.out.println("Monday");
				break;
			case 3:System.out.println("Twesday");
				break;
			case 4:System.out.println("Wednesday");
				break;
			case 5:System.out.println("Thursday");
				break;
			case 6:System.out.println("Friday");
				break;
			case 7:System.out.println("Saturday");

			default:
				System.out.println("Not in 1 to 7f..");
		}	
	}
}