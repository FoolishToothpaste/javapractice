/**A program to divide N number of chocolates among M children.*/
package step_program;
import java.util.*; //Importing java.util.* for Scanner class

public class ChocolateDivisionMethod
{
	public static int[] chocolateFinder(int numberOfchocolates, int numberOfChildren)
	{ //Method to find number of chocolates each student gets and the remaining number of chocolates
		int eachChocolate = numberOfchocolates / numberOfChildren; //Calculating the number of chocolates each child will get
		int remChocolate = numberOfchocolates % numberOfChildren; //Calculating the remaining number of chocolates
		int[] result = {eachChocolate, remChocolate}; //Storing the variables in a result array
		return result; //Returning calculated result
	} //End Method
	
	public static void main(String args[])
	{
		int numberOfchocolates, numberOfChildren, eachChocolate, remChocolate; //Initializing variables
		Scanner sc=new Scanner(System.in); //Initializing Scanner object
		System.out.println("Enter the number of chocolates and number of children:");
		numberOfchocolates = sc.nextInt(); //Inputting the number of chocolates from the user
		numberOfChildren = sc.nextInt(); //Inputting the number of children from the user
		int[] result = chocolateFinder(numberOfchocolates, numberOfChildren); //Calling the function to calculate eachChocolate and remChocolate
		
		//Displaying Final Output
		System.out.println("The number of chocolates each child gets is "+ result[0] +" and the number of remaining chocolates are "+ result[1]);
	} //End method
} //End class