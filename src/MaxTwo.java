/*
 * FileName : MaxTwo.java
 * 
 * Version : 1.0
 * 
 * author : Neha Upadhyay 
 * 
 * Revisions: Initial Revision
 * 
 */
/**
 * Description : This class gives the maximum of any two numbers
 * given. This class adds the both numbers and divides it by 2 and then 
 * subtracts both the numbers and then again divides it by 2.
 * 
 * The function max2 is used to compute maximum of two numbers.
 * 
 * @author Neha Upadhyay
 *
 */
public class MaxTwo {
	
	/*
	 * The method below takes in two double values and prints the maximum
	 * value among the two. It takes the absolute value of the subtraction 
	 * as we are adding the values together. I have chosen double instead
	 * of integer value as having double data type, it is feasible to check
	 * for decimal values and integer values as well.
	 * 
	 * @param    x     the first double value
	 * @param    y     the second double value
	 */
	public void max2(double x, double y)
	{
		double max = ((x + y) / 2) + (Math.abs(x - y) / 2);
		System.out.println("The maximum of the " +x +" and "+y  +" is " +max);
	}
	
	/*
	 * The main method. It is used to create object of the class and 
	 * call the method max2 and passes the two double values in the 
	 * method max2.
	 */
	
	public static void main(String[] args)
	{
		MaxTwo numbers = new MaxTwo();

		double x = 9.8;
		double y = 9.5;
		numbers.max2(x,y);
		
		x = 100;
		y = 1000;
		numbers.max2(x, y);
	}

}
