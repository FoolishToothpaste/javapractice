/**A program to calculate time and distance covered to travel from a city via another city to final city*/
package step_program;
import java.util.*; //Importing java.util.* for Scanner class

public class CityTravel 
{
	public static void main(String args[])
	{
		String name, fromCity, viaCity, toCity; //Initializing the String variables
		double fromToVia, viaToFinalCity, totalDistance; //Initializing the distance variables
		int timeFromToVia, timeViaToFinalCity, totalTime; //Initializing the time variables
		Scanner sc=new Scanner(System.in); //Initializing Scanner object
		
		System.out.println("Enter: Name of the Passenger, From City, Via City, Final City");
		name = sc.nextLine(); //Inputting the name of the Passenger from the user
		fromCity = sc.nextLine(); //Inputting the name of the From City from the user
		viaCity = sc.nextLine(); //Inputting the name of the Via City from the user
		toCity = sc.nextLine(); //Inputting the name of the To (Final) City from the user
		System.out.println(); //Skipping a line to avoid streamline errors and clean output
		
		System.out.println("Enter distance covered to travel from:\na) "+fromCity+" to "+viaCity+"\nb) "+viaCity+" to "+toCity);
		fromToVia = sc.nextDouble(); //Inputting the distance covered to travel from From City to Via City from the user
		viaToFinalCity = sc.nextDouble(); //Inputting the distance covered to travel from Via City to To (Final) City from the user
		System.out.println(); //Skipping a line for clean output
		
		System.out.println("Enter time taken (in minutes) to travel from:\na) "+fromCity+" to "+viaCity+"\nb) "+viaCity+" to "+toCity);
		timeFromToVia = sc.nextInt();  //Inputting the time taken to travel from From City to Via City from the user
		timeViaToFinalCity = sc.nextInt(); //Inputting the time taken to travel from Via City to To (Final) City from the user
		System.out.println(); //Skipping a line for clean output
		
		totalDistance = fromToVia + viaToFinalCity; //Calculating total distance travelled by Passenger
		totalTime = timeFromToVia + timeViaToFinalCity; //Calculating total time taken by Passenger
		//Displaying Final Output
		System.out.println("The Total Distance travelled by " + name + " from " + fromCity + " to " + toCity + " via " + viaCity +" is " + totalDistance + " km and " +"the Total Time taken is " + totalTime + " minutes");
	} //End method
} //End class
