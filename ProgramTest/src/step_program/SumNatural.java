/**A program to check for the natural number and write the sum of n natural numbers*/
package step_program;
import java.util.*; //Importing java.util.* for Scanner class

public class SumNatural 
{
	public static void main(String args[])
	{
		int number, sum; //Initializing variables
		Scanner sc=new Scanner(System.in); //Initializing Scanner object
		System.out.println("Enter the number of natural numbers:");
		number = sc.nextInt(); //Inputting the number of terms from the user
		
		if(number<=0) //Checking if the number of terms is a natural number
			System.out.println("The number "+ number +" is not a natural number"); //Displaying Final Output
		else
		{
			sum = (number * (number+1)) / 2; //Calculating the sum of n natural numbers
			System.out.println("The sum of "+ number +" natural numbers is "+ sum); //Displaying Final Output
		} //End else block
	} //End method
} //End class
