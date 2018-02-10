/* Problem: From a set of numbers, find a pair that equals a sum
	* It is possible for no pairs to equal the sum
	* The sets may not be in order
	* The sets may contain negative numbers 
*/
public class Basics {
	
	public static void main(String[] args) {
		int[][] dataSets = {{1, 2, 4, 4},{3, 1, 6, 9},{4, 2, 6, 1, 3, 7, 5}, {2, -1, 4, 3, 6, 3, -5}};
		int[] dataSums = {8, 9, 4, 14};
		
		for(int i=0;i<dataSets.length;i++) {
			System.out.printf("Data Set #%s) ", i+1);
			for (int j=0;j<dataSets[i].length;j++) {
				System.out.printf("%s ", dataSets[i][j]);
			}
			System.out.printf("SUM %s\n", dataSums[i]);
		}
		
	}
	
	public boolean FindPairSum(int[] dataSet, int dataSum) {
		
		
		
		
		return false;
	}

}



