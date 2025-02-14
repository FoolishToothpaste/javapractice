/**A program to check if a number is divisible by 5*/
package step_program;
import java.util.*; //Importing java.util.* for Scanner class

public class DivisibleBy5 
{
	public static void main(String args[])
	{
		int number; //Initializing variables
		String answer;
		Scanner sc=new Scanner(System.in); //Initializing Scanner object
		System.out.println("Enter the number:");
		number = sc.nextInt(); //Inputting the number from the user
		
		if(number % 5 == 0) //Checking if the remainder after dividing by 5 is zero, i.e., divisibility by 5
			answer = "Yes"; //If divisible by 5
		else 
			answer = "No"; //If not divisible by 5
		//Displaying final output
		System.out.println("Is the number "+ number +" divisible by 5? "+ answer);
	} //End method
} //End class
