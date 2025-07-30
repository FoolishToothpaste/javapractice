/**A program calculate the wind chill temperature given the temperature and wind speed*/
package step_program; 
import java.util.*; //Importing java.util.* for Scanner class

public class WindChillMethod 
{
	public static double calculateWindChill(double temperature, double windSpeed)
	{ //Method for calculating Wind Chill
		return  (35.74 + (0.6215 * temperature) + ((0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16))); //Calculating Wind Chill using given formula
	} //End Method
	
	public static void main(String args[])
	{
		double temperature, windSpeed, windChill; //Initializing the variables
		Scanner sc = new Scanner(System.in); //Initializing Scanner object
		System.out.println("Enter the Temperature and Wind Speed:");
		temperature = sc.nextDouble(); //Inputting the temperature from the user
		windSpeed = sc.nextDouble(); //Inputting the wind speed from the user
		windChill = calculateWindChill(temperature, windSpeed); //Calling method to calculate Wind Chill
		System.out.println("Wind Chill = " + windChill); //Displaying Final Output
	} //End Method
} //End Class