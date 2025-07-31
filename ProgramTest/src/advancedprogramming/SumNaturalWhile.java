package advancedprogramming;
import java.util.*;

public class SumNaturalWhile 
{
	public static void main(String args[])
	{
		int n, i = 1, sum = 0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		n = sc.nextInt();
		
		while(i <= n)
		{
			sum+= i;
			i++;
		}
		
		System.out.println("Sum of the Natural Numbers = " + sum); 
	}
}
