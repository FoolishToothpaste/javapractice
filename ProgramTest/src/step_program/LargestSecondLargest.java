/**A program to store the digits of the number in an array and find the largest and second largest element of the array*/
package step_program;
import java.util.*; //Importing java.util.* for Scanner class

public class LargestSecondLargest 
{
	public static void main(String args[])
	{
		int maxDigit = 10, index = 0, largest = 0, secondLargest = 0; //Initializing variables
		long number;
		int digits[] = new int[maxDigit]; //Initializing the array for storing digits of the number
		Scanner sc=new Scanner(System.in); //Initializing Scanner object
		System.out.println("Enter a number. Make sure it has less than 11 digits:");
		number = sc.nextLong(); //Inputting the number from the user
		
		while(number > 0) //While Loop
		{
			digits[index] = (int) (number % 10); //Extracting the last digit of the number and storing them in the array
			index++; //Incrementing index variable by 1
			if(index >= maxDigit) //Checking number of digits has exceeded the limit
				break; //Breaking out of loop
			number/= 10; //Removing the last digit from the number
		} //End WHile Loop
		
		for(int i = 0; i < 10; i++) //For Loop
		{
			//Conditional statements to find the largest and second largest digits
			if(digits[i] > secondLargest) 
			{
				if(digits[i] > largest)
				{
					secondLargest = largest;
					largest = digits[i];
				} //End If Block
				else if(digits[i] != largest)
					secondLargest = digits[i];
			} //End If Block
		} //End For Loop
		
		System.out.println("Largest Number = " + largest); //Displaying Final Output
		System.out.println("Second Largest Number = " + secondLargest); //Displaying Final Output
	} //End Method
} //End Class
