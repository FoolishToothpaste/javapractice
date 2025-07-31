package advancedprogramming;
import java.util.*;

public class MultTableNdowhile
{
	public static void main(String args[])
	{
		int n, i =1;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		n = sc.nextInt();
		
		do
		{
			System.out.println(n + " * " + i + " = " + (n*i));
			i++;
		}
		while(i <= 10);
	}
}
