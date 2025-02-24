/**A program that takes a number as user input, and if it is a positive integer loops from 0 to the number and prints the number, 
 * but for multiples of 3 prints "Fizz" instead of the number, for multiples of 5 prints "Buzz", 
 * and for multiples of both prints "FizzBuzz"*/
package step_program;
import java.util.*; //Importing java.util.* for Scanner class

public class FizzBuzz
{
	public static void main(String args[])
	{
		int n; //Initializing variables
		String f = "Fizz", b = "Buzz";
		Scanner sc=new Scanner(System.in); //Initializing Scanner object
		System.out.println("Enter the number:");
		n = sc.nextInt(); //Inputting the number from the user
		
		if(n <= 0) //Checking if the number is a positive number or not
			System.out.println(n + "is not a positive number."); //Displaying Final Output
		else
		{
			for(int i = 1; i <= n; i++) //For Loop
			{
				if(i % 3 == 0) //Checking if the loop variable is a multiple of 3
					System.out.print(f); //Printing Fizz
				if(i % 5 == 0) //Checking if the loop variable is a multiple of 5
					System.out.print(b); //Printing Buzz
				if(i % 5 != 0 && i % 3 != 0) //Checking if the loop variable is  a multiple of neither 3 nor 5
					System.out.print(i); //Printing the loop variable
				System.out.println(); //Moving to next line
			} //End For Loop
		} //End Else Block
	} //End Method
} //End Class