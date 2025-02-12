/**A program to find the total income of a person by taking salary and bonus from user*/
package step_program;
import java.util.*; //Importing java.util.* for Scanner class

public class SalaryBonus 
{ 
	public static void main(String args[])
	{
		double income, bonus, salary; //Initializing variables
		Scanner sc=new Scanner(System.in); //Initializing Scanner object
		System.out.println("Enter the income and bonus of the employee:"); 
		income = sc.nextDouble(); //Inputting the income of the employee from the user
		bonus = sc.nextDouble(); //Inputting the bonus of the employee from the user
		
		salary = income + bonus; //Calculating the salary of the employee
		//Displaying Final Output
		System.out.println("The salary is INR "+ income +" and bonus is INR "+ bonus +". Hence Total Income is INR "+ salary);
	} //End method
} //End class
