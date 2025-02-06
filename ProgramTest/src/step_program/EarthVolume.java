/**A program to compute the volume of Earth in km^3 and miles^3*/

package step_program;

public class EarthVolume
{
	private static final double PI = 3.1416; //Declaring Pi as a constant
	
	public static void main(String args[])
	{
		int radius = 6378; //Storing radius of Earth
		
		double vkm = (4.0/3) * PI * Math.pow(radius,3); //Calculating volume of Earth in kms
		double vmile = vkm / 1.6; //Calculating volume of Earth in miles
		
		//Displaying final output
		System.out.println("The volume of earth in cubic kilometers is " + vkm + " and cubic miles is " + vmile);
	} //End method
} //End class
