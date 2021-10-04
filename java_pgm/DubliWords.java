import java.util.*;

class DubliWords
{
	public static void main(String args[])
	{
		String str="Big black bug bit a big black dog on";
		int i,count;

		str=str.toLowerCase();
		
		String words[]=str.split(" ");

		System.out.println("Duplicate words in given String:");
		for(i=0;i<words.length;i++)
		{
			count=1;
			for(int j=0;j<words.length;j++)
			{
				count++;
				words[j]="0";	
			}
		}	
		if(count>1 && words[i]!="0")    
                System.out.println(words[i]);    	
		
	}
}