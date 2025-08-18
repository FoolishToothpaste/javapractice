package step_program;

public class StringManipulation 
{
	public static void main(String args[])
	{
		//Three ways to create a String
		String str1 = "Hello"; //Using String literal
		String str2 = new String("Hello"); //Using String() constructor
		char[] a = {'H','e','l','l','o'}; //Using character array
		
		if(str1 == str2)
			System.out.println(str1 + " and " + str2 + " are equal by == checking");
		else
			System.out.println(str1 + " and " + str2 + " are unequal by == checking");
		if(str1.equals(str2))
			System.out.println(str1 + " and " + str2 + " are equal by .equals checking");
		else
			System.out.println(str1 + " and " + str2 + " are unequal by .equals checking");
		//The strings are unequal by == checking because == only compares the addresses of the Strings and not the content
		//The strings are equal by .equals checking because .equals only compares the content of the Strings and not the addresses
		
		String escape = "Programming Quote:\n\t\"Code is poetry\" - Unknown\n\tPath: C:\\Java\\Projects";
		System.out.println(escape); //Displaying Final Output
	} //End Method
} //End Class
