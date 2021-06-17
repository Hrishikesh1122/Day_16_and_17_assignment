/**********************************************************
 * Purpose : Get prime numbers from range 0-1000
 * @author Hrishikesh Ugavekar
 * @Version 1.1
 * @since 15-06-2021
 *
 **********************************************************/
package com.hrishikesh.primenumbers;
import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {
	//primeNumberList will store prime numbers between 0-1000
	private int maxCheck = 1000;
	private List<Integer> primeNumberList = new ArrayList<>();

	/**
	 * Checks if a number is prime or not
	 * @param numberToCheck 
	 * @return true if number is prime otherwise return false
	 */
	private static boolean checkPrime(int numberToCheck) {
		int remainder;
		for (int i = 2; i <= numberToCheck / 2; i++) {
			remainder = numberToCheck % i;
			if (remainder == 0) {
				return false;
			}
		}
		return true;

	}

	/**
	 * Calls the function checkPrime()
	 * If i'th number is prime store it in primeNumberList.
	 */
	private void storeInArray() {
		boolean isPrime = true;
		for (int i = 2; i <= maxCheck; i++) {
			isPrime = checkPrime(i);
			if (isPrime) {
				primeNumberList.add(i);
			}
		}
	}

	/**
	 * Prints the primeNumberList on console
	 */
	private void printPrimes() {
		for (int i = 0; i < primeNumberList.size(); i++) {
			System.out.println(primeNumberList.get(i));
		}
	}

	public static void main(String[] args) {
		PrimeNumbers primes = new PrimeNumbers();
		primes.storeInArray();
		primes.printPrimes();
	}

}
