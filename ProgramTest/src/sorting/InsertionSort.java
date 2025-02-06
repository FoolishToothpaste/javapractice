package sorting;
import java.util.*;

public class InsertionSort 
{
	public static int[] asc(int arr[])
	{
		int n = arr.length;
		for(int i = 1; i<n; i++)
		{
			int key = arr[i];
			int j = i-1;
			while(j>=0 && arr[j]>key)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
		return arr;
	}
	
	public static int[] dsc(int arr[])
	{
		int n = arr.length;
		for(int i = 1; i<n ; i++)
		{
			int key = arr[i];
			int j = i-1;
			while(j>=0 && arr[j]<key)
			{
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		 }
		return arr;
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n = sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements of the array: ");
		for(int i=0; i<n; i++)
			arr[i] = sc.nextInt();
		
		System.out.println("1. Ascending \n2. Descending");
		int choice = sc.nextInt();
		
		if(choice == 1)
			arr = asc(arr);
		else if(choice == 2)
			arr = dsc(arr);
		
		for(int i = 0; i<n; i++)
			System.out.print(arr[i]+" ");
	}

}
