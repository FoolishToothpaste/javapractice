/**A program to input the Principal, Rate, and Time values and calculate Simple Interest*/
package step_program;
import java.util.*; //Importing java.util.* for Scanner class

public class SimpleInterest 
{
	public static void main(String args[])
	{
		double principal, rate, time, si; //Initializing variables
		Scanner sc=new Scanner(System.in); //Initializing Scanner object
		System.out.println("Input the principal, rate and time:"); 
		principal = sc.nextDouble(); //Inputting the principal from the user
		rate = sc.nextDouble(); //Inputting the rate of interest from the user
		time = sc.nextDouble(); //Inputting the time from the user
		
		si = (principal * rate * time) / 100.0; //Calculating the simple interest
		//Displaying Final Output
		System.out.println("The Simple Interest is "+ si +" for Principal "+ principal +", Rate of Interest "+ rate +" and Time " + time);
	}
}
