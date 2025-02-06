/**A program to calculate the profit and loss in number and percentage based on the cost price of INR 129 and the selling price of INR 191. 
*/

package step_program;

public class ProfitCalc 
{
	public static void main(String args[])
	{
		int cp = 129; //Storing Cost Price
		int sp = 191; //Storing Selling Price
		
		int profit = sp - cp; //Calculating Profit
		double profitp = ( (double) profit / cp) * 100; //Calculating Profit Percentage, double type conversion to ensure decimal division
		
		//Displaying final output, \n escape sequence used to ensure multi-line output
		System.out.println("The Cost Price is INR " + cp + " and Selling Price is INR "+ sp + "\nThe Profit is INR "+ profit +" and the Profit Percentage is " + profitp);
	} //End method
} //End class
