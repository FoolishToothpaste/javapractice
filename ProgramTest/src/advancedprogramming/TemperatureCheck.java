package advancedprogramming;
import java.util.*;

public class TemperatureCheck
{
	public static void main(String args[])
	{
		double n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the current temperature:");
		n = sc.nextDouble();
		
		if(n > 30)
			System.out.println("It's hot!");
		else if(n > 20)
			System.out.println("It's warm.");
		else if(n > 10)
			System.out.println("It's cool.");
		else
			System.out.println("It's cold.");
	}
}
