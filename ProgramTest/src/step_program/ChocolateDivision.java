/**A program to divide N number of chocolates among M children.*/
package step_program;
import java.util.*; //Importing java.util.* for Scanner class

public class ChocolateDivision 
{
	public static void main(String args[])
	{
		int numberOfchocolates, numberOfChildren, eachChocolate, remChocolate; //Initializing variables
		Scanner sc=new Scanner(System.in); //Initializing Scanner object
		System.out.println("Enter the number of chocolates and number of children:");
		numberOfchocolates = sc.nextInt(); //Inputting the number of chocolates from the user
		numberOfChildren = sc.nextInt(); //Inputting the number of children from the user
		
		eachChocolate = numberOfchocolates / numberOfChildren; //Calculating the number of chocolates each child will get
		remChocolate = numberOfchocolates % numberOfChildren; //Calculating the remaining number of chocolates
		//Displaying Final Output
		System.out.println("The number of chocolates each child gets is "+ eachChocolate +" and the number of remaining chocolates are "+ remChocolate);
	} //End method
} //End class
