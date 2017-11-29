/*
 * FibonacciRecurrence.java
 * 
 * @version: 1.0
 * 
 * author : Neha Upadhyay 
 * 
 * Revisions:
 *     Initial revision
 */

/**
 * This class implements and computes the fibonacci recurrence recursively.
 * 
 * 		f(0; a, b) = a
 * 		f(1; a, b) = b
 * 		f(n; a, b) = f(n − 1; b, a + b)
 * 
 * @author Neha Upadhyay
 */

public class FibonacciRecurrence {
	/**
     * This is the helper method used in class to find the result of the fibonacci recurrence. 
     * 
     * @param 	n		Limit upto which fibonacci series to be calculated.
     * @param	a		Base case value for n == 0
     * @param	b		Base case value for n == 1
     * @return 	double 	Result of the recurrence.
     */
	public static double fibItHelper(int n, double a, double b) {
		
		if(n == 0) {
			return a;
		}
		else if(n == 1) {
			return b;
		} 
		else {
			 return fibItHelper(n-1, b, (a+b));
		}
	}
	
	/**
     * This method is used in class to find the result of the fibonacci recurrence. 
     * 
     * @param 	n		Limit upto which fibonacci series to be calculated.
     * @return 	double 	Result of the recurrence.
     */
	public static double fibIt(int n) {
		double a = 0.0, b = 1.0;
		double fib_result;
		
		fib_result = fibItHelper(n, a, b);
		
		return fib_result;
	}
	
	/**
	 * This method is the main method.
	 * 
	 * @param    args    command line arguments(ignored) 
	 */
	public static void main(String args[]) {
		
		double result = 0, start_time;
		double time_diff;	
		for( int n = 0; n <= 50; n++) {
			
			start_time = System.currentTimeMillis();
			result = fibIt(n);
			time_diff = (System.currentTimeMillis() - start_time)/1000F;
			System.out.println("Fibonacci series sum for " +n+ " = " +result+ " with execution time " +time_diff+ "ms.");
		}
		
	}

}
