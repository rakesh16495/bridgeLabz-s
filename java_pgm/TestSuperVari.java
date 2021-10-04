import java.util.*;

class Paper
{
	String color="White";
}
class Pen extends Paper
{
	String color="Red";	
	
	void printColor()
	{
		System.out.println(color);
		System.out.println(super.color);
	}
}

class TestSuperVari
{
	public static void main(String ar[])
	{	
		Pen p=new Pen();
		p.printColor();
	}
}