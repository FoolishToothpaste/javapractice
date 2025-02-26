/**A LeapYear program with multiple if-else statements that takes a year as input and outputs the Year is a Leap Year or not a Leap Year*/
package step_program;
import java.util.*; //Importing java.util.*

public class LeapYearWithoutLogical 
{
	public static void main(String args[])
	{
		int year; //Initializing the variables
		boolean flag = false;
		Scanner sc=new Scanner(System.in); //Initializing Scanner object
		System.out.println("Enter the year:");
		year = sc.nextInt(); //Inputting the year from the user
		
		if(year >= 1582) //Checking first condition
		{
			if(year % 4 == 0) //Checking second condition
			{
				if(year % 100 == 0) //Checking third condition
				{
					if(year % 400 == 0) //Checking fourth condition
						flag = true; //If all Condition matches
				} //Close If Block
				else
					flag = true; //If all Condition matches
			} //Close If Block
		} //Close If Block
		
		if(flag) //Final Result
			System.out.println(year + " is a Leap Year"); //Displaying Final Output
		else
			System.out.println(year + " is not a Leap Year"); //Displaying Final Output
	} //End Method
} //End Class
