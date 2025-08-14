package advancedprogramming; //Demonstration of behavior of public methods in superclasses in same package

public class B extends A //B inherits A
{
	public static void main(String args[])
	{
		A obj = new A(); //Creating object of A class
		obj.display(); //Calling public method from A class
	} //End Method
} //End Class
