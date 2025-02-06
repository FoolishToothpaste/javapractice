/**The University is charging the student a fee of INR 125000 for the course. The University is willing to offer a discount of 10%. A program to find the discounted amount and discounted price the student will pay for the course.*/

package step_program;

public class UniversityFee 
{
	public static void main(String args[])
	{
		int fee = 125000; //Storing University Fee
		int discountPercent = 10; //Storing Fee Discount Percentage
		
		double discount = (discountPercent / 100.0) * fee; //Calculating Discount
		double finalfee = fee - discount; //Calculating Final University Fee
		
		//Displaying Final Output
		System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalfee);
	} //End Method
} //End Class
