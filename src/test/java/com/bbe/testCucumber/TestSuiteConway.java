package com.bbe.testCucumber;

import org.junit.jupiter.api.Test;
import com.bbe.exos.SuiteConway;
import org.junit.Assert;

public class TestSuiteConway {
	
	@Test
	public void test1() {
		String s = SuiteConway.solve("1",1);
		Assert.assertTrue("Expected 1 1/"+s,s.equals("1 1"));
	}
	@Test
	public void test2() {
		String s = SuiteConway.solve("1 1",1);
		Assert.assertTrue("Expected 2 1/"+s,s.equals("2 1"));
	}
	
}