package FuncPrac;
import java.util.*;

public class GCD 
{
	public static int greatestCD(int a, int b)
	{
		int gcd = 1;
		for(int i = 1; i <= a; i++)
			if(a%i == 0 && b%i == 0 && i>gcd)
				gcd=i;
		return gcd;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two numbers: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int gcd = greatestCD(x,y);
		System.out.println("Greatest Common Divisor = "+gcd);
	}

}
