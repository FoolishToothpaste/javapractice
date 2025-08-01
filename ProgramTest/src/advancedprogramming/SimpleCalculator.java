package advancedprogramming;
import java.util.*;

public class SimpleCalculator 
{
	public static void main(String args[])
	{
		int a, b, n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers to calculate on:");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("Enter 1 for addition or 2 for subtraction.");
		n = sc.nextInt();
		
		if(n == 1)
			System.out.println("Sum = " + (a+b));
		else if(n == 2)
			System.out.println("Difference = " + (a-b));
		else
			System.out.println("Invalid choice.");
	}
}
