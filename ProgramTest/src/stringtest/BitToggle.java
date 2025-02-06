package stringtest;
import java.util.*;

public class BitToggle 
{
	public static boolean getBit(int n, int pos)
	{
		int bitMask = 1<<pos;
		if((n & bitMask)== 0)
			return true;
		else 
			return false;
	}
	
	public static void setBit(int n, int pos)
	{
		int bitMask = 1<<pos;
		int setbitint = (n | bitMask);
		System.out.println(setbitint);
	}
	
	public static void clearBit(int n, int pos)
	{
		int bitMask = 1<<pos;
		bitMask = ~(bitMask);
		int clearbitint = (n & bitMask);
		System.out.println(clearbitint);
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number and position of toggle:");
		int n = sc.nextInt();
		int pos = sc.nextInt();
		
		if(getBit(n,pos))
			setBit(n,pos);
		else
			clearBit(n,pos);
	}

}
