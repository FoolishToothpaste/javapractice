package advancedprogramming;

class Car1 //Naming class Car1 because Car class exists in same package
{
	String model; //Attributes of class Car1
	int year;
	String color;
	
	Car1(String model, int year, String color) //Parameterized Constructor
	{
		this.model = model; //Storing parameter values for instance variables
		this.year = year;
		this.color = color;
	} //End Constructor
	
	public void CarInfo() //Non static method to display the details of the car
	{
		System.out.println("Details of the Car:\nModel : " + model + "\nYear : " + year + "\nColor : " + color);
	} //End Method
} //End Class

public class CarInfoConstructor
{
	public static void main(String args[])
	{ //Main Method
		Car1 obj1 = new Car1("Maruti Suzuki", 2009, "Red"); //Creating the two objects with parameterized constructors
		Car1 obj2 = new Car1("Ford 21", 2021, "Blue");
		
		//Displaying Final Output
		obj1.CarInfo();
		System.out.println();
		obj2.CarInfo();
	} //End Method
} //End Class