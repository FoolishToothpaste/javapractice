package recursion;
import java.util.*;

public class PowerRec //Must Keep Stack Height n 
{
	public static void Power(double prod, double n, double x, int height)
	{
		if(n==0)
		{
			System.out.println("The Number = "+prod);
			System.out.println("Height of Stack = "+height);
			return;
		}
		prod*=x;
		height++;
		Power(prod,n-1,x,height);
	}
	
	//Using return statement (Stack Length = n)
	public static double Power2(double n, double x, double prod, int height)
	{
		if(n==0)
		{
			System.out.println("Height of Stack = "+height);
			return prod;
		}
		height++;
		prod = x * Power2(n-1,x,prod,height);
		return prod;
	}
	
	//Using return statement (Stack Length = log n)
	public static double Power3(double x, int n, double prod)
	{
		if(n==0)
		{
			return prod;
		}
		if(n%2 == 0)
			prod = Power3(x, n/2, prod) * Power3(x, n/2, prod);
		else
			prod = Power3(x, n/2, prod) * Power3(x, n/2, prod) * x;
		return prod;
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		double x = sc.nextDouble();
		System.out.println("Enter the power: ");
		double n = sc.nextDouble();
		int height = 1;
		double prod = 1;
		
		if(n==0)
			System.out.println("The Number = 1");
		else if(n==1)
			System.out.println("The Number = "+x);
		else if(n>1)
		{
			Power(prod,n,x,height);
			System.out.println();
			System.out.println(Power2(n,x,prod,height));
			System.out.println("\n"+Power3(x,(int)n,prod));
		}
		else
			System.out.println("Invalid Input");
	}

}
