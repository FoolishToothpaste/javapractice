/**A program to count down the number from the user input value to 1 using a while loop for a rocket launch*/
package step_program;
import java.util.*; //Importing java.util.* for Scanner class

public class RocketCounter 
{
	public static void main(String args[])
	{
		int counter; //Initializing counter variable
		Scanner sc=new Scanner(System.in); //Initializing Scanner object
		System.out.println("Enter the number to count down from:");
		counter = sc.nextInt(); //Inputting the number to start the count down from the user
		System.out.println(); //Skipping a line for clean output
		
		while(counter>0) //While Loop
		{
			System.out.println(counter); //Printing the count down numbers
			counter--; //Decrementing counter variable
		} //End While Loop
	} //End Method
} //End Class
