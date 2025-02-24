/**A program to find the multiplication table of a number entered by the user from 6 to 9*/
package step_program;
import java.util.*; //Importing java.util.* for Scanner class

public class MultTable69 
{
	public static void main(String args[])
	{
		int number, prod; //Initializing variables
		Scanner sc=new Scanner(System.in); //Initializing Scanner object
		System.out.println("Enter the number:");
		number = sc.nextInt(); //Inputting the number from the user
		
		for(int i = 6; i <= 9; i++) //For Loop (note that i starts from 6)
		{
			prod = number * i; //Multiplying the number with loop variable to find product
			System.out.println(number + " * " + i + " = " + prod); //Displaying final output
		} //End For Loop
	} //End Method
} //End Class
