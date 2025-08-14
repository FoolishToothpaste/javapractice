package advancedprogramming;//Demonstration of accessibility of protected variable inside the same package
import java.util.*; //Importing java.util.* for Scanner class

class Car2 extends Vehicle //Car2 class inherits public Vehicle
{
	public void setSpeed(double speed)
	{
		this.speed = speed; //Accessing protected variable in inherited subclass
		System.out.println("Speed set successfully");
	}
	
	public double getSpeed()
	{
		return speed; //Returning speed
	}
} //End Subclass

public class ProtectedSpeed 
{ //Main Class
	public static void main(String args[])
	{
		Car2 obj = new Car2(); //Creating object of Car2 class
		Scanner sc=new Scanner(System.in); //Initializing Scanner object
		System.out.println("Input Speed:");
		double s = sc.nextDouble(); //Inputting Speed from the user
		obj.setSpeed(s); //Inputting Speed into protected variable through Car2 object
		System.out.println("Speed = " + obj.getSpeed()); //Displaying Final Output
	} //End Method
} //End Class

