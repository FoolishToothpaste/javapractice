/**A program to find the power of a number using loop*/
package step_program;
import java.util.*; //Importing java.util.* for Scanner class

public class PowerForLoop 
{
	public static void main(String args[])
	{
		int number, power, result = 1; //Initializing variables
		Scanner sc=new Scanner(System.in); //Initializing Scanner object
		System.out.println("Enter the number and the power to be raised to:");
		number = sc.nextInt(); //Inputting the number from the user
		power = sc.nextInt(); //Inputting the power the number will be raised to from the user
		
		for(int i = 1; i <= power; i++) //For Loop iterating the number of times as the power
		{
			result*= number; //Multiplying the number continually with result
		} //End For Loop
		
		System.out.println(number + " raised to the power " + power + " = " + result); //Displaying Final Output
	} //End Method
} //End Class
