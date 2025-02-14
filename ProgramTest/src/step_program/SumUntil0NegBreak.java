/**A program to find the sum of numbers until the user enters 0 or a negative number using while loop and break statement*/
package step_program;
import java.util.*; //Importing java.util.* for Scanner class

public class SumUntil0NegBreak
{
	public static void main(String args[])
	{
		double i = 1.0, sum = 0.0; //Initializing variables
		Scanner sc=new Scanner(System.in); //Initializing Scanner object
		System.out.println("Start entering numbers to add, enter 0 to stop adding and print the result:");
		while(true) //While Loop
		{
			i = sc.nextDouble(); //Inputting the numbers to be added to the sum from the user
			if(i > 0) //Checking if the input number is positive
				sum+= i; //Adding input numbers to sum
			else //If input number is negative
				break; //Loop Break
		} //While Loop End
		
		System.out.println("\nSum = "+ sum); //Displaying Final Output
	} //End Method
} //End Class
