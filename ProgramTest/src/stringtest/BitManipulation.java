package stringtest;
import java.util.*;

public class BitManipulation {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number and position: ");
		int n = sc.nextInt();
		int pos = sc.nextInt();
		
		System.out.println("1. Get Bit \n2.Update Bit");
		int choice = sc.nextInt();
		
		switch(choice)
		{
			case 1:
				int bitMask = 1<<pos;
				if((n & bitMask)==0)
					System.out.println("Bit is 0");
				else
					System.out.println("Bit is 1");
				break;
			case 2:
				System.out.println("1. Set Bit \n2. Clear Bit");
				int choice2 = sc.nextInt();
				switch(choice2)
				{
				case 1:
					int bitMask2 = 1<<pos;
					int bit = n | bitMask2;
					System.out.println(bit);
					break;
				case 2:
					int bitMask3 = 1<<pos;
					bitMask3 = ~(bitMask3);
					int bit2 = n & bitMask3;
					System.out.println(bit2);
					break;
				}
		}
	}

}
