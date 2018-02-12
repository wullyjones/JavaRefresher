import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<Integer>();
		List<Integer> numListReverse = new ArrayList<Integer>();
		
		for (int i=1;i<=100;++i) {
			numList.add(i);
		}
		for (int i=100;i>=0;--i) {
			numListReverse.add(i);
		}
		
		/**
		 * TODO: 
		 * Quick Sort, 
		 * Merge Sort, 
		 * Heap Sort
		 */
		
		
	
		//linearSearch(numList, 76);
		//binarySearch(numList, 76);
		
		//printPrimeNumbers(numList);
		//printOddNumbers(numList);
		//printEvenNumbers(numList);
		//printNumbers(numList);
		
	}
	
	public static void printNumbers(List<Integer> numbers) {
		int count = 0;
		System.out.println("--- Numbers Start ---");
		for(int number : numbers) {
			System.out.printf("%s ", number);
			++count;
			
			if (count == 10) {
				count = 0;
				System.out.println();
			}
		}
		System.out.println("--- Numbers End ---");
	}
	
	public static void printOddNumbers(List<Integer> numbers) {
		int count = 0;
		System.out.println("--- Odd Numbers Start ---");
		for(int number : numbers) {
			if (!(number % 2 == 0)) {
				System.out.printf("%s ", number);
				++count;
			}
			
			if (count == 10) {
				count = 0;
				System.out.println();
			}
		}
		System.out.println("--- Odd Numbers End ---");		
	}
	
	public static void printEvenNumbers(List<Integer> numbers) {
		int count = 0;
		System.out.println("--- Even Numbers Start ---");
		for(int number : numbers) {				
			if ((number % 2 == 0)) {
				System.out.printf("%s ", number);
				++count;
			}
						
			if (count == 10) {
				count = 0;
				System.out.println();
			}
		}
		System.out.println("\n--- Even Numbers End ---");
	}
	
	public static void printPrimeNumbers(List<Integer> numbers) {
		int count = 0;
		System.out.println("--- Prime Numbers Start ---");
		for (int number : numbers) {
			if (!(number == 0)) {
				if (isPrimeNumber(number)) {
					System.out.printf("%s ", number);
					++count;
				}
			}
						
			if (count == 10) {
				count = 0;
				System.out.println();
			}
		}
		System.out.println("--- Prime Numbers End ---");
	}
	
	public static boolean isPrimeNumber(int number) {
		if (number == 1) {
			return false;
		}
		
		if (number == 2) {
			return true;
		}
		if (number % 2 == 0) {
			return false;
		}
		int sqrt = (int)Math.sqrt(number) + 1;
		for (int i = 3;i < sqrt; i+= 2) {
			if (number % i == 0) {
				return false;
			}
		}
				
		return true;
	}

	public static void linearSearch(List<Integer> numbers, int searchNumber) {
		int searches = 0;
		boolean searchSuccess = false;
		for (int number : numbers) {
			if (number == searchNumber) {
				System.out.printf("Linear search successful after %s attempts.", searches);
				searchSuccess = true;
				break;
			} else {
				++searches;
			}
		}
		if (!(searchSuccess)) {
			System.out.printf("\nLinear search unsuccessful after %s attempts.", searches);
		}
	}

	public static void binarySearch(List<Integer> numbers, int searchNumber) {
		int searches = 0;
		int low = numbers.get(0);	
		int mid;
		int high = numbers.size() - 1;
		boolean searchSuccess = false;
		
		while (low <= high) {
			mid = (low + high) / 2;
			if (numbers.get(mid) < searchNumber) {
				low = mid + 1;
			} else if (numbers.get(mid) > searchNumber) {
				high = mid - 1;
			} else if (numbers.get(mid) == searchNumber) {
				System.out.printf("\nBinary search successful after %s attempts.", searches);
				searchSuccess = true;
				break;
			}
			++searches;
		}
		if (!(searchSuccess)) {
			System.out.printf("Binary search unsuccessful after %s attempts.", searches);
		}
		
	}

	public static void quickSort() {
		
	}
	
	public static void mergeSort() {
			
	}
	
	public static void heapSort() {
		
	}
}
