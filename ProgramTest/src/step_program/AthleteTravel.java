/**A program to calculate the number of rounds an athlete needs to run to complete 5 kilometers in a triangular park the dimensions of which are input by the user*/
package step_program;
import java.util.*; //Importing java.util.* for Scanner class

public class AthleteTravel 
{
	public static void main(String args[])
	{
		int distance = 5; //Storing value of distance to be covered by the athlete
		double side1, side2, side3, perimeter; //Initializing dimension variables
		int round; //Initializing variable to store the number of round(s)
		
		Scanner sc=new Scanner(System.in); //Initializing Scanner object
		System.out.println("Enter the three sides of the triangular park:");
		side1 = sc.nextDouble(); //Inputting the first side of the triangular park from the user
		side2 = sc.nextDouble(); //Inputting the second side of the triangular park from the user
		side3 = sc.nextDouble(); //Inputting the third side of the triangular park from the user
		
		perimeter = side1 + side2 + side3; //Calculating the perimeter of the triangular park
		round = distance / (int) perimeter; //Calculating the number of rounds the athlete has to cover
		//Displaying Final Output
		System.out.println("The total number of rounds the athlete will run is "+ round +" to complete 5 km");
	} //End method
} //End class
