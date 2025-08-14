package step_program; //Different package
import advancedprogramming.A; //Demonstration of behavior of public methods in superclasses in different packages

public class B extends A //B inherits A
{
	public static void main(String args[])
	{
		A obj = new A(); //Creating object of A class
		obj.display(); //Calling public method from A class
	} //End Method
} //End Class
