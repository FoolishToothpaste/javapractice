/**A Program to find the factorial of an integer entered by the user.*/
package step_program;
import java.util.*; //Import java.util.* for Scanner class

public class Factorial 
{
	public static void main(String args[])
	{
		int n, i=1, fact = 1; //Initializing variables
		Scanner sc=new Scanner(System.in); //Initializing Scanner object
		System.out.println("Enter the number to find the factorial of:");
		n = sc.nextInt(); //Inputting the number from the user
		
		while(i <= n) //While Loop
		{
			fact*= i; //Multiplying the numbers to find the factorial
			i++; //Incrementing while counter
		} //End While Loop
		
		System.out.println("Factorial = "+ fact); //Displaying Final Output
	} //End Method
} //End Class
