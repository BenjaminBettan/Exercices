package com.bbe.testCucumber;

import org.junit.jupiter.api.Test;

import lambdas.ExoTemperatureLambda;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Assert;

public class TestExoTemperatures {
	@Test
	public void testVideRetourne0() throws Exception  {
		double[] t = {};
		Assert.assertTrue("Expected 0/"+ExoTemperatureLambda.closestToZero(t),ExoTemperatureLambda.closestToZero(t)==0);
	}
	
	@Test
	public void test3retourne3() throws Exception  {
		double[] t = {3};
		Assert.assertTrue("Expected 3/"+ExoTemperatureLambda.closestToZero(t),ExoTemperatureLambda.closestToZero(t)==3);
	}
	
	@Test
	public void test4et3retourne3() throws Exception  {
		double[] t = {4,3};
		Assert.assertTrue("Expected 3/"+ExoTemperatureLambda.closestToZero(t),ExoTemperatureLambda.closestToZero(t)==3);
	}
	@Test
	public void test1et2et_4() throws Exception  {
		double[] t = {1,2,-4};
		Assert.assertTrue("Expected 1/"+ExoTemperatureLambda.closestToZero(t),ExoTemperatureLambda.closestToZero(t)==1);
	}
	
	@Test
	public void test_1et2et_4() throws Exception  {
		double[] t = {-1,2,-4};
		Assert.assertTrue("Expected -1/"+ExoTemperatureLambda.closestToZero(t),ExoTemperatureLambda.closestToZero(t)==-1);
	}
	
	@Test
	public void test_1et2et1() throws Exception {
		double[] t = {-1,2,1};
		Assert.assertTrue("Expected 1/"+ExoTemperatureLambda.closestToZero(t),ExoTemperatureLambda.closestToZero(t)==1);
	}
	
	@Test
	public void testNull() {
		double[] t = null;
		assertThrows(Exception.class, ()->ExoTemperatureLambda.closestToZero(t));
	}
	
}