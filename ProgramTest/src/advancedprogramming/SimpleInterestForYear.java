/**A program to input the Principal, Rate, and Time values and calculate Simple Interest*/
package advancedprogramming;
import java.util.*; //Importing java.util.* for Scanner class

public class SimpleInterestForYear
{
	public static void main(String args[])
	{
		double principal, rate, time, si; //Initializing variables
		Scanner sc=new Scanner(System.in); //Initializing Scanner object
		System.out.println("Input the principal, rate and time:"); 
		principal = sc.nextDouble(); //Inputting the principal from the user
		rate = sc.nextDouble(); //Inputting the rate of interest from the user
		time = sc.nextDouble(); //Inputting the time from the user
		
		for(int i = 1; i <= time; i++)
		{
			si = (principal * rate * i) / 100.0; //Calculating the simple interest
			//Displaying Final Output
			System.out.println("The Simple Interest is "+ si +" for Principal "+ principal +", Rate of Interest "+ rate +" at year " + i);
		}
	}
}
