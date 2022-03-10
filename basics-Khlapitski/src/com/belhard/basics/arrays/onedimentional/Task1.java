package com.belhard.basics.arrays.onedimentional;

import java.util.Arrays;
import java.util.Scanner;

import com.belhard.basics.util.Arrayutil;
import com.belhard.basics.util.ConsoleReader;
import com.belhard.basics.util.Logicutil;
import com.belhard.basics.util.ResultPrinter;

public class Task1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ResultPrinter.printToConsoleLine("Sum of array elements N of multiples K");
		ResultPrinter.printToConsole("Enter the number K: ");
		double numbK = ConsoleReader.getDoubleFromConsole(3);
		ResultPrinter.printToConsole("Enter the length of the array N:");
		int[] array = Arrayutil.arrayRandomInt();
		int sum = Logicutil.sumOfMultiples(numbK, array);

		ResultPrinter.printToConsoleLine("Source array:" + Arrays.toString(array));
		ResultPrinter.printToConsoleLine("The sum of multiples of " + numbK + " = " + sum);
	}

}
