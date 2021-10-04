import java.util.Arrays;

class AnagramStr
{
	public static void main(String args[])		
	{
		String str1="Rakesh";
		String str2="Rakesh";
	
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		
		if(str1.length()!=str1.length())
		{
			System.out.println("Both the string are not Anagrame..");
		}		
		else
		{
			char[] string1=str1.toCharArray();
			char[] string2=str2.toCharArray();
		
			Arrays.sort(string1);
			Arrays.sort(string2);
		
			if(Arrays.equals(string1,string2)==true)
			{
				System.out.println("Both the string are equals..");
			}
			else
			{
				System.out.println("Both the string are not equals..");
			}
		}
	}
}