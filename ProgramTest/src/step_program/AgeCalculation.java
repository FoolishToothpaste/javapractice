/**A program to find the age of Harry if the birth year is 2000. Assume the Current Year is 2024*/

package step_program;

public class AgeCalculation
{
	public static void main(String args[])
	{
		int currentyear = 2024; //Initializing current year
		int birthyear = 2000; //Initializing birth year
		
		int age = currentyear - birthyear; //Calculating age
		System.out.println("Harry's age in " + currentyear + " is " + age); //Displaying Final Output
	} //End method
} //End class