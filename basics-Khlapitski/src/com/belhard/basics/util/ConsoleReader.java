package com.belhard.basics.util;

import java.util.Scanner;

public class ConsoleReader {

	public static double getDoubleFromConsole(Scanner scanner, double defaultValue) {
		double num;
		if (scanner.hasNextDouble()) {
			num = scanner.nextDouble();
		} else {
			System.out.println("Can't read");
			System.out.println("Set to default");
			num = defaultValue;
		}
		return num;
	}

	public static int getIntFromConsole(Scanner scanner, int defaultValue) {
		int num;
		if (scanner.hasNextInt()) {
			num = scanner.nextInt();
		} else {
			System.out.println("Can't read");
			System.out.println("Set to default");
			num = defaultValue;
		}
		return num;
	}

	public static int getIntFromConsolePositive(Scanner scanner, int defaultValue) {
		int num;
		if (scanner.hasNextInt()) {
			num = scanner.nextInt();
		} else {
			System.out.println("Can't read");
			System.out.println("Set to default");
			num = defaultValue;
		}

		if (num < 0) {
			System.out.println("Can't read");
			System.out.println("Set to default");
			num = defaultValue;
		}

		return num;
	}

	public static int getIntFromConsoleNegative(Scanner scanner, int defaultValue) {
		int num;
		if (scanner.hasNextInt()) {
			num = scanner.nextInt();
		} else {
			System.out.println("Can't read");
			System.out.println("Set to default");
			num = defaultValue;
		}

		if (num > 0) {
			System.out.println("Can't read");
			System.out.println("Set to default");
			num = defaultValue;
		}

		return num;
	}

}
