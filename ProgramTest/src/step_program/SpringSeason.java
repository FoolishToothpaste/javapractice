/**A program SpringSeason that takes two int values month and day from the command line and prints “Its a Spring Season” otherwise prints “Not a Spring Season”*/
package step_program;
import java.util.*; //Importing java.util.* for Scanner class

public class SpringSeason 
{
	public static void main(String args[])
	{
		int month, day; //Initializing variables
		Scanner sc=new Scanner(System.in); //Initializing Scanner object
		System.out.println("Enter the month number and day number:");
		month = sc.nextInt(); //Inputting the month number from the user
		day = sc.nextInt(); //Inputting the day number from the user
		
		if((month == 3 && day >= 20 && day <= 31) || (month == 6 && day >= 1 && day <= 20) || (month == 4 && day >= 1 && day <= 30) || (month == 5 && day >= 1 && day <= 31)) //Checking the conditions
			System.out.println("Its a Spring Season"); //Displaying Final Output
		else //If condition not matched
			System.out.println("Not a Spring Season"); //Displaying Final Output 
	} //End method
} //End class
