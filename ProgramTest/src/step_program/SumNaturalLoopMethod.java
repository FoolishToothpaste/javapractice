/**A program to find the sum of n natural numbers using loop*/
package step_program;
import java.util.*; //Importing java.util.* for Scanner class

public class SumNaturalLoopMethod
{
	public static int naturalSum(int n)
	{ //Method to find the sum of n natural numbers
		int sum = 0; //Initializing the sum variable
		for(int i = 1; i <= n; i++) //For Loop
			sum+= i; //Adding each natural number to the sum with every iteration
		return sum; //Returning the calculated result
	} //End method
	
	public static void main(String args[])
	{
		int n, sum; //Initializing variables
		Scanner sc=new Scanner(System.in); //Initializing Scanner object
		System.out.println("Enter the number of natural numbers to find the sum of:");
		n = sc.nextInt(); //Inputting the number of natural numbers from the user
		sum = naturalSum(n); //Calling the function to calculate the sum
		//Displaying Final Output
		System.out.println("The sum of "+ n +" natural number = " + sum);
	} //End method
} //End class
