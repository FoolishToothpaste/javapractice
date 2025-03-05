/**A program to take a number as input find the frequency of each digit in the number*/
package step_program;
import java.util.*; //Importing java.util.* for Scanner class

public class DigitFrequency 
{
	public static void main(String args[])
	{
		int number, numbert, count = 0; //Initializing variables
		int frequency[] = new int[10]; //Initializing the array to store the frequencies of the digits
		Scanner sc=new Scanner(System.in); //Initializing Scanner object
		System.out.println("Enter the number:");
		number = sc.nextInt(); //Inputting the number from the user
		
		numbert = number; //Storing the number in a temporary number variable
		while(numbert > 0) //While Loop
		{
			count++; //Counting the total number of digits in the number
			numbert/= 10; //Removing the last digit from the temporary number variable
		} //End While Loop
		
		int digits[] = new int[count]; //Initializing the array to store the digits of the number
		for(int i = 0; i < count; i++) //For Loop
		{
			digits[i] = number % 10; //Extracting the last digit from the number variable to store in the array
			number/= 10; //Removing the last digit from the number variable
		} //End For Loop
		
		for(int i = 0; i < 10; i++) //For Loop 1
			for(int j = 0; j < count; j++) //For Loop 2
				if(i == digits[j]) //Checking if the digit in the digits array matches the index of frequency array
					frequency[i]++; //Incrementing frequency of ith decimal digit
		for(int i = 0; i < 10; i++) //For Loop
			if(frequency[i] > 0) //Checking if the decimal digit is available in the number
				System.out.println("Frequency of "+ i +" = "+ frequency[i]); //Displaying Final Output
	} //End Method
} //End Class
