package patterns;
import java.util.*;

public class Parallelogram {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the vaue of n: ");
		int n = sc.nextInt();
		
		System.out.println("Parallelogram or Rhombus: \n");
		for(int i=n; i>0; i--)
		{
			for(int j=0; j < i-1; j++)
				System.out.print(" ");
			for (int j=0; j < n; j++)
				System.out.print("*");
			System.out.println();
		}
		System.out.println();
		
		System.out.println("Hollow Rhombus: \n");
		for(int i = n; i>0; i--)
		{
			for(int j = 0; j<i-1; j++)
				System.out.print(" ");
			for(int j=0; j<n; j++)
			{
				if(i == n || i == 1 || j == 0 || j == n-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
