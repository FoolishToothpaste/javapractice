/**A program to convert distance in kilometers to miles with kilometers input by user.*/
package step_program;
import java.util.*; //importing java.util.* for Scanner class

public class KmMileInput 
{
	public static void main(String args[])
	{
		double km; //Initializing variable to store distance in kilometers
		Scanner input = new Scanner(System.in); //Initializing Scanner object
		
		System.out.println("Enter the distance in kilometers: ");
		km = input.nextInt(); //Inputting the distance in kilometers from the user
		double miles = km / 1.6; //Converting distance from kilometers to miles
		
		//Displaying final output
		System.out.println("The total miles is "+ miles +" mile for the given "+ km +" km");
	} //End method
} //End class