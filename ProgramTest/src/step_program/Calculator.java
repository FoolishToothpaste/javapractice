/**A program to create a basic calculator that can perform addition, subtraction, multiplication, and division*/

package step_program;
import java.util.*; //Importing util package for Scanner class

public class Calculator 
{
	public static void main(String args[])
	{
		float number1, number2, sum, diff, prod, divi; //Initializing all the variables
		Scanner sc=new Scanner(System.in); //Initializing Scanner object
		System.out.println("Enter two numbers to perform operations on: ");
		number1 = sc.nextFloat(); //Inputting the first number from the user
		number2 = sc.nextFloat(); //Inputting the second number from the user
		
		sum = number1 + number2; //Calculating sum of the two numbers
		diff =  number1 - number2; //Calculating difference of the two numbers
		prod =  number1 * number2; //Calculating product of the two numbers
		divi =  number1 / number2; //Calculating division of the two numbers
		
		//Displaying final output
		System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "+ number1 + " and "+ number2 +" is "+ sum +", "+ diff +", "+ prod +", and "+ divi);
	} //End method
} //End class
