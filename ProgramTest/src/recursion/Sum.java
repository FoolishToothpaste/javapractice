package recursion;
import java.util.*;

public class Sum 
{
	public static void numSum(int n, int sum)
	{
		sum+= n;
		if(n==0)
		{
			System.out.println("Sum = "+sum);
			return;
		}
		
		numSum(n-1,sum);
	}
	
	public static void Fact(int n, int fact)
	{
		if(n==0)
		{
			System.out.println("Factorial = "+fact);
			return;
		}
		fact*= n;
		Fact(n-1, fact);
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value ");
		int sum = 0;
		int n = sc.nextInt();
		numSum(n,sum);
		
		int fact = 1;
		Fact(n,fact);
	}

}
