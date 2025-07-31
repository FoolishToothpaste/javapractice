package advancedprogramming;
import java.util.*;

public class OddNumbersPrinter 
{
	public static void main(String args[])
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		n = sc.nextInt();
		
		for(int i = 1; i <= n; i++)
		{
			if(i % 2 != 0)
				System.out.println(i);
		}
	}
}
