/**A program to check if a number is an Abundant Number*/
package step_program;
import java.util.*; //Importing java.util.* for Scanner class

public class AbundantNumber 
{
	public static void main(String args[])
	{
		int number, sum = 0; //Initializing variables
		Scanner sc=new Scanner(System.in); //Initializing Scanner object
		System.out.println("Enter the number:");
		number = sc.nextInt(); //Inputting the number from the user
		
		for(int i = 1; i < number; i++) //For Loop
		{
			if(number % i == 0) //Checking if i perfectly divides the number
				sum+= i; //Adding i to the sum
		} //End For Loop
		
		if(sum > number) //Checking if the sum of the divisors is larger than the number
			System.out.println("Abundant Number"); //Displaying Final Output
		else
			System.out.println("Not an Abundant Number"); //Displaying Final Output
	} //End Method
} //End Class
