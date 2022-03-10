package com.belhard.basics.util;

public class Logicutil {

	public static int addingUpToNumber(int num) {
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		return sum;

	}

	public static double segmentWithStep(double numA, double numB, double numC, double x) {

		double result;
		for (double i = numA; i <= numB; i = i + numC)
			x = i;
		if (x <= 2) {
			result = -x * 2;
		} else {
			result = x + 4;
		}
		return result;
	}

	public static int sumOfSquares() {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i * i;
		}
		return sum;
	}

	public static void ascii() {
		for (int i = 33; i < 128; i++) {
			System.out.println(i + ": " + (char) i);
		}
	}

	public static double maxForMinMax(double numA, double numB, double numC, double numD) {
		double min1 = (numA < numB) ? numA : numB;
		double min2 = (numC < numD) ? numC : numD;
		double max = (min1 > min2) ? min1 : min2;
		return max;
	}

	public static double equation(double numA) {
		double result = (numA <= 3) ? (numA * numA) - (3 * numA) + 9 : 1 / (numA * numA * numA + 6);
		return result;
	}

	public static int sumOfMultiples(double num, int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % num == 0) {
				sum += array[i] / num;
			}
		}
		return sum;
	}

	public static int[] countingNumbers(double[] array) {
		int countZero = 0;
		int countPositive = 0;
		int countNegative = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 0) {
				countZero++;
			} else if (array[i] > 0) {
				countPositive++;
			} else {
				countNegative++;
			}
		}
		return new int[] { countNegative, countPositive, countZero };
	}
}
