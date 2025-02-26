/**A LeapYear program with logical operators that takes a year as input and outputs the Year is a Leap Year or not a Leap Year*/
package step_program;
import java.util.*; //Importing java.util.*

public class LeapYearWithLogical 
{
	public static void main(String args[])
	{
		int year; //Initializing the variables
		boolean flag = false;
		Scanner sc=new Scanner(System.in); //Initializing Scanner object
		System.out.println("Enter the year:");
		year = sc.nextInt(); //Inputting the year from the user
		
		if(year >= 1582 && year % 4 == 0 && (year % 400 == 0 || year % 100 != 0)) //Checking all the Conditions at once using logical operators
			System.out.println(year + " is a Leap Year"); //Displaying Final Output
		else
			System.out.println(year + " is not a Leap Year"); //Displaying Final Output
	} //End Method
} //End Class
