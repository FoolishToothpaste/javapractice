package stringtest;
import java.util.*;

public class Bit1Count 
{
	public static int counter(int number)
	{
		int count = 0;
		while(number > 0)
		{
			number = number>>1;
			count++;
		}
		return count;
	}
	public static boolean getBit(int n, int pos)
	{
		int bitMask = 1<<pos;
		if ((bitMask & n) == 0)
			return false;
		else
			return true;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		
		int c = counter(n);
		int count = 0;
		
		for(int i = 0; i<c; i++)
		{
			if(getBit(n,i))
				count++;
		}
		
		System.out.println("Number of set bits: "+count);
	}

}
