/*****************************************************************************************
 * Purpose : Read the Text from a file, split it into words and arrange it as Linked List.
 *Take a user input to search a Word in the List. If the Word is not found then add it
 *to the list, and if it found then remove the word from the List. In the end save the
 *list into a file.
 * @author Hrishikesh Ugavekar
 * @Version 1.0
 * @since 15-06-2021
 *
 *****************************************************************************************/

package com.hrishikesh.list;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class FileOperations {
	// Creating object of LinkedList
	private List<String> list = new LinkedList<>();

	/**
	 * Purpose : To read file from file path and store the words in a linked list
	 * 
	 * @return A linked list "list" which contains all the words from file
	 * @throws FileNotFoundException
	 */
	private List<String> readFile() throws FileNotFoundException {
		File file = new File("C:\\Users\\Hrishikesh\\Desktop\\Java_assignments\\Day16&17\\UnorderedList\\testFile.txt");
		Scanner scan = new Scanner(file);
		while (scan.hasNextLine()) {
			list.add(scan.nextLine());
		}
		scan.close();
		return list;
	}

	/**
	 * Takes the user input of the word which user wants to find
	 * 
	 * @return the word user wants to search
	 */
	private String takeUserInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter word to search in file ");
		return sc.next();
	}

	/**
	 * @param key (The word user entered) Checks if a word is present in linked
	 *            list. If present removes it, if not adds it.
	 */
	private void editLinkedList(String key) {
		if (list.contains(key)) {
			list.remove(key);
		} else {
			list.add(key);
		}
	}

	/**
	 * Prints the linked list on console
	 */
	private void printList() {
		System.out.println(list);
	}

	/**
	 * Purpose: To write linked list "list" into the file iterator helps to iterate
	 * over list and writes into the file line by line.
	 * @throws IOException
	 */
	private void writeFile() throws IOException {
		FileWriter writer = new FileWriter("C:\\Users\\Hrishikesh\\Desktop\\Java_assignments\\Day16&17\\UnorderedList\\targetFile.txt");
		Iterator<String> itr = list.iterator();
		int i = 0;
		while (itr.hasNext() && i < list.size()) {
			writer.write(list.get(i).concat(" "));
			i++;
		}
		writer.close();
		System.out.println("File write successful");

	}

	public static void main(String[] args) throws IOException {
		FileOperations operation = new FileOperations();
		operation.readFile();
		String key = operation.takeUserInput();
		operation.editLinkedList(key);
		operation.printList();
		operation.writeFile();
	}
}
