package patterns;
import java.util.*;

public class Diamond {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n = sc.nextInt();
		int b = n;
		
		for(int i = 0; i < n; i++) //Upper Half
		{
			for(int j = 1; j<b; j++)
				System.out.print("  ");
			for(int j = 0; j<(i*2+1); j++)
				System.out.print("* ");
			System.out.println();
			b--;		
		}
		
		b = n;
		for(int i = 1; i <= n; i++) //Bottom Half
		{
			for(int j = 1; j < i; j++)
				System.out.print("  ");
			for(int j = 0; j < (b*2-1); j++)
				System.out.print("* ");
			System.out.println();
			b--;
		}
		
	}

}
