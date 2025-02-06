/**A program to take 2 numbers and print their quotient and reminder*/

package step_program;
import java.util.*; //importing java.util.* for Scanner class

public class QuoRem 
{
	public static void main(String args[])
	{
		int number1, number2, quo, rem; //Initializing variables
		Scanner sc=new Scanner(System.in); //Initializing Scanner object
		System.out.println("Enter the two numbers: ");
		number1 = sc.nextInt(); //Inputting the first number from the user
		number2 = sc.nextInt(); //Inputting the second number from the user
		
		quo = number1 / number2; //Calculating Quotient of the two numbers
		rem = number1 % number2; //Calculating Remainder of the two numbers
		
		//Displaying the Final Output
		System.out.println("The Quotient is "+ quo +" and Reminder is "+ rem +" of two number "+ number1 +" and "+ number2);
	} //End Method
} //End Class
