package com.belhard.basics.linear;

import java.util.Scanner;

import com.belhard.basics.util.ConsoleReader;
import com.belhard.basics.util.ResultPrinter;

public class Task3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ResultPrinter.printToConsole("Enter a value in seconds: ");

		int enteredTime = ConsoleReader.getIntFromConsole(scanner, 36000);

		int timeInHour = enteredTime / 3600;
		int timeInMinutes = (enteredTime / 60) % 60;
		int timeInSeconds = enteredTime % 60;

		ResultPrinter.printToConsoleLine("Result: " + timeInHour + "h " + timeInMinutes + "min " + timeInSeconds + "s");

	}

}
