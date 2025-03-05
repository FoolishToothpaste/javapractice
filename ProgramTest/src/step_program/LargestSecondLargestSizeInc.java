/**A program to store the digits of the number in an array and find the largest and second largest element of the array, increase size of array to fit all digits*/
package step_program;
import java.util.*; //Importing java.util.* for Scanner class

public class LargestSecondLargestSizeInc
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
			index++; //Incrementing index variable by 1
			if(index >= maxDigit) //Checking number of digits has exceeded the limit
			{
				maxDigit*= 2; //Doubling the size of the array
				int temp[] = new int[maxDigit]; //Creating a temporary array of double size
				System.arraycopy(digits, 0, temp, 0, index); //Copying elements from digits array to temporary array
				digits = temp; //Assigning digits array to refer to temporary array
			}
			digits[index] = (int) (number % 10); //Extracting the last digit of the number and storing them in the array
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