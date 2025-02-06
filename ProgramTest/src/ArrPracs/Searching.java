package ArrPracs;
import java.util.*;
public class Searching 
{
	
	public static void linear1D()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n = sc.nextInt();
		
		int marks[]=new int[n];
		for(int i=0; i<n; i++) //Input
			marks[i]=sc.nextInt();
		for(int i=0; i<n; i++) //Display
			System.out.print(marks[i]+" ");
		
		System.out.println();
		System.out.println("Enter the number to be searched: ");
		int s = sc.nextInt();
		
		//Linear Search
		boolean flag = false;
		for(int i=0; i<n; i++)
		{
			if(marks[i]==s)
			{
				System.out.println("Search Successful, found at index: "+i);
				flag = true;
				break;
			}
		}
		if(flag==false)
			System.out.println("Search Unsuccessful");

	}
	
	public static void linear2D()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows and columns:");
		int r = sc.nextInt();
		int c = sc.nextInt();
		int m[][] = new int[r][c];
		System.out.println("Enter the elements of the matrix");
		for(int i=0; i<r; i++)
		{
			System.out.println("Row "+(i+1)+": ");
			for(int j = 0; j<c; j++)
				m[i][j]=sc.nextInt();
			System.out.println();
		}
		
		for(int i = 0; i<r; i++) //Display
		{
			for(int j = 0; j<c; j++)
				System.out.print(m[i][j]+" ");
			System.out.println();
		}
		
		System.out.println("Enter the number to be searched: ");
		int s = sc.nextInt();
		boolean flag = false;
		
		for(int i=0; i<r; i++)
		{
			for(int j=0; j<c; j++)
				if(m[i][j]==s)
				{
					flag = true;
					System.out.println("Search Successful, and the index is: "+i+", "+j);
					break;
				}
		}
		if(flag==false)
			System.out.println("Search Unsuccessful");
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("1. Linear Search 1D \n2. Linear Search 2D\n");
		int choice = sc.nextInt();
		
		switch(choice)
		{
		case 1:
			linear1D();
			break;
		case 2:
			linear2D();
			break;
		}
	}
}
