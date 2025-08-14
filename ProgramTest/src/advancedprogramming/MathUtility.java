package advancedprogramming;
import java.util.*; //Importing java.util.* for Scanner class

public class MathUtility 
{
	public static int add(int a, int b) //Static method
	{
		return (a+b);
	}
	
	public int multiply(int a, int b) //Non Static method
	{
		return (a*b);
	}
	
	public static void main(String args[])
	{
		MathUtility obj1 = new MathUtility(); //Creating object of class MathUtility
		Scanner sc=new Scanner(System.in); //Initializing Scanner object
		System.out.println("Enter the values of a and b:");
		int a = sc.nextInt(); //Inputting values of a and b from user
		int b = sc.nextInt();
		
		System.out.println("Addition = " + add(a,b)); //Calling static method without object
		System.out.println("Multiplication = " + obj1.multiply(a, b)); //Calling non static method with object
	} //End Method
} //End Class
