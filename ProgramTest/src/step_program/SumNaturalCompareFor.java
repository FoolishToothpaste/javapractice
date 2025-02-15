/**A program to find the sum of n natural numbers using for loop compare the result with the formulae n*(n+1)/2 and show the result from both computations was correct.*/
package step_program;
import java.util.*; //Importing java.util.* for Scanner class

public class SumNaturalCompareFor
{
	public static void main(String args[])
	{
		int number, sum1, sum2 = 0; //Initializing variables
		Scanner sc=new Scanner(System.in); //Initializing Scanner object
		System.out.println("Enter the number of natural numbers:");
		number = sc.nextInt(); //Inputting the number of terms from the user
		
		if(number<=0) //Checking if the number of terms is a natural number
			System.out.println("The number "+ number +" is not a natural number"); //Displaying Final Output
		else
		{
			sum1 = (number * (number+1)) / 2; //Calculating the sum of n natural numbers using formulae
		
			for(int i = 1; i <= number; i++) //For Loop
			{
				sum2+= i; //Calculating the sum of n natural numbers using loop
			} //End For Loop
		
			if(sum1 == sum2) //Comparing results of the two methods
			{
				//Displaying Final Output
				System.out.println("Results matched");
				System.out.println("Sum = "+ sum1);
			} //End If Block
		} //End Else Block
	} //End Method
} //End Class