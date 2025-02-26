/**A program DayOfWeek that takes a date as input and prints the day of the week that the date falls on*/
package step_program;
import java.util.*; //Importing java.util.* for Scanner class

public class DayofWeek 
{
	public static void main(String args[])
	{
		int m, d, y, y0, x, m0, d0; //Initializing the variables
		Scanner sc=new Scanner(System.in); //initializing Scanner object
		System.out.println("Enter the date in the following format: Month, Day, Year");
		m = sc.nextInt(); //Inputting the month value from the user
		d = sc.nextInt(); //Inputting the day value from the user
		y = sc.nextInt(); //Inputting the year value from the user
		
		//Equations for finding out the day of the week
		y0 = y - (14 - m) / 12;
		x = y0 + y0/4 - y0/100 + y0/400;
		m0 = m + 12 * ((14 - m) / 12) - 2;
		d0 = (d + x + 31 * m0 / 12) % 7; //This value represents day of the week, 0 being Sunday
		
		System.out.println("Day of the Week, taking Sunday as 0 = " + d0); //Displaying Final Output 
	} //End Method
} //End Class
