/**A program to save odd and even numbers into odd and even arrays between 1 to the number entered by the user and print the odd and even numbers array*/
package step_program;
import java.util.*; //Importing java.util.* for Scanner class

public class EvenOddArrays 
{
	public static void main(String args[])
	{
		int number; //Initializing the number variable
		System.out.println("Enter the number to store and print to: ");
		Scanner sc=new Scanner(System.in); //Initializing Scanner object
		number = sc.nextInt(); //Inputting the number from the user
		
		if(number > 0) //Checking if the number is a natural number
		{
			int even[] = new int[(number / 2) + 1]; //Initializing the array to store the even numbers
			int odd[] = new int[(number / 2) + 1]; //Initializing the array to store the odd numbers
			int m = 0, n = 0; //Initializing the index variables
			
			for(int i = 1; i <= number; i++) //For Loop
			{
				if(i % 2 == 0) //Checking if the number is even
				{
					even[m] = i; //Inserting the number to the even array
					m++; //Incrementing the index tracker of the even array by 1
				} //End If Block
				else //If the number is odd
				{
					odd[n] = i; //Inserting the number to the odd array
					n++; //Incrementing the index tracker of the odd array by 1
				} //End Else Block
			} //End For Loop
		
			System.out.println("Even Array:"); //Displaying Final Output
			for(int i = 0; i < m; i++)  //For Loop
				System.out.print(even[i] + " ");  //Displaying Final Output
			System.out.println("\nOdd Array:");  //Displaying Final Output
			for(int i = 0; i < n; i++)  //For Loop
				System.out.print(odd[i] + " ");  //Displaying Final Output
		}
		else //If number is non natural
			System.out.println(number + " is not a natural number."); //Displaying Final Output
	} //End Method
} //End Class
