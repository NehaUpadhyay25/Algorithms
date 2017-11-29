/*
 * FileName : ComplexityN.java
 * 
 * Version : 1.0
 * 
 * author : Neha Upadhyay 
 * 
 * Revisions: Initial Revision
 * 
 */
 
/**
 * Description : This class implements a function sortedHasSum function
 * which takes a sorted array and a value. It then checks whether any pair of 
 * numbers sums up to that value. If it sums up and the value matches 
 * then the it returns true else it returns false.
 * It does this in O(n) time.
 * 
 * @author Neha Upadhyay
 *
 */

public class ComplexityN 
{
	public static void main(String[] args) 
	{
		int a[] = {2,6,7,9,13,15,18,21,23,26,28};
		int sum;
		
		System.out.print("Array is : ");
		for(int i = 0; i < a.length; i++)
			System.out.print(a[i]+" ");
		
		System.out.println("\n");
		
		// Test case for pair exist
		sum = 24;
		System.out.println("Sum : "+sum );
		if(sortedHasSum(a, sum))
			System.out.println("Pair found.");
		else
			System.out.println("No such pair found");
		System.out.println();
		
		// Test case for no pair exist
		sum = 57;
		System.out.println("Sum : "+sum );
		if(sortedHasSum(a, sum))
			System.out.println("Pair found");
		else
			System.out.println("No such pair found");
	}
	/**
	 * sortedHasSum() : It takes sorted array of number and 
	 * defines two counters one at the start of array as low 
	 * and other at the end and then it starts incrementing 
	 * start or decrementing end depend on there sum < or > 
	 * then target. 
	 * O(n)
	 */
	public static boolean sortedHasSum(int a[], int sum)
	{
		
		int start = 0, end = a.length-1;
		while(start < end)
		{
			if((a[start] + a[end]) == sum)
				return true; 
			else if((a[start] + a[end]) < sum)
				start++;
			else
				end--;	
		}
		return false;
	}	
}
