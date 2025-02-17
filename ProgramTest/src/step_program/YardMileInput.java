/**A program that find the distance in yards and miles for the distance provided by user in feet*/
package step_program; 
import java.util.*; //Importing java.util.* for Scanner class

public class YardMileInput 
{
	public static void main(String args[])
	{
		double distanceInFeet, yard, miles; //Initializing variables
		Scanner sc=new Scanner(System.in); //Initializing Scanner object
		System.out.println("Enter the distance in feet:"); 
		distanceInFeet = sc.nextDouble(); //Inputting the distance in feet from the user
		
		yard = distanceInFeet / 3; //Converting distance in feet to yards
		miles = yard / 1760; //Converting distance in feet to miles
		
		//Displaying final output
		System.out.println("Your Distance in feet is "+ distanceInFeet +" while in yards is "+ yard +" and miles is "+ miles);
	} //End method
} //End class
