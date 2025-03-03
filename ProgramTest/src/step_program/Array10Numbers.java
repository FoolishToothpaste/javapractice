/**A program to store multiple values in an array up to a maximum of 10 or until the user enters a 0 or a negative number and show all the numbers as well as the sum of all numbers*/
package step_program;
import java.util.*; //Importing java.util.* for Scanner class

public class Array10Numbers 
{
	public static void main(String args[])
	{
		double arr[]=new double[10]; //Initializing the array to store the numbers
		double total = 0.0, input; //Initializing variables
		int k = 0; //Initializing loop control variable
		System.out.println("Enter the elements of the array. Enter 0 or negative number to stop.");
		Scanner sc=new Scanner(System.in); //Initializing Scanner object
		
		while(true) //Infinite Loop
		{ 
			if(k > 9) //Checking if index is out of bounds
				break; //Ending Loop
			input = sc.nextDouble(); //Inputting the element of the array from the user
			if(input < 0 || input == 0) //Checking if the element is zero or negative
				break; //Ending Loop
			else
				arr[k] = input; //Storing input element inside array
				
			total+= arr[k]; //Adding input element to the total sum
			k++; //Incrementing loop control variable
		} //End While Loop
		
		System.out.println("Sum of the elements of the array = " + total); //Displaying Final Output
		for(int i = 0; i < 10; i++) //For Loop
			System.out.print(arr[i] + " "); //Displaying Final Output
	} //End Method
} //End Class
