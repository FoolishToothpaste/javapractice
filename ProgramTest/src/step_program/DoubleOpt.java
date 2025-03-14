/**A DoubleOpt program by taking a, b, and c as input values and printing the following double operations a + b *c, a * b + c, c + a / b, and a % b + c*/

package step_program;
import java.util.*; //Importing java.util.* for Scanner class

public class DoubleOpt 
{
	public static void main(String args[])
	{
		double a, b, c, op1, op2, op3, op4; //Initializing variables
		Scanner sc=new Scanner(System.in); //Initializing Scanner object
		System.out.println("Enter the three numbers: ");
		a = sc.nextDouble(); //Inputting the first number from the user
		b = sc.nextDouble(); //Inputting the second number from the user
		c = sc.nextDouble(); //Inputting the third number from the user
		
		op1 = a + b * c; //First operation
		op2 = a * b + c; //Second operation
		op3 = c + a / b; //Third operation
		op4 = a % b + c; //Fourth operation
		
		//Displaying Final Output
		System.out.println("The results of Int Operations are " + op1 +", "+ op2 +", "+ op3 +" and " + op4);
	} //End Method
} //End Class