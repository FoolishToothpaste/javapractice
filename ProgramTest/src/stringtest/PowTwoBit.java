package stringtest;
import java.util.*;

public class PowTwoBit 
{
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		
		if(((n-1) & n) == 0)
			System.out.println("It is a power of 2");
		else
			System.out.println("It is not a power of two");
	}

}
