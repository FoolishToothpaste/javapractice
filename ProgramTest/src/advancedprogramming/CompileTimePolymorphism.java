package advancedprogramming;
import java.util.*;

public class CompileTimePolymorphism 
{
	public static void bill(double cost1, double cost2)
	{
		System.out.println("\nDisplaying Bill\nPrice of Item 1 = " + cost1 + "\nPrice of item 2 = " + cost2);
	}
	
	public static void bill(double cost1, double cost2, double cost3)
	{
		System.out.println("\\nDisplaying Bill\nPrice of Item 1 = " + cost1 + "\nPrice of item 2 = " + cost2 + "\nPrice of Item 3 = " + cost3);
	}
	
	public static void bill(double cost1, double cost2, double cost3, double cost4)
	{
		System.out.println("\nDisplaying Bill\nPrice of Item 1 = " + cost1 + "\nPrice of item 2 = " + cost2 + "\nPrice of Item 3 = " + cost3 +  "\nPrice of Item 4 = " + cost4);
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		double cost1, cost2, cost3,cost4;
		while(true) {
		System.out.println("How many items do you want to bill?");
		int choice = sc.nextInt();
		if(choice == 2)
		{
			System.out.println("Enter the cost of the items:");
			cost1 = sc.nextDouble();
			cost2 = sc.nextDouble();
			bill(cost1, cost2);
		}
		else if(choice == 3)
		{
			System.out.println("Enter the cost of the items:");
			cost1 = sc.nextDouble();
			cost2 = sc.nextDouble();
			cost3 = sc.nextDouble();
			bill(cost1, cost2, cost3);
		}
		else if(choice == 4)
		{
			System.out.println("Enter the cost of the items:");
			cost1 = sc.nextDouble();
			cost2 = sc.nextDouble();
			cost3 = sc.nextDouble();
			cost4 = sc.nextDouble();
			bill(cost1, cost2, cost3, cost4);
		}
		else
		{
			System.out.println("Invalid Input");
		}
		
		System.out.println("\nDo you want to bill items again? Press 1 to continue");
		choice = sc.nextInt();
		if(choice != 1)
			break;
		}
	}
}
