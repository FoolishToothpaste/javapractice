/**A program to create a calculator using switch...case*/
package step_program;
import java.util.*; //Importing java.util.* for Scanner class

public class CalculatorSwitchCase 
{
	public static void main(String args[])
	{
		double first, second; //Initializing the number variables
		String op; //Initializing operator variable
		Scanner sc=new Scanner(System.in); //Initializing Scanner object
		System.out.println("Enter the two numbers to perform the operation on:");
		first = sc.nextDouble(); //Inputting the first number from the user
		second = sc.nextDouble(); //Inputting the second number from the user
		sc.nextLine(); //nextLine to avoid input stream error
		System.out.println("Enter the operator: + or - or * or /");
		op = sc.nextLine(); //Inputting the operator from the user
		
		switch(op) //Switch block
		{
		case "+": //If operator is +
			System.out.println("Sum = " + (first + second)); //Displaying Final Output
			break;
		case "-": //If operator is -
			System.out.println("Difference = " + (first - second)); //Displaying Final Output
			break;
		case "*": //If operator is *
			System.out.println("Product = " + (first * second)); //Displaying Final Output
			break;
		case "/": //If operator is /
			System.out.println("Division = " + (first / second)); //Displaying Final Output
			break;
		default: //If operator is neither of the available options
			System.out.println("Invalid Operator"); //Displaying Final Output
		} //End Switch Block
	} //End Method
} //End Class
