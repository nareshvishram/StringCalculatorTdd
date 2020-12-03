package com.stringcalculator.tdd;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class StringCalculatorTest {

	private StringCalculator sc;
	@Before
	public void initialize(){
		sc=new StringCalculator();
	}
	@Rule
    public ExpectedException thrown = ExpectedException.none();
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
	@Test
	public void newLineDelimeter(){
		assertEquals(8,sc.add("1,\n7"));
		assertEquals(28,sc.add("1,2,3,4,5,6,\n7"));
	}
	@Test
	public void negativeNumberHandelling(){
		thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Negatives Not Allowed");
		sc.add("-1");
		sc.add("-1,2\3");
	}
}
