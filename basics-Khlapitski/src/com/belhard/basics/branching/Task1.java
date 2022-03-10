package com.belhard.basics.branching;

import java.util.Scanner;

import com.belhard.basics.util.ConsoleReader;
import com.belhard.basics.util.Logicutil;
import com.belhard.basics.util.ResultPrinter;

public class Task1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		ResultPrinter.printToConsoleLine("max{min(a, b), min(c, d):");
		ResultPrinter.printToConsole("Enter number a: ");
		double numA = ConsoleReader.getDoubleFromConsole(27);
		ResultPrinter.printToConsole("Enter number b: ");
		double numB = ConsoleReader.getDoubleFromConsole(36);
		ResultPrinter.printToConsole("Enter number c: ");
		double numC = ConsoleReader.getDoubleFromConsole(57);
		ResultPrinter.printToConsole("Enter number d: ");
		double numD = ConsoleReader.getDoubleFromConsole(83);

		double max = Logicutil.maxForMinMax(numA, numB, numC, numD);
		ResultPrinter.printToConsoleLine("max =  " + max);
	}
}
