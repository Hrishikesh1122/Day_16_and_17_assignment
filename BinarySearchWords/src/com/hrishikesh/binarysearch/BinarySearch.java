/**********************************************************
 * Purpose : Find the word in array using binary search
 * @author Hrishikesh Ugavekar
 * @Version 1.1
 * @since 15-06-2021
 *
 **********************************************************/
package com.hrishikesh.binarysearch;

import java.text.Collator;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
	private int arraySize;
	private int result;
	private String wordsArray[];
	Scanner sc = new Scanner(System.in);

	/**
	 * Asks user to input array size Takes input from user and store it in arraySize
	 * Returns arraySize where ever the function is called
	 * 
	 * @return Size of the array as specified by user
	 */
	private int userInputArraySize() {
		System.out.println("Enter the number of words you want to input :");
		arraySize = sc.nextInt();
		return arraySize;
	}

	/**
	 * Asks user to enter words Stores those words in wordsArray
	 */
	private void storeWordsInArray() {
		System.out.println("Enter the words :");
		wordsArray = new String[arraySize];
		for (int i = 0; i < arraySize; i++) {
			wordsArray[i] = sc.next();
		}
	}

	/**
	 * Sorts the words in words array according to alphabetical order This sorted
	 * array will be used for binary search Collator.getInstance() will make sort
	 * case-insensitive.
	 */
	private void sortArray() {
		Arrays.sort(wordsArray, Collator.getInstance());
	}

	/**
	 * Prints the words in wordsArray on console
	 */
	private void printArray() {
		for (int i = 0; i < arraySize; i++)
			System.out.println(wordsArray[i]);
	}

	/**
	 * Performs binary search operation on sorted wordsArray
	 * Compares middle vale of array to target value
	 * Shifts to left if middle value < target otherwise shift to right
	 * Cycle continues till word is found
	 * @return result of search , 1 if word found , 0 if word not found
	 */
	private int performBinarySearch() {
		System.out.println("Enter word to be searched ");
		//User input is stored in key
		String key = sc.next();

		int left = 0;
		int right = wordsArray.length - 1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			int check = key.compareTo(wordsArray[mid]);
			if (check == 0)
				return result = 1;
			if (check > 0)
				left = mid + 1;
			else
				right = mid - 1;
		}

		return result = 0;
	}
	
	/**
	 * Prints the result of binary search
	 * Prints "word present" if result ==1 otherwise it prints "Word not present"
	 */
	private void printResult() {
		if(result==1) {
			System.out.println("Word present");
		}
		else {
			System.out.println("Word not present");
		}
	}
	

	public static void main(String[] args) {
		BinarySearch b = new BinarySearch();
		b.userInputArraySize();
		b.storeWordsInArray();
		b.sortArray();
		b.performBinarySearch();
		b.printResult();
		b.printArray();

	}
}
