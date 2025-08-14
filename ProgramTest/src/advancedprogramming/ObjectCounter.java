package advancedprogramming;

class Employee
{
	static int counter = 0; //Static int variable counter used to count the number of objects
	Employee() //Constructor
	{
		counter++; //Each time an object of Employee class is created, it calls the constructor and the static value gets incremented
	} //End Constructor
	
	public void display()
	{
		System.out.println("Number of Employees : " + counter); //Displaying number of objects
	} //End Method
} //End Class

public class ObjectCounter 
{ //Main Class
	public static void main(String args[])
	{
		Employee obj1 = new Employee(); //Creating multiple objects
		Employee obj2 = new Employee();
		Employee obj3 = new Employee();
		Employee obj4 = new Employee();
		Employee obj5 = new Employee();
		Employee obj6 = new Employee();
		obj6.display(); //Displaying Final Output
	} //End Method
} //End Class

