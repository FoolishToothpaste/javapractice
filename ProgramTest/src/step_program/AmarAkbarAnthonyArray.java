/**A program to find the youngest friends among 3 Amar, Akbar, and Anthony based on their ages and the tallest among the friends based on their heights*/
package step_program;
import java.util.*; //Importing java.util.* for Scanner class

public class AmarAkbarAnthonyArray 
{
	public static void main(String args[])
	{
		int age[] = new int[3]; //Initializing the array to store the ages of the three
		double height[] = new double[3]; //Initializing the array to store the heights of the three
		String name[] = {"Amar", "Akbar", "Anthony"}; //Initializing the array to store the names of the three
		int agemin = 0, ageindex = 0, heightindex = 0; //Initializing variables
		double heightmax = 0.0;
		Scanner sc=new Scanner(System.in); //Initializing Scanner object
		
		System.out.println("Enter the ages of Amar, Akbar and Anthony:");
		for(int i = 0; i < 3; i++)
			age[i] = sc.nextInt(); //Inputting the ages of the three from the user
		
		System.out.println("Enter the heights of Amar, Akbar and Anthony:");
		for(int i = 0; i < 3; i++) //For Loop
			height[i] = sc.nextDouble(); //Inputting the heights of the three from the user
		
		for(int i = 0; i < 3; i++) //For Loop
			if(age[i] < agemin) //Checking for minimum age
			{
				agemin = age[i]; 
				ageindex = i; //Finding the index of minimum age and storing it in ageindex
			} //End If Block
		
		for(int i = 0; i < 3; i++) //For Loop 
			if(height[i] > heightmax) //Checking for maximum age
			{
				heightmax = height[i]; 
				heightindex = i; //Finding the index of maximum height and storing it in heightindex
			}
		
		System.out.println(name[ageindex] + " is the youngest among the three."); //Displaying Final Output
		System.out.println(name[heightindex] + " is the tallest among the three"); //Displaying Final Output
	} //End Method
} //End Class
