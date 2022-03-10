package com.belhard.basics.arrays.multidimentional;

import com.belhard.basics.util.ResultPrinter;

public class Task1 {

	public static void main(String[] args) {
		int[][] twoDimArray = { { 5, 7, 3, 17, 15 }, { 7, 0, 1, 12, 21 }, { 8, 1, 2, 3, 4 }, { 11, 18, 5, 9, 11 } };
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				ResultPrinter.printToConsole(twoDimArray[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
