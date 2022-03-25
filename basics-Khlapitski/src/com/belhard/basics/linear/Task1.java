package com.belhard.basics.linear;

import java.util.Scanner;

import com.belhard.basics.util.ConsoleReader;
import com.belhard.basics.util.ResultPrinter;

public class Task1 {

	public static void main(String[] args) {

		ResultPrinter.printToConsoleLine("To slove the equation: [z = ( (a – 3 ) * b / 2) + c] - entered: a,b,c");
		Scanner scanner = new Scanner(System.in);

		ResultPrinter.printToConsole("Please enter number a :");
		double numA = ConsoleReader.getDoubleFromConsole(scanner, 8);
		ResultPrinter.printToConsole("Please enter number b :");
		double numB = ConsoleReader.getDoubleFromConsole(scanner, 6);
		ResultPrinter.printToConsole("Please enter number c :");
		double numC = ConsoleReader.getDoubleFromConsole(scanner, 7);

		double result = ((numA - 3) * numB / 2) + numC;
		ResultPrinter.printToConsole("Meaning function z = " + result);

	}

}
