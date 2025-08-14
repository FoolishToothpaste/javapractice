package step_program; //Demonstration of accessibility of protected variable inside different packages
import java.util.Scanner;
import advancedprogramming.Vehicle; //Importing Vehicle class from advancedprogramming package

class Car3 extends Vehicle
{ //Car3 class inherits Vehicle class from different package
	public void setSpeed(double speed)
	{
		this.speed = speed; //Protected member speed is accessed through inheritance inside different package
		System.out.println("Speed set successfully");
	}
	
	public double getSpeed()
	{
		return speed;
	}
}

public class ProtectedSpeedDiffPackage {
	public static void main(String args[])
	{
		Car3 obj = new Car3();
		Scanner sc=new Scanner(System.in);
		System.out.println("Input Speed:");
		double s = sc.nextDouble();
		obj.setSpeed(s);
		System.out.println("Speed = " + obj.getSpeed());
	}
}
