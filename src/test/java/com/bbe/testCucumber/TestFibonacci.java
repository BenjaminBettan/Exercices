package com.bbe.testCucumber;

import org.junit.jupiter.api.Test;

import lambdas.ExoFibonacci;
import lambdas.ExoTemperatureLambda;

import org.junit.Assert;

public class TestFibonacci {
	
	@Test
	public void test0retourne1() {
		int depth = 0;
		Assert.assertTrue("Expected 1\n/"+ExoFibonacci.getFibonacciSuite(depth),ExoFibonacci.getFibonacciSuite(depth).equals("1\n"));
	}
	@Test
	public void test1retourne2() {
		int depth = 1;
		Assert.assertTrue("Expected 1\n2/"+ExoFibonacci.getFibonacciSuite(depth),ExoFibonacci.getFibonacciSuite(depth).equals("1\n2"));
	}
	
}