/**A program to check whether a number is positive, negative, or zero*/
package step_program;
import java.util.*; //Importing java.util.* for Scanner class

public class PosNegZer 
{
	public static void main(String args[])
	{
		int n; //Initializing variable
		Scanner sc=new Scanner(System.in); //Initializing Scanner object
		System.out.println("Enter the number:");
		n = sc.nextInt(); //Inputting the number from the user
		
		if(n > 0) //Checking if the number is positive
			System.out.println("Positive"); //Displaying Final Output
		else if(n < 0) //Checking if the number is negative
			System.out.println("Negative"); //Displaying Final Output
		else //Concluding that the number is zero
			System.out.println("Zero"); //Displaying Final Output
	} //End method
} //End class
