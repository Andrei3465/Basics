package com.belhard.basics.arrays.multidimentional;

import java.util.Arrays;

import com.belhard.basics.util.ResultPrinter;

public class Task2 {

	public static void main(String[] args) {

		int[][] array = { { 4, 1, 3, 2, 5 }, { 7, 9, 6, 10, 8 }, { 12, 11, 15, 13, 14 }, { 16, 18, 20, 17, 19 } };
		for (int i = 0; i < array.length; i++) {
			Arrays.sort(array[i]);
			ResultPrinter.printToConsoleLine(" " + Arrays.toString(array[i]) + "\t");
		}
		System.out.println();
	}
}
