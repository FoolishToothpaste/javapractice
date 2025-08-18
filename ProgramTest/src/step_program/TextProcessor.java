package step_program;
import java.util.*;

public class TextProcessor 
{
	public static String cleanInput(String input) 
	{ 
		if (input == null || input.isEmpty()) 
		{
        return input; // Return as is for null or empty strings
		}
		
		input = input.trim().replaceAll("\\s+", " ");
		String[] words = input.split(" ");
		StringBuilder sb = new StringBuilder();
		for (String w : words) {
            if (w.length() > 0) {
                sb.append(Character.toUpperCase(w.charAt(0)))
                  .append(w.substring(1).toLowerCase())
                  .append(" ");
            }
        }
		
		return sb.toString();
	}
	
	public static void analyzeText(String text) 
	{
        String[] words = text.split("\\s+");
        int wordCount = words.length;
        String[] sentences = text.split("[.!?]+");
        int sentenceCount = text.trim().isEmpty() ? 0 : sentences.length;
        int charCount = text.replaceAll("\\s", "").length();

        String longestWord = "";
        for (String word : words) 
        {
            String cleanWord = word.replaceAll("\\p{Punct}", "");
            if (cleanWord.length() > longestWord.length()) longestWord = cleanWord;
        }

        char mostCommonChar = ' ';
        int maxCount = 0;
        for (int i = 0; i < text.length(); i++) 
        {
            char c = Character.toLowerCase(text.charAt(i));
            if (Character.isLetterOrDigit(c)) 
            {	
                int count = 0;
                for (int j = 0; j < text.length(); j++) 
                {
                    if (Character.toLowerCase(text.charAt(j)) == c) count++;
                }
                if (count > maxCount) 
                {
                    maxCount = count;
                    mostCommonChar = c;
                }
            }
        }

        System.out.println("\n--- TEXT ANALYSIS ---");
        System.out.println("Word count: " + wordCount);
        System.out.println("Sentence count: " + sentenceCount);
        System.out.println("Character count (no spaces): " + charCount);
        System.out.println("Longest word: " + longestWord);
        System.out.println("Most common character: " + mostCommonChar + " (" + maxCount + " times)");
    }
	
	 public static String[] getWordsSorted(String text) 
	 {
	        String cleanText = text.replaceAll("\\p{Punct}", "");
	        String[] words = cleanText.split("\\s+");
	        for (int i = 0; i < words.length - 1; i++) 
	        {
	            for (int j = i + 1; j < words.length; j++) 
	            {
	                if (words[i].compareToIgnoreCase(words[j]) > 0) 
	                {
	                    String temp = words[i];
	                    words[i] = words[j];
	                    words[j] = temp;
	                }
	            }
	        }
	        return words;
	    }
	 
	 public static void main(String[] args) 
	 {
		    Scanner sc = new Scanner(System.in);
		    System.out.println("=== TEXT PROCESSOR ===");
		    System.out.println("Enter a paragraph of text:");
		    String input = sc.nextLine();

		    String cleanedText = cleanInput(input);
		    if (cleanedText.isEmpty()) 
		    {
		        System.out.println("Invalid input. Please enter non-empty text.");
		        sc.close();
		        return;
		    }

		    analyzeText(cleanedText);

		    System.out.println("\n--- WORDS (Alphabetical Order) ---");
		    String[] sortedWords = getWordsSorted(cleanedText);
		    for (String word : sortedWords) 
		    {
		        System.out.println(word);
		    }

		    System.out.println("\nEnter a word to search:");
		    String searchWord = sc.nextLine().trim();
		    boolean found = false;
		    for (String word : sortedWords) 
		    {
		        if (word.equalsIgnoreCase(searchWord)) {
		            found = true;
		            break;
		        }
		    }
		    if (found) 
		    {
		        System.out.println("The word \"" + searchWord + "\" was found in the text.");
		    } else {
		        System.out.println("The word \"" + searchWord + "\" was NOT found in the text.");
		    }
	 }
}
