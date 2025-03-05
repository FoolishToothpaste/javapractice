/**A program to find the bonus of 10 employees based on their years of service and the total bonus amount the company Zara has to pay, along with the old and new salary*/
package step_program;
import java.util.*; //Importing java.util.* for Scanner class

public class BonusAmountArray 
{
	public static void main(String args[])
	{
		double salary[] = new double[10]; //Initializing the array to store the old salaries of the 10 employees
		double years[] = new double[10]; //Initializing the array to store the years of service of the 10 employees
		double newSalary[] = new double[10]; //Initializing the array to store the new salaries of the 10 employees
		double bonusAmount[] = new double[10]; //Initializing the array to store the bonus amounts of the 10 employees
		double totalBonus = 0.0, totalOldSalary = 0.0, totalNewSalary = 0.0, salaryInp, yearsInp; //Initializing the variables
		Scanner sc=new Scanner(System.in); //Initializing Scanner object
		
		System.out.println("Enter old salary and years of service for each employee:");
		for(int i = 0; i < 10; i++) //For Loop
		{
			System.out.println("Employee  "+ (i+1) + ":"); //Numbering each employee's input
			salaryInp = sc.nextDouble(); //Inputting the old salary of the employee from the user
			yearsInp = sc.nextDouble(); //Inputting the years of service of the employee from the user
			if(salaryInp <= 0 || yearsInp <= 0) //Checking if the old salary and years of service is valid
			{
				System.out.println("Invalid Input, try again."); //If invalid, asking user to input the details again
				i--; //Decrementing the index to iterate the loop again
			} //End If Block
			else //If input details are valid
			{
				salary[i] = salaryInp; //Storing input old salary value in the array
				years[i] = yearsInp; //Storing input years of service in the array
				totalOldSalary+= salary[i]; //Calculating the total old salary of the employees
			} //End Else Block
		} //End For Loop
		
		for(int i = 0; i < 10; i++) //For Loop
		{
			if(years[i] >= 5) //If years of service of the employee is greater than or equal to 5
				bonusAmount[i] = salary[i] * 0.05; //Calculating the bonus amount of the employee
			else //If years of service of employee is lesser than 5
				bonusAmount[i] = salary[i] * 0.02; //Calculating the bonus amount of the employee
			newSalary[i] = salary[i] + bonusAmount[i]; //Calculating the new salary of the employee
			totalBonus+= bonusAmount[i]; //Calculating the total bonus amount of the employees
			totalNewSalary+= newSalary[i]; //Calculating the total new salary of the employees
		} //End For Loop
		
		//Displaying Final Output
		System.out.println("Total Bonus Payout = " + totalBonus); //Displaying Final Output
		System.out.println("Total Old Salary = " + totalOldSalary);
		System.out.println("Total New Salary = " + totalNewSalary);
	} //End Method
} //End Class
