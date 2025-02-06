package stringtest;
import java.util.*;

public class Palindrome {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s=sc.nextLine();
		String rev="";
		s=s.toUpperCase();
		for(int i=s.length()-1; i>=0;i--)
		{
			rev+=s.charAt(i);
		}
		
		System.out.println("Reverse of the String: "+rev);
		int flag = rev.compareTo(s);
		if(flag == 0)
			System.out.println("Palindrome Number");
		else
			System.out.println("Not a Palindrome Number");
	}

}
