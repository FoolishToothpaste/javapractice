package sorting;
import java.util.*;

public class BubbleSort 
{
	public static int[] asc(int arr[])
	{
		int n = arr.length;
		for(int j = 0; j<n-1; j++)
		{
			for(int i = 0; i < n-j-1; i++)
			{
				if(arr[i]>arr[i+1])
				{
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
		}
		return arr;
	}
	
	public static int[] dsc(int arr[])
	{
		int n = arr.length;
		for(int i = 0; i < n-1; i++)
		{
			for(int j = 0; j < n - i - 1; j++)
			{
				if(arr[j+1]>arr[j])
				{
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Input size of the array ");
		int n = sc.nextInt();
		int arr[]=new int[n];
		
		System.out.println("Input the array: ");
		for(int i =0; i<n; i++)
			arr[i]=sc.nextInt();
		
		System.out.println("1. Ascending \n2. Decending");
		int choice = sc.nextInt();
		if(choice == 1)
			asc(arr);
		else if(choice==2)
			dsc(arr);
		else
			System.out.println("Wrong Input");
		
		System.out.println("Sorted Array: ");
		
		for(int i = 0; i<n; i++)
			System.out.print(arr[i]+" ");
	}
}
