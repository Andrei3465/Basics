package com.belhard.basics.arrays.sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

import com.belhard.basics.util.Arrayutil;
import com.belhard.basics.util.ResultPrinter;

public class Task1 {

	public static void main(String[] args) {
		ResultPrinter.printToConsoleLine("Please, enter langth aray: ");
		int[] array = Arrayutil.arrayRandomInt();
		Arrayutil.bubbleSort(array);
	}

}
