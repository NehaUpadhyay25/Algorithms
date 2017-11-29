/*
 * FileName : knapsack.java
 * 
 * Version : 1.0
 * 
 * author : Neha Upadhyay 
 * 
 * Revisions: Initial Revision
 * 
 */
import java.util.ArrayList;

/**
 * The class knapsack implements the dynamic 0-1 knapsack problem. It computes the 
 * maximum number of items with maximum value as per the given capacity.
 * 
 * It has knapsackDynamic method which implements the above problem in O(nC) time, 
 * where n is the number of items and C is the capacity that can be placed in knapsack.
 *  
 * @ author	Neha Upadhyay
 */
public class knapsack {
	
	/*
	 * This method implements the dynamic knapsack problem.
	 * 
	 * @param 	value[]		value of the corresponding items
	 * @param 	weight[]	weight of the corresponding items
	 * @param 	capacity	maximum capacity that can be placed in knapsack
	 * @param	n			number of items
	 * 
	 * @return 	None
	 * 
	 */
	public static void knapsackDynamic(int value[], int weight[], int capacity, int n) {
			
		int item[][] = new int[n+1][capacity+1];
		ArrayList<Integer> itemNew = new ArrayList();
		int cost;
	
		//Initializing all the values in item matrix to zero.
		for(int i = 0;i <= capacity; i++) {
			for(int j = 0; j <= n; j++) {
				item[j][i] = 0;
			}
		}	
		
		//Checking whether the item to include or not. And then updating the values in
		//the initial item matrix 			
		for(int i = 1; i <= capacity; i++) {
			for(int j = 1; j <= n; j++) {
				item[j][i] = item[j-1][i];
				
				if(( weight[j] <= i ) && ((( item[j-1][i - weight[j]] ) + value[j] ) > item[j][i] )) {
					item[j][i] = item[j-1][i - weight[j]] + value[j];
				}
			}
		 }
		
		cost = item[n][capacity];
		
		while(cost > 0) {
			if( item[n-1][capacity] == cost ) {
				cost = item[n-1][capacity];
				n = n-1;
			}
			else {
				itemNew.add(n);
				cost = cost - value[n];
				n = n-1;
				capacity = capacity - n;
			}	
		}

		System.out.println("Items selected will be : ");
		for(int i = 0; i < itemNew.size(); i++) {
			System.out.print("Item : " +itemNew.get(i));
			System.out.print(" Weight : " +weight[(int)itemNew.get(i)]);
			System.out.print(" Value : " +value[(int)itemNew.get(i)]);
			System.out.println();			
		}		
	}
	
	/*
	 * This is the main method which calls knapsackDynamic to compute the results. 
	 * 
	 * @param 	args	command line arguments(ignored)
	 * 
	 */
	public static void main(String args[]) {
		
		int value[] = {0, 60, 100, 120};
		int weight[] = {0, 10, 20, 30};
		int capacity = 60;
		
		int n = value.length - 1;
		
		knapsackDynamic(value, weight, capacity, n);	
	}
}
