package sorting;
import java.util.*;

public class SelectionSort
{
	public static int[] asc(int arr[])
	{
		int n = arr.length;
		for(int i = 0; i<n-1; i++)
		{
			int smallest = i;
			for(int j = i+1; j<n; j++)
				if(arr[j] < arr[smallest])
					smallest = j;
			int temp = arr[i];
			arr[i] = arr[smallest];
			arr[smallest] = temp;
		}
		return arr;
	}
	
	public static int[] dsc(int arr[])
	{
		int n = arr.length;
		for(int i = 0; i < n-1; i++)
		{
			int largest = i;
			for(int j=i+1; j<n; j++)
				if(arr[largest]<arr[j])
					largest = j;
			int temp = arr[largest];
			arr[largest]=arr[i];
			arr[i]=temp;
		}
		return arr;
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n = sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Input the elements of the array: ");
		for(int i = 0; i<n; i++)
			arr[i]=sc.nextInt();
		
		System.out.println("1. Ascending\n2. Descending");
		int choice = sc.nextInt();
		if(choice == 1)
			asc(arr);
		else if(choice == 2)
			dsc(arr);
		
		for(int i=0; i<n; i++)
			System.out.print(arr[i]+" ");
	}

}
