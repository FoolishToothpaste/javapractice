/**A program to count down the number from the user input value to 1 using a for loop for a rocket launch*/
package step_program;
import java.util.*; //Importing java.util.* for Scanner class

public class RocketCounterForLoop 
{
	public static void main(String args[])
	{
		int counter; //Initializing counter variable
		Scanner sc=new Scanner(System.in); //Initializing Scanner object
		System.out.println("Enter the number to count down from:");
		counter = sc.nextInt(); //Inputting the number to start the count down from the user
		System.out.println(); //Skipping a line for clean output
		
		for(int i = counter; i > 0; i--) //For Loop
		{
			System.out.println(i); //Printing the count down numbers
		} //End For Loop
	} //End Method
} //End Class