package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.RomanNumerals;

class TestRepeatMoreThanThree {


	@Test
	// TC90: IIII = error
	void TC90() {
	    RomanNumerals test = new RomanNumerals();
	    test.convertRomanNumToInt("IIII");
	    fail("Expected invalid input 'IIII'");
	}

	@Test
	// TC91: VVVV = error
	void TC91() {
	    RomanNumerals test = new RomanNumerals();
	    test.convertRomanNumToInt("VVVV");
	    fail("Expected invalid input 'VVVV'");
	}

	@Test
	// TC92: XXXX = error
	void TC92() {
	    RomanNumerals test = new RomanNumerals();
	    test.convertRomanNumToInt("XXXX");
	    fail("Expected invalid input 'XXXX'");
	}

	@Test
	// TC93: LLLL = error
	void TC93() {
	    RomanNumerals test = new RomanNumerals();
	    test.convertRomanNumToInt("LLLL");
	    fail("Expected invalid input 'LLLL'");
	}

	@Test
	// TC94: CCCC = error
	void TC94() {
	    RomanNumerals test = new RomanNumerals();
	    test.convertRomanNumToInt("CCCC");
	    fail("Expected invalid input 'CCCC'");
	}

	@Test
	// TC95: DDDD = error
	void TC95() {
	    RomanNumerals test = new RomanNumerals();
	    test.convertRomanNumToInt("DDDD");
	    fail("Expected invalid input 'DDDD'");
	}

	@Test
	// TC96: MMMM = error
	void TC96() {
	    RomanNumerals test = new RomanNumerals();
	    test.convertRomanNumToInt("MMMM");
	    fail("Expected invalid input 'MMMM'");
	}
	


}
