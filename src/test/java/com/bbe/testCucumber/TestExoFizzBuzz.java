package com.bbe.testCucumber;

import org.junit.jupiter.api.Test;
import com.bbe.exos.ExoFizzBuzz;
import org.junit.Assert;

public class TestExoFizzBuzz {
	
	@Test
	public void test1Retourne1() {
		int i = 1;
		Assert.assertTrue("Expected "+ i + " / " + ExoFizzBuzz.generate(i),ExoFizzBuzz.generate(i).equals("1"));
	}
	
	@Test
	public void test2Retourne2() {
		int i = 2;
		Assert.assertTrue("Expected "+ i + " / " + ExoFizzBuzz.generate(i),ExoFizzBuzz.generate(i).equals("2"));
	}

	@Test
	public void test3RetourneFizz() {
		int i = 3;
		Assert.assertTrue("Expected Fizz / " + ExoFizzBuzz.generate(i),ExoFizzBuzz.generate(i).equals("Fizz"));
	}
	
	@Test
	public void test5RetourneBuzz() {
		int i = 5;
		Assert.assertTrue("Expected Buzz / " + ExoFizzBuzz.generate(i),ExoFizzBuzz.generate(i).equals("Buzz"));
	}
	
	@Test
	public void test15RetourneFizzBuzz() {
		int i = 15;
		Assert.assertTrue("Expected FizzBuzz / " + ExoFizzBuzz.generate(i),ExoFizzBuzz.generate(i).equals("FizzBuzz"));
	}
	
	@Test
	public void test60RetourneFizzBuzz() {
		int i = 60;
		Assert.assertTrue("Expected FizzBuzz / " + ExoFizzBuzz.generate(i),ExoFizzBuzz.generate(i).equals("FizzBuzz"));
	}
	
	@Test
	public void testFinal() {
		StringBuilder sb = new StringBuilder("");
		for (int i = 1; i <= 100; i++) {
			sb.append(ExoFizzBuzz.generate(i));
		}
		System.out.println(sb);
	}

	
}