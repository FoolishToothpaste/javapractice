package advancedprogramming;

class Car
{
	String model; //Attributes of class Car
	int year;
	String color;
	
	public void CarInfo() //Non static method to display the details of the car
	{
		System.out.println("Details of the Car:\nModel : " + model + "\nYear : " + year + "\nColor : " + color);
	}
}

public class CarInfo
{
	public static void main(String args[])
	{ //Main Method
		Car obj1 = new Car(); //Creating the two object
		Car obj2 = new Car();
		
		obj1.model = "Maruti Suzuki"; //Initializing the Car class variables for each object
		obj1.year = 2009;
		obj1.color = "Red";
		
		obj2.model = "Ford 21";
		obj2.year = 2021;
		obj2.color = "Blue";
		
		//Displaying Final Output
		obj1.CarInfo();
		System.out.println();
		obj2.CarInfo();
	} //End Method
} //End Class