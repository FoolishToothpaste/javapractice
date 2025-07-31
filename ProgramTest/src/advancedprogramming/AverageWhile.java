package advancedprogramming;
import java.util.*;

public class AverageWhile 
{
	public static void main(String args[])
	{
		int n, sum = 0, counter = 0, choice;
		double average;
		Scanner sc=new Scanner(System.in);
	
		while(true)
		{
			System.out.print("Enter a number: ");
			n = sc.nextInt();
			counter++;
			sum+= n;
			System.out.println("Do you want to enter another number? Press 1 for YES, anything else for NO");
			choice = sc.nextInt();
			if(choice != 1)
				break;
		}	
	
		average = (double) sum / counter;
		System.out.println("Average = " + average);
	}
}
