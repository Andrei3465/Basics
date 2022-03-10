package com.belhard.basics.branching;

import java.util.Scanner;

import com.belhard.basics.util.ConsoleReader;
import com.belhard.basics.util.Logicutil;
import com.belhard.basics.util.ResultPrinter;

public class Task2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ResultPrinter.printToConsoleLine("Enter number: x :");
		double numA = ConsoleReader.getDoubleFromConsole(5);

		double result = Logicutil.equation(numA);
		ResultPrinter.printToConsole("Meaning function :" + result);
	}
}
