/**A Java program to create a 2D Array and Copy the 2D Array into a single dimension array*/
package step_program;
import java.util.*; //Importing java.util.* for Scanner class

public class TwoDToOneDArr 
{
	public static void main(String args[])
	{
		int rows, columns, index = 0; //Initializing variables
		Scanner sc=new Scanner(System.in); //Initializing Scanner object
		System.out.println("Enter the rows and columns of the 2D Array:");
		rows = sc.nextInt(); //Inputting the number of rows in the 2D Array from the user
		columns = sc.nextInt(); //Inputting the number of columns in the 2D Array from the user
		
		int array2D[][] = new int[rows][columns]; //Initializing the 2D array
		int array[] = new int[rows * columns]; //Initializing the 1D array
		
		System.out.println("Enter the elements of the 2D Array:");
		for(int i = 0; i < rows; i++) //For Loop 1
			for(int j = 0; j < columns; j++) //For Loop 2
				array2D[i][j] = sc.nextInt(); //Inputting the elements of the 2D array

		for(int i = 0; i < rows; i++) //For Loop 1
			for(int j = 0; j < columns; j++) //For Loop 2
				{
				array[index] = array2D[i][j]; //Inserting the elements of the 2D array into the 1D array
				index++; //Incrementing the index of the 1D array by 1
				} //End Loop 2
		
		System.out.println("2D Array:");
		for(int i = 0; i < rows; i++) //For Loop 1
		{
			for(int j = 0; j < columns; j++) //For Loop 2
				System.out.print(array2D[i][j] + " "); //Displaying Final Output
			System.out.println(); //Moving cursor to next line to print next row
		} //End Loop 1
		System.out.println("\n1D Array:");
		for(int i = 0; i < index; i++) //For Loop
			System.out.print(array[i] + " "); //Displaying Final Output
	} //End Method
} //End Class
