/**A program to convert weight in pounds to kilograms*/
package step_program;
import java.util.*; //Importing java.util.*

public class PoundToKg 
{
	public static void main(String args[])
	{
		double weight, weightkg; //Initializing variables
		Scanner sc=new Scanner(System.in); //Initializing Scanner object
		System.out.println("Enter the weight in pounds:"); 
		weight = sc.nextDouble(); //Inputting the weight in pounds from the user
		
		weightkg = weight * 2.2; //Converting the weight from pounds to kilograms
		System.out.println("Weight in kilograms = "+ weightkg); //Displaying Final Output
	} //End method
} //End class
