package com.mycompany.app;

import static org.junit.Assert.*;

import org.junit.Test;


public class MathTest {
	
	public MathTest() {
		// TODO Auto-generated constructor stub
	}
	@Test
	public void TestPrime_1()
	{
		assertTrue(Math.isPrime(1));
	}
	
	@Test
	public void TestPrime_2()
	{
		assertTrue(Math.isPrime(2));
	}
	
	@Test
	public void TestPrime_3()
	{
		assertTrue(Math.isPrime(30));
	}
	
	@Test
	public void TestPrime_4()
	{
		assertFalse(Math.isPrime(4));
	}
	

	@Test
	public void TestPrime_29()
	{
		assertTrue(Math.isPrime(29));
	}
	

	@Test
	public void TestPrime_100()
	{
		assertFalse(Math.isPrime(100));
	}
	
}
