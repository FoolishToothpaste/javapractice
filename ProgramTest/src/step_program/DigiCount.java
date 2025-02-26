/**A program to count the number of digits in an integer*/
package step_program;
import java.util.*; //Importing java.util.* for Scanner class

public class DigiCount 
{
	public static void main(String args[])
	{
		int number, number2, count = 0; //Initializing variables
		Scanner sc=new Scanner(System.in); //Initializing Scanner object
		System.out.println("Enter the number:");
		number = sc.nextInt(); //Entering the number from the user
		number2 = number; //Storing the value of the original number
		
		while(number > 0) //While Loop
		{
			count++; //Incrementing the count of the digits
			number/= 10; //Removing the last digit from the number
		} //While Loop End
		
		System.out.println(number2 + " has " + count + " digits."); //Displaying Final Output
	} //End Method
} //End Class
