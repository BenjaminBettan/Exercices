package com.bbe.testCucumber;

import org.junit.jupiter.api.Test;
import lambdas.BookshopsExercice;
import static org.junit.Assert.assertTrue;
import java.util.*;

public class BookshopUnitTests {

	@Test
	public void test1() {
		List<Integer> cost = Arrays.asList(1,2);
		List<Integer> quantity = Arrays.asList(1,2);
		int balance = 3;
		int result = BookshopsExercice.solve(balance, cost, quantity);
		int expected = 3;
		assertTrue("Expected : " + expected +" / "+result, result==expected);
	}

	@Test
	public void test2() {
		List<Integer> cost = Arrays.asList(1,1,1,1,1,
										   1,1,1,1,1);
		
		List<Integer> quantity = Arrays.asList(1,1,1,1,1,
				   							   1,1,1,1,1);
		int balance = 9;
		int result = BookshopsExercice.solve(balance, cost, quantity);
		int expected = 9;
		assertTrue("Expected : " + expected +" / "+result, result==expected);
	}
	
	@Test
	public void test3() {
		List<Integer> cost = Arrays.asList(1,1,1,1,1,
										   1,1,1,1,1);
		
		List<Integer> quantity = Arrays.asList(1,1,1,1,1,
				   							   1,1,1,1,1);
		int balance = 10;
		int result = BookshopsExercice.solve(balance, cost, quantity);
		int expected = 10;
		assertTrue("Expected : " + expected +" / "+result, result==expected);
	}
	
	@Test
	public void test4() {
		List<Integer> cost = Arrays.asList(1,1,1,1,1,
										   1,1,1,1,1);
		
		List<Integer> quantity = Arrays.asList(1,1,1,1,1,
				   							   1,1,1,1,1);
		int balance = 11;
		int result = BookshopsExercice.solve(balance, cost, quantity);
		int expected = 10;
		assertTrue("Expected : " + expected +" / "+result, result==expected);
	}
	/*
	@Test
	public void test5() {
		List<Integer> cost = Arrays.asList(20,10,19);
		
		List<Integer> quantity = Arrays.asList(24,20,20);
		int balance = 50;
		int result = BookshopsExercice.solve(balance, cost, quantity);
		int expected = 40;
		assertTrue("Expected : " + expected +" / "+result, result==expected);
	}
	
	@Test
	public void test6() {
		List<Integer> quantity = Arrays.asList(20,10,100,19);
		
		List<Integer> cost = Arrays.asList(24,20,20,20);
		int balance = 50;
		int result = BookshopsExercice.solve(balance, cost, quantity);
		int expected = 200;
		assertTrue("Expected : " + expected +" / "+result, result==expected);
	}
	*/
}