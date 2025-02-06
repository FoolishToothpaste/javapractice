package patterns;
import java.util.*;

public class Butterfly 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n = sc.nextInt();
		
		System.out.println("Filled Butterfly: \n");
		int m = 2 * n;
		
		for(int row=0; row <= n; row++) //Upper Half
		{
			for(int i = 0; i < row; i++)
				System.out.print("*");
			for(int i = 0; i < (m - 2 * row); i++)
					System.out.print(" ");
			for(int i = 0; i < row; i++)
				System.out.print("*");
			System.out.println();
		}
		
		for(int row = 0; row <= n; row++) //Bottom Half
		{
			for(int i = 0; i < n - row; i++)
				System.out.print("*");
			for(int i = 0; i < row * 2; i++)
				System.out.print(" ");
			for(int i = 0; i < n - row; i++)
				System.out.print("*");
			System.out.println();
		}
		System.out.println();
		
		System.out.println("Hollow Butterfly: \n");
		
		for(int row = 1; row<=n; row++) //Upper Half
		{
			
			for(int i=0; i<row; i++)
				{	
					if(i == 0 || i == row-1)
						System.out.print("*");
					else
						System.out.print(" ");
				}
			for(int i=0; i<m-(row*2); i++)
				System.out.print(" ");
			for(int i=0; i<row; i++)
			{	
				if(i == 0 || i == row-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		for(int row=n; row>0; row--) //Bottom Half
		{
			for(int i=row; i>0; i--)
			{	
				if(i == row || i == 1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			for(int i=0; i<m-(row*2); i++)
				System.out.print(" ");
			for(int i=row; i>0; i--)
			{	
				if(i == row || i == 1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
