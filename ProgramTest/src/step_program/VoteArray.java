/**A program to take user input for the age of all 10 students in a class and check whether the student can vote depending on his/her age is greater or equal to 18*/
package step_program;
import java.util.*; //Importing java.util.* for Scanner class

public class VoteArray 
{
	public static void main(String args[])
	{
		int arr[] = new int[10]; //Initializing the array to store the ages of the 10 students
		System.out.println("Enter the ages of the 10 students:");
		Scanner sc=new Scanner(System.in); //Initializing Scanner class
		for(int i = 0; i < arr.length; i++) //For Loop
		{
			arr[i] = sc.nextInt(); //Inputting 10 elements of the array one by one from the user
		} //End For Loop
		
		for(int i = 0; i < arr.length; i++) //For Loop
		{
			if(arr[i] < 0) //Checking if age is negative
				System.out.println("Invalid Age"); //Displaying Final Output
			else if(arr[i] < 18) //Checking if age is less than 18
				System.out.println("The student with the age "+ arr[i] +" cannot vote."); //Displaying Final Output
			else
				System.out.println("The student with the age "+ arr[i] +" can vote."); //Displaying Final Output
		} //End For Loop
	} //End Method
} //End Class
