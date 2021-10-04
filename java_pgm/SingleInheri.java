import java.util.*;

class Employee
{
	int a=50;
}
class SingleInheri extends Employee
{
	int b=100;
	
    public static void main(String arg[])
    {		
	SingleInheri s= new SingleInheri();

	System.out.println("Parent class :"+s.a);
	System.out.println("Child class :"+s.b);
    }	
}