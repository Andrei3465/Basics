package com.belhard.basics.arrays.onedimentional;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import com.belhard.basics.util.ConsoleReader;
import com.belhard.basics.util.ResultPrinter;

public class Task3 {

	public static void main(String[] args) {

		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		ResultPrinter.printToConsole("Enter the length of the sequence: ");
		int numElements = ConsoleReader.getIntFromConsole(scanner, 10);

		int iMin = 0;
		int min = Integer.MAX_VALUE;
		int[] array = new int[numElements];
		int[] arrayMin = new int[numElements - 1];
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt();
		}
		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
				iMin = i;
			}
		}
		for (int i = 0; i < array.length - 1; i++) {
			if (i < iMin) {
				arrayMin[i] = array[i];
			} else {
				arrayMin[i] = array[i + 1];
			}
		}
		ResultPrinter.printToConsoleLine("Source array:" + Arrays.toString(array));
		ResultPrinter.printToConsoleLine("Excluded minimum number: " + min);
		ResultPrinter.printToConsoleLine("New array: " + Arrays.toString(arrayMin));
	}

}
