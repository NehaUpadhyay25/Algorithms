/*
 * FileName : QuickSort.java
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
public class QuickSort 
{
	public static void main(String[] args) 
	{
		int a[] = {15,23,9,7,26,2,28,21,6,18,13};
		
		System.out.print("Initial Array is : ");
		for(int i = 0; i < a.length; i++)
			System.out.print(a[i]+" ");
		
		System.out.println("\n");
		
		a = quick_sort(a, 0, a.length-1);
		
		System.out.print("Sorted Array is : ");
		for(int i = 0; i < a.length; i++)
			System.out.print(a[i]+" ");
	}
	/**
	 * quick_sort() : Implementation of Quick Sort
	 * Size of the stack is O(logn) 
	 * 
	 */
	public static int[] quick_sort(int a[], int l, int h)
	{
		int i = l;
		int j = h;
		int pivot = a[h];
		while (i < j)
		{
			while (a[i] < pivot)
				i++;
			
			while (a[j] > pivot)
				j--;
			
			if(i <= j)
			{
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++;
				j--;
			}
			
			if(l < j)
				quick_sort(a, l, j);
			
			if(i < h)
				quick_sort(a, i, h);
		}
		return a;
	}
}
