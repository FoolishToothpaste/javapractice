/**A program similar to the program UniversityFee but taking user input for Student Fee and University Discount*/

package step_program;
import java.util.*; //importing java.util.* for Scanner class

public class UniversityFeeInput 
{
	public static void main(String args[])
	{
		int fee, discountPercent; //Initializing University Fee and Fee Discount Percentage
		Scanner sc=new Scanner(System.in); //Initializing Scanner object
		System.out.println("Enter the fee and discount percentage: ");
		fee=sc.nextInt(); //Inputting University Fee from user
		discountPercent = sc.nextInt(); //Inputting Discount Percent from user
		
		double discount = (discountPercent / 100.0) * fee; //Calculating Discount
		double finalfee = fee - discount; //Calculating Final University Fee
		
		//Displaying Final Output
		System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalfee);
	} //End method
} //End class
