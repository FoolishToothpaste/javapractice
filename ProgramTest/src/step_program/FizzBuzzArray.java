/**A program FizzBuzz that take a number as user input and if it is a positive integer loops from 0 to the number and saves the number, but for multiples of 3 saves "Fizz" instead of the number, for multiples of 5 saves "Buzz", and for multiples of both saves "FizzBuzz" and finally, prints the array results for each index position in the format Position 1 = 1, …, Position 3 = Fizz,...*/
package step_program;
import java.util.*; //Importing java.util.* for Scanner class

public class FizzBuzzArray 
{
	public static void main(String args[])
	{
		int number, j; //Initializing variables
		Scanner sc=new Scanner(System.in); //Initializing Scanner object
		System.out.println("Enter the number:");
		number = sc.nextInt(); //Inputting the number from the user
		
		if(number > 0) //Checking if the number is a positive number
		{
			String arr[] = new String[number]; //Initializing the array to store the elements
			for(int i = 0; i < number; i++) //For Loop
			{
				j = i+1; //j will be element stored at index i
				if( j % 5 == 0 && j % 3 == 0) //Checking if the element is divisible by both 5 and 3
					arr[i] = "FizzBuzz"; //Storing "FizzBuzz" in the array
				else if(j % 3 == 0) //Checking if the element is divisible by 3 and not 5
					arr[i] = "Fizz"; //Storing "Fizz" in the array
				else if(j % 5 == 0) //Checking if the element is divisible by 5 and not 3
					arr[i] = "Buzz"; //Storing "Buzz" in the array
				else //The number is divisible by neither 3 nor 5
					arr[i] = ""+j; //Storing the number in the array
			} //End For Loop
			
			for(int i = 0; i < number; i++) //For Loop
				System.out.println("Position " + (i+1) + " = " + arr[i]); //Displaying Final Output
		}
		else //The number is not a positive number
			System.out.println("Invalid Input"); //Displaying Final Output
	} //End Method
} //End Class
