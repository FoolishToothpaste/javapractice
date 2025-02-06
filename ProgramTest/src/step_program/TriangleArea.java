/**A program that takes the base and height to find area of a triangle in square inches and square centimeters*/

package step_program;
import java.util.*; //Importing java.util.* for Scanner class

public class TriangleArea 
{
	public static void main(String args[])
	{
		double base, height, basecm, basefeet, heightcm, heightfeet, area, areacm, areafeet; //Initializing variables
		Scanner sc=new Scanner(System.in); //Initializing Scanner object
		System.out.println("Enter the base and the height of the triangle in inches: ");
		
		base = sc.nextDouble(); //Inputting the base of the triangle in inches
		height = sc.nextDouble(); //Inputting the height of the triangle in inches
		area = 0.5 * base * height; //Calculating the area of the triangle in inches
		
		basecm = base * 2.54; //Calculating the base of the triangle in centimeter
		heightcm = height * 2.54; //Calculating the height of the triangle in centimeter
		areacm = 0.5 * basecm * heightcm; //Calculating the area of the triangle in centimeter
		
		heightfeet = 0.083 * height; //Calculating the height of the triangle in feet
		basefeet = 0.083 * base; //Calculating the base of the triangle in feet
		areafeet = 0.5 * heightfeet * basefeet; //Calculating the area of the triangle in feet
		
		//Displaying Final Output
		System.out.println("Area of triangle in cm is "+ areacm +" while in feet is "+ areafeet +" and inches is "+ area);
	} //End method
} //End class
