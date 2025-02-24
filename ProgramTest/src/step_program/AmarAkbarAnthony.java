/**A program to find the youngest friends among 3 Amar, Akbar, and Anthony based on their ages and the tallest among the friends based on their heights*/
package step_program;
import java.util.*; //Importing java.util.* for Scanner class

public class AmarAkbarAnthony 
{
	public static void main(String args[])
	{
		int ageAmar, ageAkbar, ageAnthony; //Initializing the age variables
		double hAmar, hAkbar, hAnthony; //Initializing the height variables
		Scanner sc=new Scanner(System.in); //Initializing the Scanner object
		System.out.println("Enter the ages of Amar, Akbar and Anthony:");
		ageAmar = sc.nextInt(); //Inputting the age of Amar from the user
		ageAkbar = sc.nextInt(); //Inputting the age of Akbar from the user
		ageAnthony = sc.nextInt(); //Inputting the age of Anthony from the user
		System.out.println("Enter the heights of Amar, Akbar and Anthony:");
		hAmar = sc.nextDouble(); //Inputting the height of Amar from the user
		hAkbar = sc.nextDouble(); //Inputting the height of Akbar from the user 
		hAnthony = sc.nextDouble(); //Inputting the height of Anthony from the user
		
		if(ageAmar > ageAkbar) //Checking for the youngest friend among the three
		{
			if(ageAkbar > ageAnthony)
				System.out.println("Anthony is the youngest"); //Displaying Final Output
			else
				System.out.println("Akbar is the youngest"); //Displaying Final Output
		} //End If Block
		else if(ageAmar > ageAnthony)
			System.out.println("Anthony is the youngest"); //Displaying Final Output
		else
			System.out.println("Amar is the youngest"); //Displaying Final Output
		
		if(hAmar > hAkbar) //Checking for the tallest friend among the three
		{
			if(hAmar > hAnthony)
				System.out.println("Amar is the tallest"); //Displaying Final Output
			else
				System.out.println("Anthony is the tallest"); //Displaying Final Output
		} //End If Block
		else if(hAkbar > hAnthony)
			System.out.println("Akbar is the tallest"); //Displaying Final Output
		else
			System.out.println("Anthony is the tallest"); //Displaying Final Output
	} //End Method
} //End Class
