/**A program to find the bonus of employees based on their years of service*/
package step_program;
import java.util.*; //Importing java.util.* for Scanner class

public class BonusAmount 
{
	public static void main(String args[])
	{
		double salary, bonusP = 0.05, bonus = 0; //Initializing variables
		int year;
		
		Scanner sc=new Scanner(System.in); //Initializing Scanner object
		System.out.println("Enter the year(s) of service and salary:"); 
		year = sc.nextInt(); //Inputting year of service of the employee from the user
		salary = sc.nextDouble(); //Inputting salary of employee from the user
		
		if(year > 5) //Checking if the year of service is more than 5
			bonus = salary * bonusP; //Calculating bonus amount
		
		System.out.println("The bonus amount = "+ bonus); //Displaying Final Output
	} //End Method
} //End Class
