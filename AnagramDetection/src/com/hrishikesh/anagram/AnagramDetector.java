/**********************************************************
 * Purpose : Check if two words are anagrams.
 * @author Hrishikesh Ugavekar
 * @Version 1.1
 * @since 16-06-2021
 *
 **********************************************************/
package com.hrishikesh.anagram;
import java.util.Arrays;
import java.util.Scanner;

public class AnagramDetector {
	private static Scanner sc = new Scanner(System.in);

	/**
	 * Purpose is to convert strings to character array
	 * @param str
	 * @return array of characters
	 */
	private static char[] convertToCharArray(String str) {
		return str.toCharArray();
	}

	/**
	 * Purpose : to take string input from console and return it
	 * @return string which user entered
	 */
	private static String userInputString() {
		System.out.println("Enter word");
		return sc.next();
	}

	/**
	 * Purpose : Sort the character array
	 * @param array from main
	 */
	private static void sort(char array[]) {
		Arrays.sort(array);
	}

	/**
	 * Purpose : check if words are anagram or not.
	 * If lengths are not equal they are not anagrams.
	 * If lengths are equal traverse through the words and check if all characters are equal
	 * If any individual pair of characters not equal , then its not anagram. 
	 * @param word1 array
	 * @param word2 array
	 * @return 0 if not anagram otherwise 1
	 */
	private static int checkAnagram(char word1[], char word2[]) {
		if (word1.length != word2.length)
			return 0;

		for (int i = 0; i < word1.length; i++) {
			if (word1[i] != word2[i]) {
				return 0;
			}
		}

		return 1;

	}

	public static void main(String[] args) {
		String string1;
		String string2;
		char word1[];
		char word2[];
		string1 = userInputString();
		string2 = userInputString();
		word1 = convertToCharArray(string1);
		word2 = convertToCharArray(string2);
		sort(word1);
		sort(word2);
		int check = checkAnagram(word1, word2);
		if (check == 0) {
			System.out.println("Not Anagram");
		} else {
			System.out.println("Anagram");
		}

	}

}
