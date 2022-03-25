package com.belhard.basics.linear;

import java.util.Scanner;

import com.belhard.basics.util.ConsoleReader;
import com.belhard.basics.util.ResultPrinter;

public class Task2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		ResultPrinter.printToConsole("Please enter number in format (nnn.ddd); ");
		double enteredNum = ConsoleReader.getDoubleFromConsole(scanner, 123.321);

		double result = (enteredNum * 1000) % 1000 + (int) enteredNum / 1000.0;
		ResultPrinter.printToConsole("Result: " + result);
	}

}
