package ArrPracs;
import java.util.*;

public class SpiralMatrix //I am really proud of this
{
			
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows and columns: ");
		int r = sc.nextInt();
		int c = sc.nextInt();
		int inp[]=new int[r*c];
		int sp[][]=new int[r][c];
		
		System.out.println("Input the numbers for the spiral:");
		for(int i=0; i<(r*c); i++)
			inp[i]=sc.nextInt();
		
		int count=1;
		int arrcount=0;
		int colStracker=0;
		int rowStracker=0;
		int rowEtracker=c-1;
		int colEtracker=r-1;
		
		while(arrcount<inp.length)
		{
			if(count==1)
			{
				for(int i=rowStracker; i<=rowEtracker; i++) //Row Right
				{
					sp[colStracker][i]=inp[arrcount];
					arrcount++;
				}
				colStracker++;
				count++;
			}
			
			else if(count==2) //Column Down
			{
				for(int i=colStracker; i<=colEtracker; i++)
				{
					sp[i][rowEtracker]=inp[arrcount];
					arrcount++;
				}		
				rowEtracker--;
				count++;
			}
			
			else if(count==3) //Row Left
			{
				for(int i=rowEtracker; i>=rowStracker; i--)
				{
					sp[colEtracker][i]=inp[arrcount];
					arrcount++;
				}
				colEtracker--;
				count++;
			}
			else //Column Up
			{
				for(int i=colEtracker; i>=colStracker; i--)
				{
					sp[i][rowStracker]=inp[arrcount];
					arrcount++;
				}
				rowStracker++;
				count=1;
			}
		}
		
		for(int i=0; i<r; i++)
			{
			for(int j=0; j<c; j++)
				System.out.print(sp[i][j]+" ");
			System.out.println();
			}
		
	}

}
