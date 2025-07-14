package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.RomanNumerals;

class TestFirstSmaller {

	//---------------------- 1.2 Two digits – the first digit is smaller than the second ------------------------------------
	

	@Test
	//TC08: IV = 4
	void TC08() {
		RomanNumerals test = new RomanNumerals();
		int result = test.convertRomanNumToInt("IV");
						
		assertEquals(4, result);
	}
		

	@Test
	//TC09: IX = 9
	void TC09() {
		RomanNumerals test = new RomanNumerals();
		int result = test.convertRomanNumToInt("IX");
						
		assertEquals(9, result);
	}


	@Test
	//TC10: XL = 40
	void TC10() {
		RomanNumerals test = new RomanNumerals();
		int result = test.convertRomanNumToInt("XL");
						
		assertEquals(40, result);
	}
		

	@Test
	//TC11: XC = 90
	void TC11() {
		RomanNumerals test = new RomanNumerals();
		int result = test.convertRomanNumToInt("XC");
						
		assertEquals(90, result);
	}
		

	@Test
	//TC12: CD = 400
	void TC12() {
		RomanNumerals test = new RomanNumerals();
		int result = test.convertRomanNumToInt("CD");
						
		assertEquals(400, result);
	}
		

	@Test
	//TC13: CM = 900
	void TC13() {
		RomanNumerals test = new RomanNumerals();
		int result = test.convertRomanNumToInt("CM");
						
		assertEquals(900, result);
	}

}
