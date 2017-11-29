/*
 * Fibonacci.java
 * 
 * @version: 1.0
 * 
 * author : Neha Upadhyay 
 * 
 * Revisions:
 *     Initial revision
 */

/**
 * This class implements and computes the given fibonacci recurrence recursively.
 * 		
 * 		f(0) = 0
 * 		f(1) = 1
 * 		f(n) = f(n−1) + f(n−2)
 * 
 * @author Neha Upadhyay
 */

public class Fibonacci {
	/**
     * This method is internally used in class to find the result of the fibonacci recurrence. 
     * 
     * @param 	n		Limit upto which fibonacci series to be calculated.
     * @return 	long 	Result of the recurrence.
     */
	public static long fib(int n) {
		
		long fib_result;
		
		if(n == 0) {
			return 0;
		}
		else if(n == 1) {
			return 1 ;
		} 
		else {
			fib_result = fib(n-1) + fib(n-2); 
		}	
		return fib_result;
	}
	
	/**
	 * This method is the main method.
	 * 
	 * @param    args    command line arguments(ignored) 
	 */
	public static void main(String args[]) {
		
		long result = 0, start_time;
		float time_diff;	
		for( int n = 0; n <= 50; n++) {
			
			start_time = System.currentTimeMillis();
			result = fib(n);
			time_diff = (System.currentTimeMillis() - start_time)/1000F;
			System.out.println("Fibonacci series sum for " +n+ " = " +result+ " with execution time " +time_diff+ " ms.");
		}
		
	}

}
