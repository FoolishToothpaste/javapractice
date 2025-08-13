package advancedprogramming;

class Person
{
	String name, address; //Attributes of the Person class
	int age;
	
	Person() //Default Constructor
	{
		name = "Unknown"; //Initializing the attributes of Person class with default values
		address = "Nowhere";
		age = -999999999;
	}
	
	Person(String name, int age, String address) //Parameterized Class
	{
		this.name = name; //Initializing the attributes of Person class with parameterized values
		this.age = age;
		this.address = address;
	}
	
	public void displayPersonInfo() //Method to display the Person Info
	{
		System.out.println("Person Info :\nName = " + name + "\nAge = " + age + "\nAddress = " + address);
	}
}
public class PersonInfoClass 
{ //Main Class
	public static void main(String args[])
	{
		Person obj1 = new Person("Soham Roy", 19, "Chennai"); //Creating object of the Person class using parameterized constructor
		Person obj2 = new Person(); //Creating object of the Person class using default constructor
		
		//Displaying Final Output
		obj1.displayPersonInfo();
		System.out.println();
		obj2.displayPersonInfo();
	} //End Method
} //End Class
