package advancedprogramming;
import java.util.*;
import java.math.*;

public class Powersof2
{
	public static void main(String args[])
	{
		int n, i = 0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		n = sc.nextInt();
		
		System.out.println("Powers of 2:");
		do
		{
			System.out.println((int)Math.pow(2, i));
			i++;
		}
		while(i <= n);
	}
}
