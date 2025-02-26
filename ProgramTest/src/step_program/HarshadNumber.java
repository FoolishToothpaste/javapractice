/**A program to check if a number taken from the user is a Harshad Number*/
package step_program;
import java.util.*; //Importing java.util.* for Scanner class

public class HarshadNumber
{
	public static void main(String args[])
	{
		int number, numberOriginal, sum = 0, digit; //Initializing variables
		Scanner sc=new Scanner(System.in); //Initializing Scanner object
		System.out.println("Enter the number:");
		number = sc.nextInt(); //Inputting the number from the user
		numberOriginal = number; //Storing the value of the number
		
		while(number > 0) //While Loop
		{
			digit = number % 10; //Extracting the last digit of the number
			sum+= digit; //Adding last digit of the number to sum
			number/= 10; //Removing the last digit of the number
		} //End While Loop
		
		if(numberOriginal % sum == 0) //Checking if the number is perfectly divisible by the sum of its digits
			System.out.println("Harshad Number"); //Displaying Final Output
		else
			System.out.println("Not a Harshad Number"); //Displaying Final Output
	} //End Method
} //End Class
