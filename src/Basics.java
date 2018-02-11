import java.util.Arrays;

/* Problem: From a set of numbers, find a pair that equals a sum
	* It is possible for no pairs to equal the sum
	* The sets may not be in order
	* The sets may contain negative numbers 
*/
public class Basics {
	
	public static void main(String[] args) {
		Integer[][] dataSets = {{1, 2, 4, 4},{3, 1, 6, 9},{4, 2, 6, 1, 3, 7, 5}, {2, -1, 4, 3, 6, 3, -5}};
		int[] dataSums = {8, 9, 4, 14};
		
		FindPairSum(dataSets[0], dataSums[0]);
		
		//for (int i=0; i < dataSets.length;i++) {
		//	FindPairSum(dataSets[i], dataSums[i]);
		//	System.out.println("\n\n");
		//}

		
	}
	
	public static boolean FindPairSum(Integer[] dataSet, int dataSum) {
		for (int i=0; i < dataSet.length; i++) {
			System.out.printf("\nCurrent element is %s, and has an index of %s.\n", dataSet[i], Arrays.asList(dataSet).indexOf(i));
			for (int j=0; j < dataSet.length; j++) {
				if (Arrays.asList(dataSet).indexOf(i) == Arrays.asList(dataSet).indexOf(j)) {
					System.out.printf("Index's are the same (%s and %s), these numbers will be ignored.\n", Arrays.asList(dataSet).indexOf(i), Arrays.asList(dataSet).indexOf(j));
				} else {
					if (dataSum == dataSet[i]+dataSet[j]) {
						System.out.print("PAIR MEETS SUM REQUIREMENT: ");
					}
					System.out.printf("%s + %s = %s\n", dataSet[i], dataSet[j], dataSet[i]+dataSet[j]);
				}
			}
		}
		
		
		
		return false;
	}
	
	/*
	 * Notes on computational complexity:
	 * O(1) - Constant - Determining if an int is odd or even
	 * O(log n) - Binary Search
	 * O(n^2) - Quadratic Time - Bubble sort, Insertion sort
	 * O(n^3) - Cubic Time - Multiplication of two n*n matrices
	 * O(n!) - Factorial Time - Solving traveling salesman problem via brute force search
	 */

}



