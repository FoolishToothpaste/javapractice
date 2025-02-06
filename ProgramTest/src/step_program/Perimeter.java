/**A program to find the side of the square whose perimeter read from user*/

package step_program;
import java.util.*; //Importing java.util.* for Scanner class

public class Perimeter 
{
	public static void main(String args[])
	{
		double perimeter, side; //Initializing variables
		Scanner sc=new Scanner(System.in); //Initializing Scanner object
		System.out.println("Enter the perimeter of the square: "); 
		perimeter = sc.nextDouble(); //Inputting the perimeter of the square from the user
		
		side = perimeter / 4; //Calculating the side of the square from the perimeter
		//Displaying final output
		System.out.println("The length of the side is " + side + " whose perimeter is "+ perimeter);
	} //End method
} //End class
