package step_program;
import java.util.*; //Importing java.util.* for Scanner class

public class WordLengthArray 
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
                w+= s.charAt(i); //Storing the non space character in word variable
            else
            {
                a[arrayInputCounter] = w; //Storing completed word in array
                arrayInputCounter++; //Increasing index
                w = ""; //Emptying word variable for new word
            }
        } //End for loop

        return a; //Returning word array
    } //End Method
    
    public static String[][] wordLengthCounter(String[] a)
    { //Method to store word lengths in array
    	String[][] arr = new String[a.length][2];
    	for(int i = 0; i < a.length; i++)
    	{
    		arr[i][0] = a[i];
    		arr[i][1] = String.valueOf(lengthCounter(a[i])); //Converting word length to String and storing in array
    	}
    	
    	return arr;	//Returning word length array
    } //End Method
    
    public static int[] longestShortest(String[][] a)
    { //Method to find longest and shortest words
    	int max = Integer.parseInt(a[0][1]), min = Integer.parseInt(a[0][1]), temp, maxindex = 0, minindex = 0;
    	for(int i = 1; i < a.length; i++)
    	{
    		if(a[i][0] == null)
    			break;
    		temp = Integer.parseInt(a[i][1]);
    		if(max < temp) //Checking for maximum length of word
    		{
    			max = temp;
    			maxindex = i;
    		}
    		if(min > temp) //Checking for minimum length of word
    		{
    			min = temp;
    			minindex = i;
    		}
    	} //End For Loop
    	
    	int[] result = {maxindex, minindex}; //Storing the maximum and minimum indexes
    	return result; //Returning Final Result
    } //End Method
    
	public static void main(String args[])
	{
		System.out.println("Enter the string:");
        Scanner sc=new Scanner(System.in); //Creating Scanner object
        String str = sc.nextLine(); //Inputting String from the user

        String[] wordMethod = wordCounter(str); //Extracting every word from 'str' string
        String[][] wordcount = wordLengthCounter(wordMethod); //Counting individual length of every word of 'str' String
        int[] maxmin = longestShortest(wordcount);
        
        //Displaying Final Output
        System.out.println("\nWORD\tLENGTH\n");
        for(int i = 0; i < wordMethod.length; i++)
        {
        	if(wordcount[i][0] == null)
        		break;
        	System.out.println(wordcount[i][0] + "\t" + (Integer.parseInt(wordcount[i][1]))); //Converting string type length of word into int before printing
        }
        
        //Displaying Longest and Shortest Words
        System.out.println("\nLongest Word = " + wordcount[maxmin[0]][0] + "\nShortest Word = " + wordcount[maxmin[1]][0]);
	} //End Method
} //End Class
