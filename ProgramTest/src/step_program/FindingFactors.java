/**A program to find the factors of a number taken as user input*/
package step_program;
import java.util.*; //Importing java.util.* for Scanner class

public class FindingFactors 
{
	public static void main(String args[])
	{
		int number; //Initializing the number variable
		Scanner sc=new Scanner(System.in); //Initializing the Scanner object
		System.out.println("Enter the number:");
		number = sc.nextInt(); //Inputting the number from the user
		
		System.out.println("The factors of "+ number +" are:");
		for(int i = 1; i < number; i++) //For loop
		{
			if(number % i == 0) //Checking if the loop variable is a factor of the number
				System.out.println(i); //Printing Factors
		} //End For Loop
	} //End Method
} //End Class
