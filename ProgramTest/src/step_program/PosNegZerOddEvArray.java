/**A program to take user input for 5 numbers and check whether a number is positive,  negative, or zero and for positive numbers check if the number is even or odd and finally compare the first and last elements of the array and display if they equal, greater or less*/
package step_program;
import java.util.*; //Importing java.util.* for Scanner class

public class PosNegZerOddEvArray 
{
	public static void main(String args[])
	{
		int arr[] = new int[5]; //Initializing the array
		Scanner sc=new Scanner(System.in); //Initializing Scanner object
		System.out.println("Enter the 5 numbers of the array:");
		for(int i = 0; i < 5; i++) //For Loop
		{
			arr[i] = sc.nextInt(); //Inputting the elements of the array from the user
		} //End For Loop 
		
		for(int i = 0; i < 5; i++) //For Loop
		{
			System.out.print(arr[i] + " is ");
			if(arr[i] == 0) //Checking if the number is zero
				System.out.println("Zero"); //Displaying Final Output
			else if(arr[i] < 0) //Checking if the number is negative
				System.out.println("Negative"); //Displaying Final Output
			else //Concluding that the number is positive
			{
				System.out.print("Postive and "); //Displaying Final Output
				if(arr[i] % 2 == 0) //Checking if the number is even
					System.out.println("Even"); //Displaying Final Output
				else //Concluding that the number is odd
					System.out.println("Odd"); //Displaying Final Output
			} //End Else Block
		} //End For Loop
		
		if(arr[0] > arr[4]) //Comparing the first element of the array with the last element of the array
			System.out.println("The first element of the array is greater than the last element of the array");  //Displaying Final Output
		else if(arr[0] < arr[4])
			System.out.println("The first element of the array is smaller than the last element of the array");  //Displaying Final Output
		else
			System.out.println("The first element of the array is equal to the last element of the array");  //Displaying Final Output
	} //End Method
} //End Class
