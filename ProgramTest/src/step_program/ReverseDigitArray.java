/**A program to take a number as input and reverse the number*/
package step_program;
import java.util.*; //Importing java.util.*

public class ReverseDigitArray 
{
	public static void main(String args[])
	{
		int number, numbert, count = 0; //Initializing variables
		Scanner sc=new Scanner(System.in); //Initializing Scanner object
		System.out.println("Enter the number:"); 
		number = sc.nextInt(); //Inputting the number from the user
		numbert = number; //Storing the number in a temporary variable
		
		while(numbert > 0) //While Loop
		{ //Counting the digits in the input number
			count++; //Incrementing digit counter
			numbert/= 10; //Removing the last digit from the temporary number variable
		} //End While Loop
		
		int arr[] = new int[count]; //Initializing the array to store the reverse of the number
		int rarr[] = new int[count]; //Initializing the array to store the reverse of the reverse of the number
		
		for(int i = 0; i < count; i++) //For Loop
		{
			arr[i] = number % 10; //Storing the digits of the number in the array in reverse order
			number/= 10; //Removing the last digit from the number
		} //End For Loop
		
		for(int i = count-1, j = 0; i >= 0; i--, j++) //For Loop 
		{
			rarr[j] = arr[i]; //Reversing the reversed array arr[] and storing it in rarr[] {As said in hint (d)}
		} //End For Loop
		
		System.out.println("The number in reverse:");
		for(int i = 0; i < count; i++) //For Loop
			System.out.print(arr[i]); //Displaying Final Output
	} //End Method
} //End Class
