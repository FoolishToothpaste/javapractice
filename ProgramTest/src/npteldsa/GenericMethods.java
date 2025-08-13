/**This program demonstrates Generic Methods in java, which are those methods that can accept arguments of any data type using <T> template*/
package npteldsa;

public class GenericMethods 
{
	public <T> void swap(T x, T y) //Generic non static method to swap two values
	{
		System.out.println("Unwapped Values -- x = " + x + " and y = " + y);
		T temp;
		temp = x;
		x = y;
		y = x;
		System.out.println("Swapped Values -- x = " + x + " and y = " + y);
	}
	
	public static <T, K> void concatenation(T x, K y) //Generic static method to concatenate two different type values
	{
		System.out.println(""+x+y);
	}
	
	public static void main(String args[])
	{
		int a = 12; //Non wrapper class variable is technically wrong because generics only operate on Object types, which can be used only be used using wrapper class. However, Java's autoboxing feature automatically converts this variable to a wrapper class object
		String b = " Angry Men"; //String already an object, so no wrapper method
		Integer x = 10; //Wrapper Class used to see x as an object, typical syntax is Integer x = new Integer(10) but the constructor seems to be removed after version 9 for some reason
		Integer y = 12;
		Double p = 10.33;
		Double q = 12.33;
		GenericMethods object = new GenericMethods(); //Object to call swap method
		
		System.out.println("Swap Method:\n");
		object.swap(x,y); //Swap method with Integer object variables
		object.swap(p,q);
		System.out.println("\nConcatenation Method");
		concatenation(a,b); //Concatenation method with T and K replaced with Integer (not int) and String
	} //End main method
} //End Class

/**NOTE : Wrapper classes in Java are part of the java.lang package and provide a mechanism to convert primitive data types (like int, char, float, boolean, etc.) into their corresponding object representations.*/
