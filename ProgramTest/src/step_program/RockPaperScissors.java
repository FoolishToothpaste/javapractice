package step_program;
import java.util.*; //Importing java.util.* for Scanner class

public class RockPaperScissors 
{	
	public static int computerChoice()
	{ //Method to find the choice of the computer
		return ((int) (Math.floor(Math.random() * 3) + 1)); //Returning a random integer from 1 to 3
	} //End Method
	
	public static void printChoice(int a)
	{ //Method to convert the integer choice to a displayable output
		if(a == 1)
			System.out.print(" Rock"); //1 means Rock
		else if(a == 2)
			System.out.print(" Paper"); //2 means Paper
		else
			System.out.print( " Scissors"); //3 means Scissors
		System.out.println(); //Printing a blank line for clean output
	} //End Method
	
	public static boolean game(int computer, int player)
	{ //Method to run the algorithm of the actual game
		if((computer == 3 && player == 1) || ((computer + 1) == player)) //Cases in which the player wins
		{
			System.out.println("You Won!"); 
			return true; //Storing a true value in the boolean game tracking chart
		}
		else
		{
			System.out.println("You Lost :("); 
			return false; //Storing a false value in the boolean game tracking chart
		}
	} //End Method
	
	public static void stats(boolean[] chart)
	{ //Method to display player / computer status
		int wins = 0, total = chart.length;
		System.out.println("\nGAME\tWINNER\n");
		for(int i = 0; i < total; i++)
		{
			System.out.println((i + 1) + (chart[i] ? "\tPlayer" : "\tComputer")); //Displaying winners of each game
			if(chart[i])
				wins++;
		}
		
		//Calculating and displaying player and computer win averages and percentages
		double averageu = (double) wins / total;
		double percentageu = averageu * 100;
		double averagec = 1 - averageu;
		double percentagec = 100 - percentageu;
		System.out.println("\nSTATS:");
		System.out.println("\nWinning Average of User = " + averageu);
		System.out.println("Winning Percentage of User = " + percentageu);
		System.out.println("Winning Average of Computer = " + averagec);
		System.out.println("Winning Percentage of Computer = " + percentagec);
	} //End Method
	
	public static void main(String args[])
	{
		int userchoice, computerchoice, n; //Initializing variables
		Scanner sc=new Scanner(System.in); //Initializing Scanner object
		System.out.println("Enter the number of games:");
		n = sc.nextInt(); //Inputting the number of games from the user
		boolean[] chart = new boolean[n]; //Initializing the game chart
		
		for(int i = 0; i < n; i++)
		{ //Running each game
			computerchoice = computerChoice(); //Recieving the computer choice
			System.out.println("Game " + (i+1));
			System.out.println("Type 1 for Rock, 2 for Paper, 3 for Scissors:");
			userchoice = sc.nextInt(); //Inputting the user choice
			
			System.out.print("You chose :"); //Displaying the user and computer choices
			printChoice(userchoice);
			System.out.print("Computer chose :");
			printChoice(computerchoice);
			
			if(computerchoice == userchoice) //Checking if the choice is same
			{
				System.out.println("Draw, choose again.\n");
				i--;
				continue; //No draws allowed
			}
			
			chart[i] = game(computerchoice, userchoice); //Determining the final result of the game and storing it in the game chart
			System.out.println(); //Blank line after completion of each game for clean output
		} //End For Loop / 1 Game
		
		stats(chart); //Displaying user and computer stats
	} //End Method
} //End Class
