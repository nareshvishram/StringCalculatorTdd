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
}
