package com.belhard.basics.cycles;

import java.util.Scanner;

import com.belhard.basics.util.ConsoleReader;
import com.belhard.basics.util.Logicutil;
import com.belhard.basics.util.ResultPrinter;

public class Task1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		ResultPrinter.printToConsole("Enter positiv integer: ");

		int enteredNumb = ConsoleReader.getIntFromConsolePositive(scanner, 100);

		int sum = Logicutil.addingUpToNumber(enteredNumb);
		ResultPrinter.printToConsole("The sum of the number is: " + sum);
	}

}
