/**A program to find the smallest and the largest of the 3 numbers*/
package step_program;
import java.util.*; //Importing java.util.* for Scanner class

public class SmallestLargestMethod 
{
	public static int[] findSmallestAndLargest(int number1, int number2, int number3)
	{ //Method to find the smallest and largest numbers among the three
		int smallest, largest; //Initializing variables
		//Series of conditions
		if(number1 < number2)
		{
			if(number1 < number3)
			{
				smallest = number1;
				if(number3 > number2)
					largest = number3;
				else
					largest = number2;
			}
			else
			{
				smallest = number3;
				largest = number2;
			}
		}
		else
		{
			if(number2 < number3)
			{
				smallest = number2;
				if(number3 > number1)
					largest = number3;
				else
					largest = number1;
			}
			else
			{
				smallest = number3;
				largest = number1;
			}
		}
		
		int[] result = {smallest, largest}; //Storing the smallest and largest numbers in an array
		return result; //Returning the calculated result
	}
	
	public static void main(String args[])
	{
		int num1, num2, num3; //Initializing the variables
		Scanner sc=new Scanner(System.in); //Initializing Scanner class
		System.out.println("Enter the 3 numbers:");
		num1 = sc.nextInt(); //Inputting the first number from the user
		num2 = sc.nextInt(); //Inputting the second number from the user
		num3 = sc.nextInt(); //Inputting the third number from the user
		int[] result = findSmallestAndLargest(num1, num2, num3); //Calling the function to find the largest and smallest numbers
		System.out.println("Smallest Number = "+ result[0]); //Displaying Final Output
		System.out.println("Largest Number = "+ result[1]); //Displaying Final Output
	} //End Method
} //End Class
