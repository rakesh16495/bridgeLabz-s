import java.util.*;

class Animal
{
	void eat()
	{
		System.out.println("Eating...");
	}
}
class Dog extends Animal
{
	void bark()
	{
		System.out.println("barking..");
	}
}	

class TestInheritance
{
	public static void main(String ar[])
	{
		Dog d=new Dog();
		
		d.bark();	
		d.eat();
	}
}