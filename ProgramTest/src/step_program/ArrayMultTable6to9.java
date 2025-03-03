/**A program to find the multiplication table of a number entered by the user from 6 to 9 and display the result*/
package step_program;
import java.util.*; //Importing java.util.* for Scanner class

public class ArrayMultTable6to9 
{
	public static void main(String args[])
	{
		int number; //Initializing number variable
		int arr[] = new int[4]; //Initializing integer array for storing the multiplication values
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to find the multiplication table of:"); 
		number = sc.nextInt(); //Inputting the number from the user
		
		for(int i = 6; i <= 9; i++) //For Loop
			arr[i-6] = i * number; //Calculating the multiples and storing them in the array
		
		System.out.println("The multiplication table of "+ number +":");
		for(int i = 6; i <= 9; i++) //For Loop
			System.out.println(number +" * "+ i +" = "+ arr[i-6]); //Displaying Final Output
	} //End Method
} //End Class
