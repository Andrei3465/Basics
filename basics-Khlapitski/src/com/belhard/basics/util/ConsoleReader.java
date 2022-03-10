package com.belhard.basics.util;

import java.util.Scanner;

public class ConsoleReader {

		public static double getDoubleFromConsole(double defaultValue) {
			Scanner scanner = new Scanner(System.in);
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
		
		public static int getIntFromConsole(int defaultValue) {
			Scanner scanner = new Scanner(System.in);
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
		
		public static int getIntFromConsolePositive(int defaultValue) {
			Scanner scanner = new Scanner(System.in);
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
		
		public static int getIntFromConsoleNegative(int defaultValue) {
			Scanner scanner = new Scanner(System.in);
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


