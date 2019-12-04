package com.bbe.testCucumber;

import org.junit.jupiter.api.Test;
import lambdas.ExoFibonacci;
import org.junit.Assert;

public class TestFibonacci {
	
	@Test
	public void test0retourne1() {
		int depth = 0;
		int expected = 1;
		Assert.assertTrue("Expected " + expected +"/"+ExoFibonacci.getFibonacciSuite(depth),ExoFibonacci.getFibonacciSuite(depth)==expected);
	}
	
	@Test
	public void test1retourne1() {
		int depth = 1;
		int expected = 1;
		Assert.assertTrue("Expected " + expected +"/"+ExoFibonacci.getFibonacciSuite(depth),ExoFibonacci.getFibonacciSuite(depth)==expected);
	}
	
	@Test
	public void test2retourne3() {
		int depth = 2;
		int expected = 3;
		Assert.assertTrue("Expected " + expected +"/"+ExoFibonacci.getFibonacciSuite(depth),ExoFibonacci.getFibonacciSuite(depth)==expected);
	}

	@Test
	public void test3retourne6() {
		int depth = 3;
		int expected = 6;
		Assert.assertTrue("Expected " + expected +"/"+ExoFibonacci.getFibonacciSuite(depth),ExoFibonacci.getFibonacciSuite(depth)==expected);
	}
	
}