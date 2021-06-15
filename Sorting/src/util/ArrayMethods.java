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

public class ArrayMethods {
	
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
	 * Prints the words in wordsArray on console
	 */
	public void printArray(int arraySize,String wordsArray[]) {
		for (int i = 0; i < arraySize; i++)
			System.out.println(wordsArray[i]);
	}

}
