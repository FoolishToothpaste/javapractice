package advancedprogramming;
import java.util.*;

public class VendingMachineSingleChoice
{
	public static void main(String args[])
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1 for juice or 2 for soda.");
		n = sc.nextInt();
		
		if(n == 1)
			System.out.println("Dispensing juice.");
		else if(n == 2)
			System.out.println("Dispensing soda.");
		else
			System.out.println("Invalid choice.");
	}
}
