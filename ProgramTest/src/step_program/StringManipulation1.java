package step_program;
import java.util.*; //Importing java.util.* for Scanner class

public class StringManipulation1 
{
    public static int lengthCounter(String s)
    {
        int count = 0; //Initializing counter variable

        try
        { //Try block
            while(true) //Infinite Loop
            {
                char a = s.charAt(count); //Trying every character of the String
                count++; //Counting String length
            } //End Loop
        } //End Try Block
        catch(Exception e) //Catching the error when counter exceeds
        {
            return count;
        } //End Catch Block
    }
    public static void main(String[] args)
    {
        int countm, countl;
        System.out.println("Enter the string:");
        Scanner sc=new Scanner(System.in); //Creating Scanner object
        String str = sc.nextLine(); //Inputting String from the user

        countm = lengthCounter(str); //By our method
        countl = str.length(); //By length() method

        //Displaying Final Output
        System.out.println("The length of [" + str + "] string  by custom method is = " + countm);
        System.out.println("The length of [" + str + "] string  by length() method is = " + countl);
    } //End Method
} //End Class
