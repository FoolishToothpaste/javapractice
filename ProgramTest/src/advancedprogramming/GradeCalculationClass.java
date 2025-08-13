package advancedprogramming;
import java.util.*; //Importing java.util.* for Scanner class

class Student
{ 
	String name; //Attributes of the class
	int rollNumber;
	int marks;
	
	public char calculateGrade() //Non static method to return the grade of the student based on marks
	{
		if(marks > 90) //Else If Ladder
			return 'A';
		else if(marks > 80)
			return 'B';
		else if(marks > 70)
			return 'C';
		else if(marks > 60)
			return 'D';
		else
			return 'F';
	} //End Method
} //End Class

public class GradeCalculationClass 
{ //Main Class
	public static void main(String args[])
	{
		Student obj = new Student(); //Creating object of the Student class
		Scanner sc = new Scanner(System.in); //Initializing Scanner object
		System.out.println("Enter the details of the Student:"); 
		obj.name = sc.nextLine(); //Inputting the details of the student from the user
		obj.rollNumber = sc.nextInt();
		obj.marks = sc.nextInt();
		
		//Displaying Final Output
		System.out.println("\nStudent Details :\nName = " + obj.name + "\nRoll Number = " + obj.rollNumber + "\nMarks = " + obj.marks);
		System.out.println("Grade = " + obj.calculateGrade()); //Printing grade using calculateGrade() method
	} //End Method
} //End Class
