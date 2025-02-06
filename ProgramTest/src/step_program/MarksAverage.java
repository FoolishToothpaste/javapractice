/**Sam’s mark in Maths is 94, Physics is 95 and Chemistry is 96 out of 100. A program to find the average percent mark in PCM*/


package step_program;

public class MarksAverage 
{
	public static void main(String args[])
	{
		int maths = 94; //Storing Sam's Maths marks
		int physics = 95; //Storing Sam's Physics marks
		int chemistry = 96; //Storing Sam's Chemistry marks
		int sum = maths + physics + chemistry; //Calculating Sum of the three marks
		
		double average = sum / 3.0; //Calculating Average of the three marks
		
		System.out.println("Sam’s average mark in PCM is " + average); //Displaying Average of the three marks
	} //End method
} //End class
