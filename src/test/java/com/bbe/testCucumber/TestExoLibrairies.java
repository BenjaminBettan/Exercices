package com.bbe.testCucumber;

import org.junit.jupiter.api.Test;
import lambdas.ExoLibrairies;
import static org.junit.Assert.assertTrue;
import java.util.*;

public class TestExoLibrairies {

//	@Test
//	public void test1() {
//		List<Integer> cost = Arrays.asList(1);
//		List<Integer> quantity = Arrays.asList(1);
//		int solde = 1;
//		int result = ExoLibrairies.solve(solde ,cost,quantity);
//		int expected = 1;
//		assertTrue("Expected : " + expected +" / "+result, result==expected);
//	}
//	
//	@Test
//	public void test2() {
//		List<Integer> cost = Arrays.asList(2);
//		List<Integer> quantity = Arrays.asList(2);
//		int solde = 2;
//		int result = ExoLibrairies.solve(solde ,cost,quantity);
//		int expected = 2;
//		assertTrue("Expected : " + expected +" / "+result, result==expected);
//	}
	
	@Test
	public void test3() {
		List<Integer> cost = Arrays.asList(2,2,2,1,1,1);
		List<Integer> quantity = Arrays.asList(1,2,3,1,2,3);
		int solde = 3;
		int result = ExoLibrairies.solve(solde ,cost,quantity);
		int expected = 3;
		assertTrue("Expected : " + expected +" / "+result, result==expected);
	}
	
	
	
	
}