package com.belhard.basics.util;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Arrayutil {

	public static int[] arrayRandomInt(Scanner scanner) {
		Random random = new Random();
		int[] array = new int[scanner.nextInt()];
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt();
		}
		return array;
	}

	public static double[] arrayRandomDouble(Scanner scanner) {
		Random random = new Random();
		double[] array = new double[scanner.nextInt()];
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt();
		}
		return array;
	}

	public static void bubbleSort(int[] array) {
		int comparisons = 0;
		int replacement = 0;
		boolean sorted = false;
		while (!sorted) {
			sorted = true;
			for (int i = 0; i < array.length - 1; i++) {
				ResultPrinter.printToConsoleLine(Arrays.toString(array));
				if (array[i] > array[i + 1]) {
					ResultPrinter.printToConsoleLine("Swap" + array[i] + "and" + array[i + 1]);
					int temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
					replacement++;
					sorted = false;
				} else {
					ResultPrinter.printToConsoleLine("No need to change elements" + i + "and" + (i + 1));
				}
				comparisons++;
			}
		}
		ResultPrinter.printToConsoleLine("Array size = " + array.length);
		ResultPrinter.printToConsoleLine("Comparisons done = " + comparisons);
		ResultPrinter.printToConsoleLine("Swaps done = " + replacement);
	}
}
