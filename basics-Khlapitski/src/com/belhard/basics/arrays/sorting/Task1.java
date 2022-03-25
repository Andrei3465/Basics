package com.belhard.basics.arrays.sorting;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

import com.belhard.basics.util.Arrayutil;
import com.belhard.basics.util.ResultPrinter;

public class Task1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ResultPrinter.printToConsoleLine("Please, enter langth aray: ");
		int[] array = Arrayutil.arrayRandomInt(scanner);
		Arrayutil.bubbleSort(array);
	}

}
