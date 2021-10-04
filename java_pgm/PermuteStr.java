import java.util.*;

class PermuteStr
{	
	public static String swapString(String a,int i,int j) 
	{    
        	char[] b =a.toCharArray();    
        	char ch;
    
        	ch=b[i];    
        	b[i]=b[j];    
        	b[j]=ch;    

        	return String.valueOf(b);	
	}
	public static void main(String[] args)    
    	{    
        	String str="ABC";    
        	int len=str.length();    
        	System.out.println("All the permutations of the string are: ");    
        	generatePermu(str,0,len);    
    	}   

	public static void generatePermu(String st,int start,int end)
	{
		if(start==end-1)
		{
			System.out.println(st);		
		}
		else
		{
			for(int i=start;i<end;i++)	
			{
				st=swapString(st,start,end);
			
				generatePermu(st,start+1,end);
		
				st=swapString(st,start,end);
			}
		}
	}
    
 }