package advancedprogramming;
import java.util.*; //Importing java.util.* for Scanner class

class Rectangle //Class Rectangle
{
	double height, width; //Attributes of the class
	
	public double perimeter() //Non static method to find the perimeter of the rectangle and return it
	{
		return (2 * (height + width));
	} //End Method
	
	public double area() //Non static method to find the area of the rectangle and return it
	{
		return (height * width);
	} //End Method
} //End Class

public class RectangularCalculatorClass 
{ //Main Class
	public static void main(String args[])
	{
		Rectangle obj1 = new Rectangle(); //Initializing object of the Rectangle class
		Scanner sc=new Scanner(System.in); //Initializing Scanner object
		System.out.println("Enter the dimensions of the rectangle:");
		obj1.height = sc.nextDouble(); //Inputting the dimensions of the rectangle from the user
		obj1.width = sc.nextDouble();
		
		//Displaying Final Output
		System.out.println("Perimeter of the Rectangle = " + obj1.perimeter());
		System.out.println("Area of the Rectangle = " + obj1.area());
	} //End Method
} //End Class
