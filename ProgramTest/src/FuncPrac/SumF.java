package FuncPrac;
import java.util.*;

public class SumF 
{
	public static int Sum(int a, int b)
	{
		int sum = a+b;
		return sum;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two numbers");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int S = Sum(x,y);
		System.out.println("Sum = "+S);
	}

}
