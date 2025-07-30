/**A program to input the Principal, Rate, and Time values and calculate Simple Interest*/
package step_program;
import java.util.*; //Importing java.util.* for Scanner class

public class SimpleInterestMethod 
{
	public static double simpleInterest(double principal, int time, double rate)
	{ //Method to calculate Simple Interest
		return ((principal * time * rate) / 100.0); //Calculating Simple Interest and returning it
	} //End Method
	
	public static void main(String args[])
	{
		double principal, rate, simpleInterest; //Initializing variables
		int time;
		Scanner sc=new Scanner(System.in); //Initializing Scanner class
		System.out.println("Enter Principal, Rate and Time:"); 
		principal = sc.nextDouble(); //Inputting the principal from the user
		rate = sc.nextDouble(); //Inputting the rate of interest from the user
		time = sc.nextInt(); //Inputting the time from the user
		
		simpleInterest = simpleInterest(principal, time, rate); //Calling the method to calculate simple interest
		///Displaying Final Output
		System.out.println("The Simple Interest is "+ simpleInterest +" for Principal "+ principal +", Rate of Interest "+ rate +" and Time "+ time);
	} //End Method
} //End Class
