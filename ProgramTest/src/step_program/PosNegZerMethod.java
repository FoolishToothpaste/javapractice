/**A program to check whether a number is positive, negative, or zero*/
package step_program;
import java.util.*; //Importing java.util.* for Scanner class

public class PosNegZerMethod
{
	public static int numberCheck(int n)
	{ //Method to check if number is positive, negative or zero
		if(n > 0) //Checking if the number is positive
			return 1; //Returning appropriate result
		else if(n < 0) //Checking if the number is negative
			return -1; //Returning appropriate result
		else //Concluding that the number is zero
			return 0; //Returning appropriate result
	} //End Method
	
	public static void main(String args[])
	{
		int n, result; //Initializing variables
		Scanner sc=new Scanner(System.in); //Initializing Scanner object
		System.out.println("Enter the number:");
		n = sc.nextInt(); //Inputting the number from the user
		
		result = numberCheck(n); //Calling the method to check if the number is positive, negative or zero
		if(result == 1) //Checking if the number is positive
			System.out.println("Positive"); //Displaying Final Output
		else if(result == -1) //Checking if the number is negative
			System.out.println("Negative"); //Displaying Final Output
		else //Concluding that the number is zero
			System.out.println("Zero"); //Displaying Final Output
		} //End method
} //End class
