/**A program to check if the first, second, or third number is the largest of the three*/
package step_program;
import java.util.*; //Importing java.util.* for Scanner class

public class LargestOfThree 
{
	public static void main(String args[])
	{
		int number1, number2, number3; //Initializing variables
		String answer1 = "No"; //Default values
		String answer2 = "No";
		String answer3 = "No";
		Scanner sc=new Scanner(System.in); //Initializing Scanner object
		System.out.println("Enter the three numbers:");
		number1 = sc.nextInt(); //Inputting the first number from the user
		number2 = sc.nextInt(); //Inputting the second number from the user
		number3 = sc.nextInt(); //Inputting the third number from the user
		
		if(number1 > number2 && number1 > number3) //Checking if the first number is the largest
			answer1 = "Yes";
		else if(number2 > number3) //Checking if the second number is the largest
			answer2 = "Yes";
		else if(number3 > number2) //Checking if the third number is the largest, if condition to make sure all numbers aren't equal
			answer3 = "Yes";
		//Displaying Final Output
		System.out.println("Is the first number the largest? "+ answer1 +"\nIs the second number the largest? "+ answer2 +"\nIs the third number the largest? "+ answer3);
	} //End method
} //End class
