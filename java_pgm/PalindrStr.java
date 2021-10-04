import java.util.*;
	
class PalindrStr
{
	public static void main(String  ar[])
	{
		String st="kak";
		int flag=0;
		
		st=st.toLowerCase();

		for(int i=0;i<st.length();i++)
		{
			if(st.charAt(i)!=st.charAt(st.length()-i-1))
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
			System.out.println("String is palindrome");
		else
			System.out.println("String is not palindrome");
	}
}