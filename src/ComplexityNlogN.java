/*
 * FileName : ComplexityNlogN.java
 * 
 * Version : 1.0
 * 
 * author : Neha Upadhyay 
 * 
 * Revisions: Initial Revision
 * 
 */
 
/**
 * Description : This class implements a function HasSum function
 * which takes an array and a value. It then checks whether any pair of 
 * numbers sums up to that value. If it sums up and the value matches 
 * then the it returns true else it returns false.
 * It does this in O(nlogn) time.
 * 
 * @author Neha Upadhyay
 *
 */
public class ComplexityNlogN 
{
	public static void main(String[] args) 
	{

		int a[] = {15,23,9,7,26,2,28,21,6,18,13};
		int sum;
		
		System.out.print("Array is : ");
		for(int i = 0; i < a.length; i++)
			System.out.print(a[i]+" ");
		
		System.out.println("\n");
				
		// Test case for pair exist
		sum = 24;
		System.out.println("Sum : "+sum );
		if(hasSum(a, sum))
			System.out.println("Pair found");
		else
			System.out.println("No such pair found");
		System.out.println();
		
		// Test case for no pair exist
		sum = 57;
		System.out.println("Target : "+sum );
		if(hasSum(a, sum))
			System.out.println("Pair found");
		else
			System.out.println("No such pair found");
		
	}
	/**
	 * hasSum() : Implementation of has Sum method
	 * It takes arbitrary  array of number and 
	 * first it sorts them using merge sort (O(nlogn))
	 * and then it takes two conuters at the start and 
	 * end and increment start or decrement end depend
	 * on there sum < or > then target.
	 * O(nlogn) + O(n) ==> O(nlogn)
	 */
	public static boolean hasSum(int a[], int sum)
	{
		a = mergeAndSplit(a, 0, a.length-1);
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
	
	public static int[] mergeAndSplit (int a[],int start, int end)
	{
		int mid = 0;
		if (start < end)
		{
			mid = (start + end)/2;
			mergeAndSplit(a, start, mid);
			mergeAndSplit(a, mid+1, end);
			return(merge(a, start, mid, end));
		}
		return a;
	}
	public static int[] merge(int a[],int l, int m, int h)
	{
		int b[] = new int[h+1];
		for(int i = l; i <= h; i++)
		{
			b[i] = a[i];
		}
		int i = l;
		int j = m+1;
		int k = l;
		while(i <= m && j <= h)	
		{
			if(b[i] < b[j])
			{
				a[k] = b[i];
				i++;
			}
			else
			{
				a[k] = b[j];
				j++;
			}
			k++;
		}
		while(i <= m)
		{
			a[k] = b[i];
			k++;
			i++;
		}
		while(j <= h)
		{
			a[k] = b[j];
			k++;
			j++;
		}
		return a;
	}
}
