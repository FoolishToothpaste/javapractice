/**A program to check if a number is Armstrong or not*/
package step_program;
import java.util.*; //Importing java.util.* for Scanner class

public class Armstrong 
{
	public static void main(String args[])
	{
		int number, originalNumber, remainder, cube, sum = 0; //Initializing variables
		Scanner sc=new Scanner(System.in); //Initializing Scanner object
		System.out.println("Enter the number:");
		number = sc.nextInt(); //Inputting the number from the user
		originalNumber = number; //Storing the value of input number in separate variable
		
		while(number > 0) //While Loop
		{
			remainder = number % 10; //Extracting the last digit of the number
			cube = remainder * remainder * remainder; //Calculating the cube of the last digit
			sum+= cube; //Adding the cube of the last digit to the sum
			number/= 10; //Removing the last digit from the number
		} //End While Loop
		 
		if(sum == originalNumber) //Checking if the sum of the cubes of the digits is equal to the original number
			System.out.println(originalNumber + " is an Armstrong number"); //Displaying Final Output
		else
			System.out.println(originalNumber + " is not an Armstrong number"); //Displaying Final Output
	} //End Method
} //End Class