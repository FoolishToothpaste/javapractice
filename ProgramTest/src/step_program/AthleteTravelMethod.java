/**A program to calculate the number of rounds an athlete needs to run to complete 5 kilometers in a triangular park the dimensions of which are input by the user*/
package step_program;
import java.util.*; //Importing java.util.* for Scanner class

public class AthleteTravelMethod
{
	public static int Rounds(double side1, double side2, double side3)
	{ //Method to calculate the perimeter and number of rounds
		int distance = 5000; //Storing value of distance to be covered by the athlete in meters
		double perimeter = side1 + side2 + side3; //Calculating the perimeter of the triangular park
		int round = distance / (int) perimeter; //Calculating the number of rounds the athlete has to cover
		return round; //Returning final result
	} //End Method
	
	public static void main(String args[])
	{
		
		double side1, side2, side3, perimeter; //Initializing dimension variables
		Scanner sc=new Scanner(System.in); //Initializing Scanner object
		System.out.println("Enter the three sides of the triangular park:");
		side1 = sc.nextDouble(); //Inputting the first side of the triangular park from the user
		side2 = sc.nextDouble(); //Inputting the second side of the triangular park from the user
		side3 = sc.nextDouble(); //Inputting the third side of the triangular park from the user
		
		//Displaying Final Output by calling method inside print statement
		System.out.println("The total number of rounds the athlete will run is "+ Rounds(side1, side2, side3) +" to complete 5 km");
	} //End method
} //End class
