/**A program to find the factors of a number taken as user input and store the factors in an array, and display the factors*/
package step_program;
import java.util.*;  //Importing java.util.*

public class ArrayFactors 
{
	public static void main(String args[])
	{
		int number, maxFactor = 10, index = 0; //Initializing variables
		int factors[] = new int[maxFactor]; //Initializing 
		Scanner sc=new Scanner(System.in); //Initializing Scanner object
		System.out.println("Enter the value of the number whose factors you want to find:");
		number = sc.nextInt(); //Inputting the number from the user
		
		for(int i = 1; i < number; i++) //For Loop
		{
			if(index >= maxFactor) //Checking if the index becomes larger than the size of the factors array
			{
				maxFactor*= 2; //Doubling the size of the array
				int temp[] = new int[maxFactor]; //Creating a temporary array of double size
				System.arraycopy(factors, 0, temp, 0, index); //Copying elements from factors array to temporary array
				factors = temp; //Assigning factors array to refer to temporary array
			} //End If Block
			
			if(number % i == 0) //Checking if i is a factor of the number
			{
				factors[index] = i; //Inserting i to the factors array
				index++; //Incrementing the index of the factors array by 1
			} //End If Block
		} //End For Loop
		
		System.out.println("Factors of " + number +":");
		for(int i = 0; i < index; i++) //For Loop
			System.out.print(factors[i] + " "); //Displaying Final Output
	} //End Method
} //End Class
