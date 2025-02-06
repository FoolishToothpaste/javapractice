/**A program to input the unit price of an item and the quantity to be bought, then, calculating the total price.*/
package step_program;
import java.util.*; //Importing java.util.* for Scanner class

public class QuantityPrice
{
	public static void main(String args[])
	{
		double unitPrice, totalPrice; //Initializing variables
		int quantity;
		
		Scanner sc=new Scanner(System.in); //Initializing Scanner object
		System.out.println("Enter the Unit Price of the item:"); 
		unitPrice = sc.nextDouble(); //Inputting Unit Price of item from the user
		System.out.println("Enter the Quantity of item to be bought:");
		quantity = sc.nextInt(); //Inputting Quantity of Item from the user
		
		totalPrice = quantity * unitPrice; //Calculating Total Price of Item
		
		//Displaying Final Output
		System.out.println("The total purchase price is INR "+ totalPrice +" if the quantity "+ quantity +" and unit price is INR "+ unitPrice);
	} //End method
} //End class
