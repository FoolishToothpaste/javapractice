/**A program to print odd and even numbers between 1 to the number entered by the user*/
package step_program;
import java.util.*; //Importing java.util.* for Scanner class

public class OddEvenPrint 
{
	public static void main(String args[])
	{
		int number; //Initializing the variable to store the number
		Scanner sc=new Scanner(System.in); //Initializing Scanner object
		System.out.println("Enter the number:");
		number = sc.nextInt(); //Inputting the number from the user
		
		if(number<1) //Checking if the number is a natural number
			System.out.println("The number "+ number +" is not a natural number."); //Displaying Final Output
		else
		{
			for(int i = 1; i <= number; i++) //For Loop iterating from 1 to the number
			{
				if(i % 2 == 0) //Checking if the number is even
					System.out.println("The number "+ i +" is an even number"); //Displaying Final Output
				else //If the number is odd
					System.out.println("The number "+ i +" is an odd number"); //Displaying Final Output
			} //End For Loop
		} //End Else Block
	} //End Method
} //End Class
