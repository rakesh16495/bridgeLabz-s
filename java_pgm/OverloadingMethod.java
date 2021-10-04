import java.util.*;

class Shapes
{
	public void area()
	{
		System.out.println("Find area");
	}
	public void area(int r)
	{
		System.out.println("Circle are :"+3.14*r*r);
	}
	public void area(int l,int h)	
	{
		System.out.println("Rectangle area :"+l*h);
	}
}

class OverloadingMethod
{
	public static void main(String args[])
	{
		Shapes sh=new Shapes();
		
		sh.area();
		sh.area(4);
		sh.area(6,2);
	}
}
