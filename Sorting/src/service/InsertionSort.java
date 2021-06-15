/**********************************************************
 * Purpose : Perform insertion sort on the words
 * @author Hrishikesh Ugavekar
 * @Version 1.1
 * @since 15-06-2021
 *
 **********************************************************/
package service;

import util.ArrayMethods;

public class InsertionSort {
	//Initializing array size and the array
	private static int arraySize;
	private static String wordsArray[];

	/**
	 * Performs insertion sort on the string array
	 */
	public static void peformInsertionSort() {
		//Loop to traverse through array
		for (int i = 1; i < wordsArray.length; i++) {
			String current = wordsArray[i];
			int j = i - 1;
			while (j >= 0) {
				//breaks the loop of two elements are already in sorted order
				if (wordsArray[j].compareTo(current) < 0)
					break;
				//swap with the next element
				wordsArray[j + 1] = wordsArray[j];
				j--;
			}
			wordsArray[j + 1] = current;
		}
	}

	public static void main(String[] args) {
		ArrayMethods a = new ArrayMethods();
		arraySize = a.userInputArraySize();
		wordsArray = a.storeWordsInArray(arraySize);
		peformInsertionSort();
		a.printArray(arraySize, wordsArray);
	}

}
