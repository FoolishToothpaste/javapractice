/**A program to find the factors of a number taken as user input*/
package step_program;
import java.util.*; //Importing java.util.* for Scanner class

public class FindingFactorGreatest
{
	public static void main(String args[])
	{
		int number, greatestFactor = 1; //Initializing variables
		Scanner sc=new Scanner(System.in); //Initializing the Scanner object
		System.out.println("Enter the number:");
		number = sc.nextInt(); //Inputting the number from the user
		
		for(int i = 1; i < number; i++) //For loop
		{
			if(number % i == 0) //Checking if the loop variable is a factor of the number
				greatestFactor = i; //Storing chronological greatest factor
		} //End For Loop
		
		System.out.println("Greatest Factor of "+ number +" = "+ greatestFactor); //Displaying Final Output
	} //End Method
} //End Class