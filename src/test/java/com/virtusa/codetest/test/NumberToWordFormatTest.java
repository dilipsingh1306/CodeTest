package com.virtusa.codetest.test;

import com.virtusa.codetest.NumberToWordFormat;

import junit.framework.TestCase;

public class NumberToWordFormatTest extends TestCase {

	
	public void testValidNumber() {

		NumberToWordFormat nf = new NumberToWordFormat();
		assertEquals("thirteen thousand two hundred thirty-three", nf.numberToWord(13233));

	}

}
