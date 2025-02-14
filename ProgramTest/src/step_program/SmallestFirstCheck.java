/**A program to check if the first is the smallest of the 3 numbers*/
package step_program;
import java.util.*; //Importing java.util.* for Scanner class

public class SmallestFirstCheck 
{
	public static void main(String args[])
	{
		int number1, number2, number3; //Initializing variables
		String answer = "No"; //Default value
		Scanner sc=new Scanner(System.in); //Initializing Scanner object
		System.out.println("Enter the three numbers:");
		number1 = sc.nextInt(); //Inputting the first number from the user
		number2 = sc.nextInt(); //Inputting the second number from the user
		number3 = sc.nextInt(); //Inputting the third number from the user
		
		if(number1 < number2 && number1 < number3) //Checking if the first number is the smallest
			answer = "Yes"; //If condition matched
		//Displaying Final Output
		System.out.println("Is the first number the smallest? "+ answer);
	} //End Method
} //End Class
