package advancedprogramming;
import java.util.*;

class Bank
{
	double rate = 9.8;
	public double rateOfInterest(double p, int t)
	{
		return (p * t * rate / 100.0);
	}
}

class SBI extends Bank
{
	double rate = 3.6;
	public double rateOfInterest(double p, int t) //Method Overriding
	{
		return (p * t * rate / 100.0);
	}
}

class ICIC extends Bank
{
	double rate = 4.2;
	public double rateOfInterest(double p, int t)
	{
		return (p * t * rate / 100.0);
	}
}

class HDFC extends Bank
{
	double rate = 7.0;
	public double rateOfInterest(double p, int t)
	{
		return (p * t * rate / 100.0);
	}
}

public class RunTimePolymorphism 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the principle and time:");
		double principle = sc.nextDouble();
		int time = sc.nextInt();
		
		Bank b = new Bank();
		SBI s = new SBI();
		ICIC i = new ICIC();
		HDFC h = new HDFC();
		
		System.out.println("Simple Interest in :\nStandard Bank = " + b.rateOfInterest(principle, time) + "\nSBI = " + s.rateOfInterest(principle, time) + "\nICIC = " + i.rateOfInterest(principle, time) + "\nHDFC = " + h.rateOfInterest(principle, time));
	}
}
