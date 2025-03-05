/**A program to calculate BMI and Weight Status of several persons*/
package step_program;
import java.util.*; //Importing java.util.* for Scanner class

public class BMIArray 
{
	public static void main(String args[])
	{
		int persons; //Initializing the number of persons variable
		Scanner sc=new Scanner(System.in); //Initializing Scanner object
		System.out.println("Enter the number of persons:"); 
		persons = sc.nextInt(); //Inputting the number of persons from the user
		
		double weight[] = new double[persons]; //Initializing the array to store the weights of the persons
		double height[] = new double[persons]; //Initializing the array to store the heights of the persons
		double BMI[] = new double[persons]; //Initializing the array to store the BMI values of the persons
		String weightStatus[] = new String[persons]; //Initializing the array to store the weight statuses of the persons
		
		System.out.println("Enter the weight and height of the "+ persons +" persons:");
		for(int i = 0; i < persons; i++) //For Loop
		{
			System.out.println("Person "+ (i+1));
			weight[i] = sc.nextDouble(); //Inputting the weight of the person from the user
			height[i] = sc.nextDouble(); //Inputting the height of the person from the user
			BMI[i] = weight[i] / (height[i] * height[i]); //Calculating the BMI of the person
			
			if(BMI[i] >= 40) //Checking the weight status of the person using BMI value
				weightStatus[i] = "Obese";
			else if(BMI[i] >= 25.0)
				weightStatus[i] = "Overweight";
			else if(BMI[i] >= 18.5)
				weightStatus[i] = "Normal";
			else
				weightStatus[i] = "Underweight";
		} //End For Loop
		
		for(int i = 0; i < persons; i++) //For Loop
		{
			//Displaying Final Output
			System.out.println("Details of Person "+ (i + 1) +":");
			System.out.println("Weight = " + weight[i]);
			System.out.println("Height = " + height[i]);
			System.out.println("BMI = " + BMI[i]);
			System.out.println("Weight status : " + weightStatus[i]);
			System.out.println();
		} //End For Loop
	} //End Method
} //End Class
