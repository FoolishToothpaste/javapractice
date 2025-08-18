package step_program;
import java.util.*; //Importing java.util.* for Scanner class

public class StringMethods 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in); //Initializing Scanner object
		String name, language, sentence; //Initializing variables
		int counter = 0;
		System.out.println("Enter your full name:");
		name = sc.nextLine(); //Inputting full name from the user
		System.out.println("Enter your favorite programming language:");
		language = sc.nextLine(); //Inputting favorite programming language from the user
		System.out.println("Write a sentence about your programming experience:");
		sentence = sc.nextLine(); //Inputting a sentence about programming experience from the user
		
		String[] a = name.split(" "); //Extracting the first and last names and storing them separately in an array
		for(int i = 0; i < sentence.length(); i++)
		{
			if(sentence.charAt(i) != ' ')
				counter++; //Counting the number of characters in the sentence excluding spaces
		}
		
		language = language.toUpperCase(); //Converting the language to uppercase
		
		//Displaying Final Output
		System.out.println("First Name = " + a[0] + "\nLast Name = " + a[1]); 
		System.out.println("Number of characters in sentence excluding spaces = " + counter);
		System.out.println("Favorite programming language in uppercase = " + language);
	} //End Method
} //End Class
