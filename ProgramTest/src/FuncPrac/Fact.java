package FuncPrac;
import java.util.*;

public class Fact 
{
	public static int Factorial(int n)
	{
		int prod = 1;
		for(int i=1; i<=n ; i++)
			prod*=i;
		return prod;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number you want to find the factorial of: ");
		int num = sc.nextInt();
		if(num>0)
		{
			int p = Factorial(num);
			System.out.println("Factorial = "+p);
		}
		else
			System.out.println("Invalid Input");
	}

}
