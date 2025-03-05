/**A program to input marks and 3 subjects physics, chemistry and maths and compute the percentage and calculate the grade of several students using 2D Array*/
package step_program;
import java.util.*; //Importing java.util.* for Scanner class

public class MarksGrade2DArray
{
	public static void main(String args[])
	{
		int number; //Initializing the number variable
		Scanner sc=new Scanner(System.in); //Initializing Scanner object
		System.out.println("Enter the number of Students:");
		number = sc.nextInt(); //Inputting the number of student from the user
		
		int marks[][] = new int[number][3]; //Initializing a 2D Array to store the marks of the students in Physics, Chemistry and Maths
		double percentage[] = new double[number]; //Initializing the array to store the percentage marks of the students
		String grade[] = new String[number]; //Initializing the array to store the grade of the students 
		
		System.out.println("Enter the marks of the "+ number +" students in Phyics, Chemistry and Maths:");
		for(int i = 0; i < number; i++) //For Loop
		{
			System.out.println("Student " + (i + 1));
			marks[i][0] = sc.nextInt(); //Inputting the physics marks of the student
			marks[i][1] = sc.nextInt(); //Inputting the chemistry marks of the student
			marks[i][2] = sc.nextInt(); //Inputting the maths marks of the student
			
			percentage[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0; //Calculating the percentage of marks of the student
			
			if(percentage[i] >= 80) //Checking which Grade the student will get and storing relevant Grade in grade array
				grade[i] = "Grade A : Level 4, above agency-normalized standards";
			else if(percentage[i] >= 70)
				grade[i] = "Grade B : Level 3, at agency-normalized standards";
			else if(percentage[i] >= 60)
				grade[i] = "Grade C : Level 2, below, but approaching agency-normalized standards";
			else if(percentage[i] >= 50)
				grade[i] = "Grade D : Level 1, well below agency-normalized standards"; 
			else if(percentage[i] >= 40)
				grade[i] = "Grade E : Level 1-, too below agency-normalized standards"; 
			else //Below 40, end of if else ladder
				grade[i] = "Grade R : Remedial status";
		} //For Loop End
		
		for(int i = 0; i < number; i++) //For Loop
		{
			//Displaying Final Output
			System.out.println("Student " + (i + 1));
			System.out.println("Marks in Physics = " + marks[i][0]);
			System.out.println("Marks in Chemistry = " + marks[i][1]);
			System.out.println("Marks in Maths = " + marks[i][2]);
			System.out.println("Percentage = " + percentage[i] + "%");
			System.out.println("Grades : " + grade[i]);
			System.out.println();
		} //End For Loop
	} //End Method
} //End Class
