package step_program;

public class StringArrays 
{
	public static String findLongestName(String[] names) {
		String max = names[0];
		for(int i = 1; i < names.length; i++)
		{
			if(names[i].length() > max.length())
				max = names[i];
		}
		
		return max;
	}
	
	public static int countNamesStartingWith(String[] names, char letter) {
		int counter = 0;
		String a = ""+letter;
		for(int i = 0; i < names.length; i++)
			if(names[i].startsWith(a))
				counter++;
		return counter;
	}
	
	public static String[][] formatNames(String[] names) {
		String a[][] = new String[names.length][2];
		for(int i = 0; i < names.length; i++)
		{
			a[i] = names[i].split(" ");
		}
		
		return a;
	}
	
	public static void main(String[] args) {
		String[] students = {"John Smith", "Alice Johnson", "Bob Brown",
		"Carol Davis", "David Wilson"};
	
		System.out.println(findLongestName(students));
		System.out.println(countNamesStartingWith(students, 'C'));
		
		String[][] a = formatNames(students);
		for(int i = 0; i < students.length; i++)
		{
			System.out.println(a[i][0] + " , " + a[i][1]);
		}
	}
}
