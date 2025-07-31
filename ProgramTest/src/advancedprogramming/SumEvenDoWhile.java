package advancedprogramming;
import java.util.*;

public class SumEvenDoWhile 
{
	public static void main(String args[])
	{
		int n, sum = 0, i = 1;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		n = sc.nextInt();
		
		do
		{
			if(i % 2 == 0)
				sum+= i;
			i++;
		}
		while(i <= n);
		
		System.out.println("Sum = " + sum);
	}
}
