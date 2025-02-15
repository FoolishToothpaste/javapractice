/**A Program to find the factorial of an integer entered by the user using for loop.*/
package step_program;
import java.util.*; //Import java.util.* for Scanner class

public class FactorialFor
{
	public static void main(String args[])
	{
		int n, fact = 1; //Initializing variables
		Scanner sc=new Scanner(System.in); //Initializing Scanner object
		System.out.println("Enter the number to find the factorial of:");
		n = sc.nextInt(); //Inputting the number from the user
		if(n<=0) //Checking if the number is a natural number
			System.out.println("The number "+ n +" is not a natural number"); //Displaying Final Output
		else
		{
			for(int i = 1; i <= n; i++) //For Loop
			{
				fact*= i; //Multiplying the numbers to find the factorial
			} //End For Loop
		
			System.out.println("Factorial = "+ fact); //Displaying Final Output
		} //End Else Block
	} //End Method
} //End Class
