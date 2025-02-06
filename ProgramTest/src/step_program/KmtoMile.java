/**A program to convert the distance of 10.8 kilometers to miles.*/

package step_program;

public class KmtoMile 
{
	public static void main(String args[])
	{
		double kilometer = 10.8; //Storing kilometer value
		double rate = 1.6; //Storing conversion rate
		double mile = kilometer * rate; //Converting kilometers to miles
		
		System.out.println("The distance " + kilometer + " km in miles is " + mile); //Displaying final output
	}
}
