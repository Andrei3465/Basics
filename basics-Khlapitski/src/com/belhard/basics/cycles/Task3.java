package com.belhard.basics.cycles;

import com.belhard.basics.util.Logicutil;
import com.belhard.basics.util.ResultPrinter;

public class Task3 {

	public static void main(String[] args) {
		int sum = Logicutil.sumOfSquares();
		ResultPrinter.printToConsoleLine("The sum of the squares of the first hundred numbers is: " + sum);
	}

}
