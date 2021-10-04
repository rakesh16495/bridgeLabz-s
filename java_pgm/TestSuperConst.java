import java.util.*;
	
class Pen
{
	Pen()
	{
		System.out.println("Pen constructor called..");
	}
}
class Paper extends Pen
{
	Paper()
	{
		super();
		System.out.println("Paper constructor called..");
	}
}

class TestSuperConst
{
	public static void main(String args[])	
	{
		Paper p=new Paper();
	}
}