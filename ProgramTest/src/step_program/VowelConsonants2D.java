package step_program;
import java.util.*; //Importing java.util.* for Scanner class

public class VowelConsonants2D
{
	public static String[][] counter(String str)
	{ //Method to count the number of vowels and consonants in the String
		String[][] count = new String[str.length()][2]; //Array to store the vowel consonant character and count
		for(int i = 0; i < str.length(); i++) //Traversing through each character of the string
		{
			char c = str.charAt(i); //Extracting each character and storing it in c
			count[i][0] = ""+c; //Storing character in array
			
			//Using ASCII for operations
			if((c < 65) || (c < 97 && c > 90) || (c > 122)) //Checking if the character is non alphabet
			{
				if(c == 32) 
					count[i][0] = "WtSpace"; //Adding special name for White Space
				count[i][1] = "Not a Letter"; //Storing result in array
			}
			else
			{	
				if(c < 97) //Checking if character is uppercase
					c+=32; //Converting uppercase characters to lowercase
			
				if(c == 97 || c == 101 || c == 105 || c == 111 || c == 117) //Checking if character is a vowel
					count[i][1] = "Vowel"; //Storing result in array
				else
					count[i][1] = "Consonant"; //Storing result in array
			}
		} //End For Loop
		
		return count; //Returning the array with the character and count
	} //End Method
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in); //Initializing Scanner object
		System.out.println("Enter a String:");
		String str = sc.nextLine(); //Inputting the String from the user
		
		String count[][] = counter(str); //Calling the counter method to find the number of vowels and consonants
		
		//Displaying Final Output
		System.out.println("\nCHAR\tTYPE\n");
		for(int i = 0; i < count.length; i++)
		{
			if(count[i][0] == null)
				break;
			System.out.println(count[i][0] + "\t" + count[i][1]);
		}
	} //End Method
} //End Class
