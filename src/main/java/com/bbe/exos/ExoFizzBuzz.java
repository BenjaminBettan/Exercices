package com.bbe.exos;

public class ExoFizzBuzz {
	
	public static String generate(int value) {
		return testMultiple15(value) ? "FizzBuzz" : testMultiple3(value) ? "Fizz" : testMultiple5(value) ? "Buzz" : Integer.toString(value);
	}

	private static boolean testMultiple5(int value) {
		return value %5 ==0;
	}

	private static boolean testMultiple3(int value) {
		return value %3 ==0;
	}
	
	private static boolean testMultiple15(int value) {
		return value %15 ==0;
	}

}
