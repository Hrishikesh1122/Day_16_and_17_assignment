/**********************************************************
 * Purpose of this class is to act like utilities for all 
 * array sorting operations. It contains the frequently used 
 * array methods as follows :
 * 1)Taking user input of array size
 * 2)Storing words in array 
 * 3) Printing that array on console.
 * @author Hrishikesh Ugavekar
 * @Version 1.1
 * @since 15-06-2021
 *
 **********************************************************/
package util;
import java.util.Scanner;

public class ArrayMethods  {
	
	Scanner sc = new Scanner(System.in);

	/**
	 * Asks user to input array size Takes input from user and store it in arraySize
	 * Returns arraySize where ever the function is called.
	 * @return Size of the array as specified by user
	 */
	public int userInputArraySize() {
		System.out.println("Enter the number of words you want to input :");
		return sc.nextInt();
	}

	/**
	 * Asks user to enter words Stores those words in wordsArray
	 * Returns the word array
	 */
	public String[] storeWordsInArray(int arraySize) {
		System.out.println("Enter the words :");
		String wordsArray[] = new String[arraySize];
		for (int i = 0; i < arraySize; i++) {
			wordsArray[i] = sc.next();
		}
		return wordsArray;
	}
	
	/**
	 * Takes user input of integers and stores them in array
	 * Returns the array
	 * @param arraySize
	 * @return Integer array
	 */
	public Integer[] storeIntsInArray(Integer arraySize) {
		System.out.println("Enter the numbers :");
		Integer intsArray[] = new Integer[arraySize];
		for (int i = 0; i < arraySize; i++) {
			intsArray[i] = sc.nextInt();
		}
		return intsArray;
	}

	/**
	 * Takes arraySize and generic array as arguments
	 * Prints the words in wordsArray on console
	 */
	public <E> void printArray(int arraySize,E[] anyArray) {
		for (int i = 0; i < arraySize; i++)
			System.out.println(anyArray[i]);
	}

}
