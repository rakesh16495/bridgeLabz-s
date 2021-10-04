import java.util.*;

class ReversStr
{
	public static void main(String st[])
	{
		String str="I like Mango";

		String reve="";

		for(int i=str.length()-1;i>=0;i--)
		{
			reve=reve+str.charAt(i);
		}
		
		System.out.println("Orignal String:"+str);
		System.out.println("Reverse String:"+reve);
	}	
}