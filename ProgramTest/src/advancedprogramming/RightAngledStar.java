package advancedprogramming;

public class RightAngledStar 
{
	public static void main(String args[])
	{
		int i = 1, j = 0;
		while(i <= 5)
		{
			while(j < i)
			{
				System.out.print("*");
				j++;
			}
			i++;
			j=0;
			System.out.println();
		}
	}
}
