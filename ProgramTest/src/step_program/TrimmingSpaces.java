package step_program;
import java.util.*;

public class TrimmingSpaces  
{
	public static int[] trimIndex(String str)
	{ //Method to find out the indexes of the starting and ending of the sentence
		int start = 0, end = 0; //Initializing indexes
		for(int i = 0; i < str.length(); i++)
		{ //Loop to find the starting index
			if(str.charAt(i) != ' ')
			{
				start = i; 
				break;
			}
		}
		
		for(int i = str.length() - 1; i >= 0; i--) //Reverse
		{ //Loop to find the ending index
			if(str.charAt(i) != ' ')
			{
				end = i;
				break;
			}
		}
		
		int a[] = {start, end}; //Storing the starting and ending indexes in an array
		return a; //Returning the array
	} //End Method
	
	public static String subStringMaker(String str, int start, int end)
	{ //Method to extract the substring without the leading and trailing spaces
		String subString = ""; //Initializing substring variable
		for(int i = start; i <= end; i++) //Loop runs from starting index to ending of sentence
		{
			subString+= str.charAt(i); //Adding each character to string
		}
		
		return subString; //Returning extracted substring
	} //End Method
	
	public static boolean stringCompare(String str, String str2)
	{ //Method to compare the substrings extracted from Method and trim() function
		if(str.length() != str2.length()) 
			return false; //Returning false if string length doesn't match
		for(int i = 0; i < str.length(); i++)
		{
			if(str.charAt(i) != str2.charAt(i))
				return false; //Returning false if any character doesn't match
		}
		
		return true; //Returning true after everything matches
	} //End Method
	
	public static void main(String args[])
	{
		String str, strTrim, strMethod; //Initializing variables
		Scanner sc = new Scanner(System.in); //Initializing Scanner object
		System.out.println("Enter the String:");
		str = sc.nextLine(); //Inputting the String from the user
		strTrim = str.trim(); //Trimming the leading and trailing white spaces using built in method
		
		int[] index = trimIndex(str); //Finding the index of start and end and storing it in array by calling method
		strMethod = subStringMaker(str, index[0], index[1]); //Trimming the leading and trailing white spaces using custom method
		//Displaying Final Output
		System.out.println("Trimmed String = " + strMethod + "\n");
		if(stringCompare(strMethod, strTrim)) //Comparing the substrings extracted by custom and built in methods
			System.out.println("The Strings Match");
		else
			System.out.println("The Strings Don't Match");
	} //End Method
} //End Class
