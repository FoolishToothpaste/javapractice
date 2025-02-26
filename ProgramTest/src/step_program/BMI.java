/*A program to find the BMI of a person**/
package step_program;
import java.util.*; //Importing java.util.* for Scanner class

public class BMI 
{
	public static void main(String args[])
	{
		double weight, height, heightMeter, BMI; //Initializing variables
		Scanner sc=new Scanner(System.in); //Initializing Scanner class
		System.out.println("Enter the weight (in kg) and height (in cm):");
		weight = sc.nextDouble(); //Inputting the weight of the person in kg from the user
		height = sc.nextDouble(); //Inputting the height of the person in cm from the user
		
		heightMeter = height / 100; //Converting the height from centimeter to meter
		BMI = weight / (heightMeter * heightMeter); //Calculating BMI
		 
		System.out.println("BMI of person = "+ BMI + " kg/m^2"); //Displaying Final Output
	}
}
