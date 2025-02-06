/**A program that takes your height in centimeters and converts it into feet and inches*/
package step_program;
import java.util.*;  //importing java.util.* for Scanner class

public class CentiToFeetInch 
{
	public static void main(String args[])
	{
		double hcm; //Initializing variable to store height in centimeters
		Scanner sc=new Scanner(System.in); //Initializing Scanner object
		System.out.println("Enter your height in centimeters: ");
		hcm=sc.nextDouble(); //Inputting height in centimeters from the user
		
		double hinch = hcm / 2.54; //Converting height in centimeters to inches
		double hfeet = hinch / 12; //Converting height in centimeters to feet
		
		//Displaying final output
		System.out.println("Your Height in cm is "+ hcm +" while in feet is "+ hfeet +" and inches is "+ hinch);
	} //End method
} //End class
