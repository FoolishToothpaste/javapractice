/**A program to find the maximum number of handshakes among N number of students*/
package step_program;
import java.util.*; //Importing java.util.* for Scanner class

public class Handshakes 
{
	public static void main(String args[])
	{
		int numberOfStudents, maxHandshakes; //Initializing variables
		Scanner sc=new Scanner(System.in); //Initializing Scanner object
		System.out.println("Enter the number of students:");
		numberOfStudents = sc.nextInt(); //Inputting the number of students from the user
		
		maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2; //Calculating the maximum number of handshakes possible
		System.out.println("Maximum Number of Handshakes = "+ maxHandshakes); //Displaying Final Output
	} //End method
} //End class
