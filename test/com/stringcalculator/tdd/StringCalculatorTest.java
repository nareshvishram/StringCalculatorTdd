package com.stringcalculator.tdd;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringCalculatorTest {

	private StringCalculator sc;
	@Before
	public void initialize(){
		sc=new StringCalculator();
	}
	@Test
	public void emptyString(){
		assertEquals(0,sc.add(""));
	}
	@Test
	public void singleNumber(){
		assertEquals(1, sc.add("1"));
		assertEquals(10, sc.add("10"));
	}
	@Test
	public void multipleNumbers(){
		assertEquals(100,sc.add("1,2,80,7,10"));
		assertEquals(10,sc.add("9,1,0,0,0"));
	}
}
