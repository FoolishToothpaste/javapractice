package recursion;

import java.util.*;

public class RecFibo 
{
	public static void RecurFib(int n, int i, int a, int b)
	{
		if(n<=0)
		{
			System.out.println("Invalid Input");
			return;
		}
		if(n==1)
		{
			System.out.println("1");
			return;
		}
		
		if(i>2 && i<=n)
		{
			int c = a+b;
			b = a;
			a = c;
			System.out.print(c+" ");
			RecurFib(n,i+1,a,b);
		}
		
		return;
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n = sc.nextInt();
		int i = 3;
		int a = 1;
		int b = 1;
		
		if(n>2)
			System.out.print("1 1 ");
		
		RecurFib(n,i,a,b);
	}

}
