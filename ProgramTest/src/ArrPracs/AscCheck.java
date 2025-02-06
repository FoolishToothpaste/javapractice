package ArrPracs;
import java.util.*;

public class AscCheck {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n = sc.nextInt();
		System.out.println("Input the array: ");
		int list[]=new int[n];
		
		for(int i=0; i<list.length; i++)
			list[i]=sc.nextInt();
		for(int i=0; i<list.length; i++) //Displaying
			System.out.print(list[i]+" ");
		System.out.println();
		
		boolean flag = true;
		for(int i=0; i<list.length-1; i++)
		{
			int a = list[i];
			int b = list[i+1];
			if(a>b)
				flag = false;
		}
		
		if(flag)
			System.out.println("List is in ascending order.");
		else
			System.out.println("List is not in ascending order.");
	}
}
