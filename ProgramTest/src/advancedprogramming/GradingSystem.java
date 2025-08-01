package advancedprogramming;
import java.util.*;

public class GradingSystem
{
	public static void main(String args[])
	{
		double n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the exam score:");
		n = sc.nextDouble();
		
		if(n >= 90)
			System.out.println("A");
		else if(n >= 80)
			System.out.println("B");
		else if(n >= 70)
			System.out.println("C");
		else if(n >= 60)
			System.out.println("D");
		else if(n < 60)
			System.out.println("F");
		else
			System.out.println("Invalid Output");
	}
}
