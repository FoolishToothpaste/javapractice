/**a TemperaturConversion program, given the temperature in Celsius as input outputs the temperature in Fahrenheit*/
package step_program;
import java.util.*; //Importing java.util.* for Scanner class

public class TemperaturConversion 
{
	public static void main(String args[])
	{
		double celcius, farenheitResult; //Initializing variables
		Scanner sc=new Scanner(System.in); //Initializing Scanner object
		System.out.println("Enter the temperature in Celcius:");
		celcius = sc.nextDouble(); //Inputting the temperature value in Celcius
		
		farenheitResult = (celcius * (9/5.0)) + 32; //Converting the Celcius value to Farenheit
		//Displaying Final Output
		System.out.println("The "+ celcius +" celsius is "+ farenheitResult +" Fahrenheit");
	} //End method
} //End class
