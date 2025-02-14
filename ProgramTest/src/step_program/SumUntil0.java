/**A program to find the sum of numbers until the user enters 0*/
package step_program;
import java.util.*; //Importing java.util.* for Scanner class

public class SumUntil0
{
	public static void main(String args[])
	{
		double i = 1.0, sum = 0.0; //Initializing variables
		Scanner sc=new Scanner(System.in); //Initializing Scanner object
		System.out.println("Start entering numbers to add, enter 0 to stop adding and print the result:");
		while(i != 0.0) //While Loop
		{
			i = sc.nextDouble(); //Inputting the numbers to be added to the sum from the user
			sum+= i; //Adding inputted numbers to sum
		} //While Loop End
		
		System.out.println("\nSum = "+ sum); //Displaying Final Output
	} //End Method
} //End Class
