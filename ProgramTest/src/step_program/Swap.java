/**A program to swap two numbers*/
package step_program;
import java.util.*; //Importing java.util.* for Scanner class

public class Swap 
{
	public static void main(String args[])
	{
		int number1, number2, temp; //Initializing the variables
		Scanner sc=new Scanner(System.in); //Initializing Scanner object
		System.out.println("Enter the two numbers to be swapped:");
		number1 = sc.nextInt(); //Inputting the first number from the user
		number2 = sc.nextInt(); //Inputting the second number from the user
		
		temp = number1; //Swapping Algorithm Step 1: Store first number in temporary variable
		number1 = number2; //Step 2: Store second number in first number variable
		number2 = temp; //Step 3: Store temporary variable (first number value) in second number variable
		//Displaying Final Output
		System.out.println("The swapped numbers are  "+ number1 +" and "+ number2);
	} //End Method
} //End Class
