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
	void eat()
	{
		super.eat();
		System.out.println("eating Dog...");
	}
	void bark()
	{
		System.out.println("Barking Dog");
	}
	
}

class TestSuperPareMe
{
	public static void main(String args[])
	{
		Dog d=new Dog();
		d.eat();
		d.bark();
	}
}