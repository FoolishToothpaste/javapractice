package ArrPracs;
import java.util.*;

public class Transpose
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows and columns: ");
		int r = sc.nextInt();
		int c = sc.nextInt();
		int mat[][] = new int[r][c];
		int trans[][]=new int[c][r];
		
		System.out.println("Enter the elements of the matrix: ");
		for(int i=0; i<r; i++)
			for(int j=0; j<c; j++)
				mat[i][j]=sc.nextInt();
		
		for(int i=0; i<r; i++)
			for(int j=0; j<c; j++)
				trans[j][i]=mat[i][j];
		
		System.out.println("Original Matrix:");
		for(int i=0; i<r; i++)
		{
			for(int j=0; j<c; j++)
				System.out.print(mat[i][j]+" ");
			System.out.println();
		}
		
		System.out.println("Transpose:");
		for(int i=0; i<c; i++)
		{
			for(int j=0; j<r; j++)
				System.out.print(trans[i][j]+" ");
			System.out.println();
		}
	}

}
