/**A program to take 2 numbers and print their quotient and reminder*/
package step_program;
import java.util.*; //Importing java.util.* for Scanner class

public class QuotientReminderMethod 
{
	public static int[] findRemainderAndQuotient(int number, int divisor) 
	{ //Method to find the quotient and remainder of a number and its divisor
		int[] result = {(number / divisor) , (number % divisor)}; //Storing the quotient and remainder in result array
		return result; //Returning calculated result
	} //End Method
	
	public static void main(String args[])
	{ 
		int num, div; //Initializing variables
		Scanner sc=new Scanner(System.in); //Initializing Scanner object
		System.out.println("Enter the number and the divisor:"); 
		num = sc.nextInt(); //Inputting the number from the user
		div = sc.nextInt(); //Inputting the divisor from the user
		
		int[] result = findRemainderAndQuotient(num, div); //Calling the function to calculate quotient and remainder
		System.out.println("Quotient = " + result[0]); //Displaying Final Output
		System.out.println("Remainder = "+ result[1]); //Displaying Final Output
	} //End Method
} //End Class
