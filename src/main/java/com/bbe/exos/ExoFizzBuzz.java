package com.bbe.exos;

public class ExoFizzBuzz {
	
	public static String generate(int value) {
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 1; i <= value; i++) {
			sb.append(testMultiple15(i) ? " FizzBuzz" : testMultiple3(i) ? " Fizz" : testMultiple5(i) ? " Buzz" : " " + Integer.toString(i));
		}
		return sb.substring(1);
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
