package com.belhard.basics.arrays.onedimentional;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import com.belhard.basics.util.Arrayutil;
import com.belhard.basics.util.Logicutil;
import com.belhard.basics.util.ResultPrinter;

public class Task2 {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		ResultPrinter.printToConsole("Enter the length of the array: ");
		double[] array = Arrayutil.arrayRandomDouble(scanner);
		int[] result = Logicutil.countingNumbers(array);

		ResultPrinter.printToConsoleLine("Source array:" + Arrays.toString(array));
		ResultPrinter.printToConsoleLine("Number of negative elements - " + result[0]);
		ResultPrinter.printToConsoleLine("Number of positive elements - " + result[1]);
		ResultPrinter.printToConsoleLine("Number of zero elements - " + result[2]);
	}

}
