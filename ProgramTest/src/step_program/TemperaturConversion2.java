/**a TemperaturConversion program, given the temperature in Farenheit as input outputs the temperature in Celcius*/
package step_program;
import java.util.*; //Importing java.util.* for Scanner class

public class TemperaturConversion2
{
	public static void main(String args[])
	{
		double farenheit, celciusResult; //Initializing variables
		Scanner sc=new Scanner(System.in); //Initializing Scanner object
		System.out.println("Enter the temperature in Farenheit:");
		farenheit = sc.nextDouble(); //Inputting the temperature value in Farenheit
		
		celciusResult = (farenheit - 32) * (5/9.0); //Converting the Farenheit value to Celcius
		//Displaying Final Output
		System.out.println("The "+ farenheit +" farenheit is "+ celciusResult +" celcius");
	} //End method
} //End class

