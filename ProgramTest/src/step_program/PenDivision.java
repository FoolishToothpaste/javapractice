/**Suppose you have to divide 14 pens among 3 students equally. A program to find how many pens each student will get if the pens must be divided equally and finding the remaining non-distributed pens.*/

package step_program;

public class PenDivision 
{
	public static void main(String args[])
	{
		int npen = 14; //Storing total number of pens
		int nstudent = 3; //Storing total number of students
		
		int npeneach = npen / nstudent; //Calculating number of pens each student gets (integer division)
		int rem = npen % nstudent; //Calculating remaining pens
		
		//Displaying final output
		System.out.println("The Pen Per Student is " + npeneach + " and the remaining pen not distributed is " + rem);
	} //End method
} //End class
