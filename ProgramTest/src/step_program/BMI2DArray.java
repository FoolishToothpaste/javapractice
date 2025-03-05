/**A program to calculate BMI and Weight Status of several persons using 2D Array*/
package step_program;
import java.util.*; //Importing java.util.* for Scanner class

public class BMI2DArray 
{
	public static void main(String args[])
	{
		int number; //Initializing the number of persons variable
		Scanner sc=new Scanner(System.in); //Initializing Scanner object
		System.out.println("Enter the number of persons:"); 
		number = sc.nextInt(); //Inputting the number of persons from the user
		
		double[][] personData = new double[number][3]; //Initializing the array to store the weights, heights and BMI values of the persons
		String weightStatus[] = new String[number]; //Initializing the array to store the weight statuses of the persons
		
		System.out.println("Enter the weight and height of the "+ number +" persons:");
		for(int i = 0; i < number; i++) //For Loop
		{
			System.out.println("Person "+ (i+1));
			personData[i][0] = sc.nextDouble(); //Inputting the weight of the person from the user
			personData[i][1] = sc.nextDouble(); //Inputting the height of the person from the user
			personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]); //Calculating the BMI of the person
			
			if(personData[i][2] >= 40) //Checking the weight status of the person using BMI value
				weightStatus[i] = "Obese";
			else if(personData[i][2] >= 25.0)
				weightStatus[i] = "Overweight";
			else if(personData[i][2] >= 18.5)
				weightStatus[i] = "Normal";
			else
				weightStatus[i] = "Underweight";
		} //End For Loop
		
		for(int i = 0; i < number; i++) //For Loop
		{
			//Displaying Final Output
			System.out.println("Details of Person "+ (i + 1) +":");
			System.out.println("Weight = " + personData[i][0]);
			System.out.println("Height = " + personData[i][1]);
			System.out.println("BMI = " + personData[i][2]);
			System.out.println("Weight status : " + weightStatus[i]);
			System.out.println();
		} //End For Loop
	} //End Method
} //End Class
