package advancedprogramming;
import java.util.*; //Importing java.util.* for Scanner class

class Marks
{
	private int marks; //Private attribute of the Marks class
	
	public void setMarks(int marks) //Method to set a value to marks
	{
		this.marks = marks; //This keyword points to the variable in the class
		System.out.println("Marks set successfully");
	}
	
	public int getMarks() //Method to return the value of private marks
	{
		return marks;
	}
} //Class End

public class PrivateVariables 
{ //Main Class
	public static void main(String args[])
	{
		Marks obj = new Marks(); //Creating an object of Marks class
		System.out.println("Enter the Marks:");
		Scanner sc=new Scanner(System.in); //Initializing Scanner object
		int m = sc.nextInt(); //Inputting the marks from the user
		obj.setMarks(m); //Setting the value of private marks to 97
		System.out.println("The marks of the Student : " + obj.getMarks()); //Displaying final output
	}
}