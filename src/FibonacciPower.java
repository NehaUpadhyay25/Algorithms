/*
 * FileName : FibonacciPower.java
 * 
 * Version : 1.0
 * 
 * author : Neha Upadhyay 
 * 
 * Revisions: Initial Revision
 * 
 */
 
/**
 * Description : This class implements fibonacci power algorithm
 * and returns the desired value. The function uses another function
 * fibpow to compute the power of the fibonacci.
 * 
 * @author Neha Upadhyay
 *
 */

public class FibonacciPower
{
	public double fibpow(int n, double a, double b)
	{
		
		if(n == 0 || n==1)
			return b;
		System.out.println(a+b);
		return fibpow(n/2,b,a+b);
	}
	
	public double implementation(int n,double a,double b)
        {
                if(n == 0)
                {
                        return a;
                }
                else if(n == 1)
                {
                        return b;
                }
                else
                {
                        return fibpow(n - 1 , b , a+b);
                }
        }

	public static void main(String[] args)
	{

		FibonacciPower fibonacci = new FibonacciPower();
		System.out.println(fibonacci.implementation(5, 0, 1));
	}
}
