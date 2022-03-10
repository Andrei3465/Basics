package com.belhard.basics.cycles;

import java.util.Scanner;

import com.belhard.basics.util.ConsoleReader;
import com.belhard.basics.util.Logicutil;
import com.belhard.basics.util.ResultPrinter;

public class Task2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		ResultPrinter.printToConsoleLine("Determining the value of the function Y on the segment A to B with a step H");
		ResultPrinter.printToConsole("Enter the number X: ");
		double x = ConsoleReader.getDoubleFromConsole(2);
		ResultPrinter.printToConsole("Enter the number A: ");
		double beginA = ConsoleReader.getDoubleFromConsole(10);
		ResultPrinter.printToConsole("Enter the number B: ");
		double endB = ConsoleReader.getDoubleFromConsole(10);
		ResultPrinter.printToConsole("Enter the number H: ");
		double stepH = ConsoleReader.getDoubleFromConsole(3);

		for (double i = beginA; i <= endB; i = i + stepH) {
			x = i;
			double result;
			if (x <= 2) {
				result = -x * 2;
			} else {
				result = x + 4;
			}
			ResultPrinter.printToConsoleLine("Function value y = " + result + " at x = " + x);
		}

	}
}
