/**A program to find the mean height of players present in a football team*/
package step_program; 
import java.util.*; //Importing java.util.* for Scanner class

public class FootballTeamHeightMean 
{
	public static void main(String args[])
	{
		double height[] = new double[11]; //Initializing the array to store the height values
		double sum = 0, mean; //Initializing variables
		Scanner sc=new Scanner(System.in); //Initializing Scanner object
		System.out.println("Enter the heights of the players:");
		for(int i = 0; i < height.length; i++) //For Loop
			height[i] = sc.nextDouble(); //Inputting the height values of the football players from the user
		
		for(int i = 0; i < height.length; i++) //For Loop
			sum+= height[i]; //Calculating the sum of the elements in the array
		
		mean = sum / 11; //Calculating the mean of the height values of the football players 
		System.out.println("The mean of the heights of the football players = "+ mean); //Displaying Final Output
	} //End Method
} //End Class
