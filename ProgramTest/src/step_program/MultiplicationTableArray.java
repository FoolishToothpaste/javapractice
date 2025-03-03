/**A program to print a multiplication table of a number using integer array*/
package step_program;
import java.util.*; //Importing java.util.* for Scanner class

public class MultiplicationTableArray 
{
	public static void main(String args[])
	{
		int number; //Initializing number variable
		int arr[] = new int[10]; //Initializing integer array for storing the multiplication values
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to find the multiplication table of:"); 
		number = sc.nextInt(); //Inputting the number from the user
		
		for(int i = 1; i <= 10; i++) //For Loop
			arr[i-1] = i * number; //Calculating the multiples and storing them in the array
		
		System.out.println("The multiplication table of "+ number +":");
		for(int i = 1; i <= 10; i++) //For Loop
			System.out.println(number +" * "+ i +" = "+ arr[i-1]); //Displaying Final Output
	} //End Method
} //End Class
