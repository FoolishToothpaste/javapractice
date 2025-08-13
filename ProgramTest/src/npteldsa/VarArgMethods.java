/**This program demonstrates the creation of methods with a variable number of arguments, i.e., vararg methods*/
package npteldsa;
import java.util.*;

public class VarArgMethods 
{
	//This can be achieved with three types. Type 1: Simply an array as an argument. However, this restricts type of arguments to just one.
	public static void varargs1(int[] v) //int type array
	{
		System.out.println("The number of usable arguments in this Array type varargs is " + v.length);
	}
	
	//Type 2 : Using ellipses. This type doesn't need an array to be accepted, but again, has only one data type
	public static void varargs2(int ... v)
	{
		System.out.println("The number of usable arguments in this Ellipse type varargs is " + v.length);
	}
	
	//Type 3: Using Objects and Object data type. Most versatile, any data type accepted.
	public static void varargs3(Object ... obj)
	{
		int counter = 0;
		for(Object o : obj)
			counter++;
		System.out.println("The number of usable arguments in this Ellipse type varargs is " + counter);
	}
	
	public static void main(String args[])
	{
		int x[] = {1,2,3,4};
		varargs1(x); //Calling Type 1
		
		varargs2(1,2,3,4,5,-6,-9); //Calling Type 2
		varargs3("Soham Roy", "AN2", 143, 99.86, true); //Calling Type 3
	} //End Main Method
} //End Class

/**NOTE: Object class is the superclass of all classes because any time an object is created, Object class is used*/
