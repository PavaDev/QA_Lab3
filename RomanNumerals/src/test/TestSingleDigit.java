package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.RomanNumerals;

class TestSingleDigit {
	
	//---------------------- 1.1 single digit ------------------------------------

	@Test
	//TC01: I = 1
	void TC01() {
		RomanNumerals test = new RomanNumerals();
		int result = test.convertRomanNumToInt("I");
			
		assertEquals(1, result);
	}
	
	@Test
	//TC02: V = 5
	void TC02() {
		RomanNumerals test = new RomanNumerals();
		int result = test.convertRomanNumToInt("V");
				
		assertEquals(5, result);
	}
	
	@Test
	//TC03: X =10
	void TC03() {
		RomanNumerals test = new RomanNumerals();
		int result = test.convertRomanNumToInt("X");
					
		assertEquals(10, result);
	}
	

	@Test
	//TC04: L = 50
	void TC04() {
		RomanNumerals test = new RomanNumerals();
		int result = test.convertRomanNumToInt("L");
					
		assertEquals(50, result);
	}
	

	@Test
	//TC05: C = 100
	void TC05() {
		RomanNumerals test = new RomanNumerals();
		int result = test.convertRomanNumToInt("C");
					
		assertEquals(100, result);
	}
	

	@Test
	//TC06: D = 500
	void TC06() {
		RomanNumerals test = new RomanNumerals();
		int result = test.convertRomanNumToInt("D");
					
		assertEquals(500, result);
	}
	

	@Test
	//TC07: M = 1000
	void TC07() {
		RomanNumerals test = new RomanNumerals();
		int result = test.convertRomanNumToInt("M");
					
		assertEquals(1000, result);
	}
	
	
	
}
