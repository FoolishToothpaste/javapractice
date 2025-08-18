package stringtest;
import java.util.*;

public class HarmonicaConverter 
{
	public static String converter(String s)
	{
		String result = "";
		if(s.charAt(0) != '-')
		{
			for(int i = 0; i < s.length(); i++)
			{
				if(s.charAt(i) == '1')
					result+=".S";
				else if(s.charAt(i) == '2')
					result+=".G";
				else if(s.charAt(i) == '3')
					result+=".P";
				else if(s.charAt(i) == '4')
					result+="S";
				else if(s.charAt(i) == '5')
					result+="G";
				else if(s.charAt(i) == '6')
					result+="P";
				else if(s.charAt(i) == '7')
					result+="S'";
				else if(s.charAt(i) == '8')
					result+="G'";
				else if(s.charAt(i) == '9')
					result+="P'";
				else
					result+="S''";
			}
		}
		else
		{
			for(int i = 1; i < s.length(); i++)
			{
				if(s.charAt(i) == '1')
					result+="kR";
				else if(s.charAt(i) == '2')
					result+=".P";
				else if(s.charAt(i) == '3')
					result+=".N";
				else if(s.charAt(i) == '4')
					result+="R";
				else if(s.charAt(i) == '5')
					result+="M";
				else if(s.charAt(i) == '6')
					result+="D";
				else if(s.charAt(i) == '7')
					result+="N";
				else if(s.charAt(i) == '8')
					result+="R'";
				else if(s.charAt(i) == '9')
					result+="M'";
				else
					result+="N'";
			}
		}
		
		result+=" ";
		return result;
	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String input = sc.nextLine();
		String output = "", sender = "";
		
		for(int i = 0; i < input.length(); i++)
		{
			char c = input.charAt(i);
			if(Character.isDigit(c) || c == '-')
			{
				while(true)
				{
					sender+=input.charAt(i);
					i++;
					if(i < input.length() && input.charAt(i) != ' ')
						continue;
					else
						break;
				}
				output+=converter(sender);
			}
			else
				output+=c;
			sender = "";
		}
		
		System.out.print(output);
	}
}
