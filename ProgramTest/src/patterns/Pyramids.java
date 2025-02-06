package patterns;
import java.util.*;

public class Pyramids 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rows of the pyramid: ");
		int n = sc.nextInt();
		
		System.out.println("Normal Pyramid: \n");
		
		for(int i = 0; i<n ; i++)
		{
			for(int j = 0; j <= i; j++)
				System.out.print("*");
			System.out.println();
		}
		
		System.out.println("Upside Down Pyramid: \n");
		
		for(int i = n; i>0 ; i--)
		{
			for(int j = 0; j < i; j++)
				System.out.print("*");
			System.out.println();
		}
		
		System.out.println("Reverse Pyramid: \n");
		
		for(int i = 1; i<=n ; i++)
		{
			for(int j = n-i; j >= 0; j--)
				System.out.print(" ");
			for(int j=i;j>=1;j--)
				System.out.print("*");
			System.out.println();
		}
		
		System.out.println("Upside Down Reverse Pyramid: \n");
		
		int k = 0;
		for(int i = n; i>0 ; i--)
		{
			if(k>0)
			{
				for(int j=0; j<n-i; j++)
					System.out.print(" ");
			}
			for(int j = 0; j < i; j++)
				System.out.print("*");
			System.out.println();
			k++;
		}

		System.out.println("Floyd's Triangle: \n");
		
		int d = 1;
		for(int i = 0; i<n ; i++)
		{
			for(int j = 0; j <= i; j++)
			{
				if(d%2==0)
					System.out.print("0 ");
				else
					System.out.print("1 ");
				d++;
			}
			System.out.println();
		}
		
		System.out.println("Number Pyramid: \n");
		
		int b = 1;
		for(int i = n; i>0 ; i--)
		{
			for(int j = i - 1; j>0; j--)
				System.out.print(" ");
			for(int j=0; j<b; j++)
				System.out.print(b+" ");
			System.out.println();
			b++;
		}
		
		System.out.println("Palindrome Pyramid: \n");
		
		int f = 1;
		for(int i = n; i>0 ; i--)
		{
			for(int j = i - 1; j>0; j--)
				System.out.print("  ");
			for(int j=1; j<=f; j++)
				System.out.print(j+" ");
			for(int j=f-1; j>0;j--)
				System.out.print(j+" ");
			System.out.println();
			f++;
		}
		
		System.out.println("Pascal's Triangle: \n");
		//Couldn't figure it out yet
				
	}
}
