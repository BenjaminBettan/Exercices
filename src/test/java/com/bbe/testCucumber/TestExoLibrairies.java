package com.bbe.testCucumber;

import org.junit.jupiter.api.Test;
import lambdas.ExoLibrairies;
import static org.junit.Assert.assertTrue;
import java.util.*;

public class TestExoLibrairies {

	@Test
	public void test3() {
		List<Integer> cost = Arrays.asList(1,2,3);
		List<Integer> quantity = Arrays.asList(1,2,3);
		int solde = 3;
		int result = ExoLibrairies.solve(solde ,cost,quantity);
		int expected = 3;
		assertTrue("Expected : " + expected +" / "+result, result==expected);
	}
	
	
	
	
}