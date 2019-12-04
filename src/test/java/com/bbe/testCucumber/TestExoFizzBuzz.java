package com.bbe.testCucumber;

import org.junit.jupiter.api.Test;
import com.bbe.exos.ExoFizzBuzz;
import org.junit.Assert;

public class TestExoFizzBuzz {
	
	@Test
	public void test1Retourne1() {
		String expected = "1";
		int input = 1;
		Assert.assertTrue("Expected "+ expected + " / " + ExoFizzBuzz.generate(input),ExoFizzBuzz.generate(input).equals(expected));
	}
	
	@Test
	public void test2Retourne12() {
		String expected = "1 2";
		int input = 2;
		Assert.assertTrue("Expected "+ expected + " / '" + ExoFizzBuzz.generate(input) +"'",ExoFizzBuzz.generate(input).equals(expected));
	}
	@Test
	public void test3Retourne12Fizz() {
		String expected = "1 2 Fizz";
		int input = 3;
		Assert.assertTrue("Expected "+ expected + " / " + ExoFizzBuzz.generate(input),ExoFizzBuzz.generate(input).equals(expected));
	}
	@Test
	public void test3Retourne12Fizz4() {
		String expected = "1 2 Fizz 4";
		int input = 4;
		Assert.assertTrue("Expected "+ expected + " / " + ExoFizzBuzz.generate(input),ExoFizzBuzz.generate(input).equals(expected));
	}
	@Test
	public void test() {
		System.out.println(ExoFizzBuzz.generate(100));
	}
	
}