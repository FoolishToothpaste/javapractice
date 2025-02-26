/**A program to check if the given number is a prime number or not*/
package step_program;
import java.util.*; //Importing java.util.* for Scanner class

public class Prime 
{
	public static void main(String args[])
	{
		int number; //Initializing the variables
		boolean isPrime = true;
		Scanner sc=new Scanner(System.in); //Initializing Scanner class
		System.out.println("Enter the number:");
		number = sc.nextInt(); //Inputting the number from the user
		
		if(number > 1) //Checking if the input number is greater than 1
		{
			for(int i = 2; i < number; i++) //For Loop
			{
				if(number % i == 0) //Checking if i is a factor of number
				{
					isPrime = false; //Concluding that the number is not Prime
					break; //Breaking out of loop
				} //End If Block
			} //End Loop
		}
		else
			isPrime = false; //Concluding that the number is not Prime as it is less than 1
		
		if(isPrime) //Final Check
			System.out.println(number + " is a prime number."); //Displaying Final Output
		else
			System.out.println(number + " is not a prime number."); //Displaying Final Output
	} //End Method
} //End Class
