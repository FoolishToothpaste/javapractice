/**A program to input marks and 3 subjects physics, chemistry and maths and compute the percentage and calculate the grade */
package step_program;
import java.util.*; //Importing java.util.* for Scanner class

public class MarksGrade 
{
	public static void main(String args[])
	{
		int physics, chemistry, maths; //Initializing variables
		double percentage;
	
		Scanner sc=new Scanner(System.in); //Initializing Scanner object
		System.out.println("Enter the marks in Physics, Chemistry and Maths:");
		physics = sc.nextInt(); //Inputting the Physics marks from the user
		chemistry = sc.nextInt(); //Inputting the Chemistry marks from the user
		maths = sc.nextInt(); //Inputting the Maths marks from the user
		
		percentage = (physics + chemistry + maths) / 3.0; //Calculating the percentage
		System.out.println("Average Marks = " + percentage); //Displaying Final Output
		
		if(percentage >= 80) //Checking which Grade the student will get
			System.out.println("Grade A : Level 4, above agency-normalized standards"); //Displaying Final Output
		else if(percentage >= 70)
			System.out.println("Grade B : Level 3, at agency-normalized standards"); //Displaying Final Output
		else if(percentage >= 60)
			System.out.println("Grade C : Level 2, below, but approaching agency-normalized standards"); //Displaying Final Output
		else if(percentage >= 50)
			System.out.println("Grade D : Level 1, well below agency-normalized standards"); //Displaying Final Output
		else if(percentage >= 40)
			System.out.println("Grade E : Level 1-, too below agency-normalized standards"); //Displaying Final Output
		else //Below 40, end of if else ladder
			System.out.println("Grade R : Remedial status"); //Displaying Final Output
	} //End Method
} // End Class