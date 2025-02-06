package stringtest;
import java.util.*;
import java.math.*;

public class BitDecConvert
{
	public static String rev(String s)
	{
		String rev="";
		for(int i = s.length()-1; i>=0;i--)
		{
			char c = s.charAt(i);
			rev+= c;
		}
		return rev;
	}
	public static int bin(int n)
	{
		String s = new String("");
		while(n>0)
		{
			int add = n%2;
			n = n/2;
			s+= add;
		}
		String s1=rev(s);
		return(Integer.parseInt(s1));
	}
	
	public static int digiCount(int n)
	{
		int count = 0;
		while(n>0)
		{
			count++;
			n/= 10;
		}
		return count;
	}
	
	public static double dec(int n)
	{
		double sum = 0;
		int c = digiCount(n);
		for(int i = 0; i < c; i++)
		{
			sum+= (n%10)*(Math.pow(2, i));
			n/=10;
		}
		return sum;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("1. Decimal to Binary. \n2. Binary to Decimal");
		int choice = sc.nextInt();
		
		switch(choice)
		{
			case 1:
				System.out.println("Enter Decimal Number: ");
				int n = sc.nextInt();
				int binary = bin(n);
				System.out.println("Binary form : "+binary);
				break;
				
			case 2:
				System.out.println("Enter the Binary Number: ");
				int n1 = sc.nextInt();
				double dec = dec(n1);
				System.out.println("Decimal Form : "+dec);
				break;
		}
	}

}
