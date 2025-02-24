/**A program to find all the multiple of a number taken as user input below 100*/
package step_program;
import java.util.*; //Importing java.util.*

public class MultiplesBelow100 
{
	public static void main(String args[])
	{
		int number; //Initializing the number variable
		Scanner sc=new Scanner(System.in); //Initializing Scanner object
		System.out.println("Enter the number:");
		number = sc.nextInt(); //Inputting the number from the user
		
		for(int i = 100; i >= 1; i--) //For Loop Backwards from 100 to 1
		{
			if(i % number == 0) //Checking if i is a multiple of number
				System.out.println(i); //Printing the multiple
		} //End For Loop
	} //End Method
} //End Class
