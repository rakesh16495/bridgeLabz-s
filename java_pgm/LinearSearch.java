import java.util.*;
class LinearSearch
{
	public static int linearSearch(int []s,int num)
	{
		for(int i=0;i<s.length;i++)
		{
			if(s[i]==num)
			{
				return i;
			}
		}
		return 2;
	}
	public static void main(String ar[])
	{
		int a[]={10,20,60,15};
		int no=60;
		System.out.println(no+"is found index"+linearSearch(a,no));	
	}
}