package step_program;
import java.util.*; //Importing java.util.* for Scanner class

public class VowelsConsonantsASCII 
{
	public static int[] counter(String str)
	{ //Method to count the number of vowels and consonants in the String
		int[] count = {0,0}; //Array to store the vowel consonant count
		for(int i = 0; i < str.length(); i++) //Traversing through each character of the string
		{
			int c = str.charAt(i); //Extracting each character and storing it in c
			
			//Using ASCII for operations
			if((c < 65) || (c < 97 && c > 90) || (c > 122)) //Checking if the character is non alphabet
				continue; //Skipping steps for non alphabet characters
			
			if(c < 97) //Checking if character is uppercase
				c+=32; //Converting uppercase characters to lowercase
			
			if(c == 97 || c == 101 || c == 105 || c == 111 || c == 117) //Checking if character is a vowel
				count[0]++; //Incrementing count of vowels
			else
				count[1]++; //Incrementing count of consonants
		} //End For Loop
		
		return count; //Returning the array with the count
	} //End Method
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in); //Initializing Scanner object
		System.out.println("Enter a String:");
		String str = sc.nextLine(); //Inputting the String from the user
		
		int count[] = counter(str); //Calling the counter method to find the number of vowels and consonants
		//Displaying Final Output
		System.out.println("The number of vowels = " + count[0] + "\nThe number of consonants = " + count[1]);
	} //End Method
} //End Class
