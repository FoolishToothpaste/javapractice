package step_program;
import java.util.*; //Importing java.util.* for Scanner class

public class StringManipulation2 
{
    public static int lengthCounter(String s) //Method to calculate length of the String
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
    } //End Method

    public static String[] wordCounter(String s) //Method to split the words in the sentence
    {
        s+=" "; //Adding space to string to count final word
        int l = lengthCounter(s);
        int arrayInputCounter = 0;
        String w = ""; //Null word variable
        String a[] = new String[l]; //Array to store words
        for(int i = 0; i < l; i++)
        {
            if(s.charAt(i) != ' ')
                w+= s.charAt(i);
            else
            {
                a[arrayInputCounter] = w;
                arrayInputCounter++;
                w = "";
            }
        }

        return a;
    }

    public static boolean stringCompare(String[] s1, String[] s2)
    {
        boolean flag = true;
        int l = s1.length;
        for(int i = 0; i < l; i++)
        {
            if(s1[i] != null && s2[i]!= null && s1[i].equals(s2[i]))
                continue;
            else if(s1[i] == null)
                break;
            else
                flag = false;
        }

        return flag;
    }

    public static void main(String[] args)
    {
        System.out.println("Enter the string:");
        Scanner sc=new Scanner(System.in); //Creating Scanner object
        String str = sc.nextLine(); //Inputting String from the user

        String[] wordMethod = wordCounter(str);
        String[] wordSplit = str.split(" ");

        //Displaying Final Output
        if(stringCompare(wordMethod, wordSplit))
            System.out.println("The arrays match.");
        else
            System.out.println("The arrays don't match.");
    } //End Method
} //End Class
