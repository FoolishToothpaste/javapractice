package advancedprogramming;
import java.util.*;

public class OneToNWhile 
{
	public static void main(String args[])
	{
		int n, i = 1;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		n = sc.nextInt();
		
		while(i <= n)
		{
			System.out.print(i + " ");
			i++;
		}
	}
}
