/**A program to check whether a person can vote, depending on whether his/her age is greater than or equal to 18*/
package step_program;
import java.util.*; //Importing java.util.* for Scanner class

public class Vote 
{
	public static void main(String args[])
	{
		int age; //Initializing variables
		Scanner sc=new Scanner(System.in); //Initializing Scanner object
		System.out.println("Enter the age of the person:");
		age = sc.nextInt(); //Inputting age of the person from the user
		
		if(age>=18) //Checking if the age of the person is above or equal to 18
			System.out.println("The person's age is "+ age +" and can vote."); //Displaying Final Output
		else //If age of the person is below 18
			System.out.println("The person's age is "+ age +" and cannot vote."); //Displaying Final Output
	} //End method
} //End class
