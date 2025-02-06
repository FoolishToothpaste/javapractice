package FuncPrac;
import java.util.*;

public class Fibonacci 
{
	public static void Fibo(int n)
	{
		if(n==0)
			System.out.println("");
		else if(n==1)
			System.out.println("1");
		else if(n==2)
			System.out.println("1 1");
		else if(n>2)
		{
			int sum = 0;
			int a = 1;
			int b = 1;
			System.out.print("1 1 ");
			for(int i = 2; i<n; i++)
			{
				sum= a+b;
				a = b;
				b = sum;
				System.out.print(sum+" ");
			}
		}
	}
	
	public static void main(String[] args) 
	{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number of terms: ");
			int n = sc.nextInt();
			Fibo(n);
	}

}
