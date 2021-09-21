import java.util.*;

class StrLen
{
	public static void main(String args[])
	{
		String string="Hello String";
		int count=0;

		for(int i=0;i<string.length();i++)
		{
			if(string.charAt(i)!=' ')
			{
				count++;
			}
		}
		System.out.println("Total count is:"+count);
	}	
}