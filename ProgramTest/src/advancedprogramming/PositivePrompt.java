package advancedprogramming;
import java.util.*;

public class PositivePrompt 
{
	public static void main(String args[])
	{
		int n;
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("Enter a positive number: ");
			n = sc.nextInt();
			if(n > 0)
				break;
		}
		while(true);
	}
}
