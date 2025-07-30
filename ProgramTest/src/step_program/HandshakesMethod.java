/**A program to find the maximum number of handshakes among N number of students*/
package step_program;
import java.util.*; //Importing java.util.* for Scanner class

public class HandshakesMethod
{
	public static int maxHandshakes(int n)
	{ //Method for calculating maximum handshakes for n students
		return ((n * (n - 1)) / 2); //Returning result using formula
	} //End Method
	
	public static void main(String args[])
	{
		int n, maxHandshakes; //Initializing variables
		Scanner sc=new Scanner(System.in); //Initializing Scanner class
		System.out.println("Enter the number of students:");
		n = sc.nextInt(); //Inputting the number of students from the user
		maxHandshakes = maxHandshakes(n); //Calling the function to calculate maximum handshakes
		//Displaying Final Output
		System.out.println("The total number of handshakes possible for "+ n +" students = "+ maxHandshakes);
	} //End Method
} //End Class