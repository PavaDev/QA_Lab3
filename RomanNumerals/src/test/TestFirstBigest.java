package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.RomanNumerals;

class TestFirstBigest {


	//---------------------- 1.6 Multiple digits – first digit is larger than the rest ------------------------------------

	@Test
	// TC49: VIII = 8
	void TC49() {
	    RomanNumerals test = new RomanNumerals();
	    int result = test.convertRomanNumToInt("VIII");
	    assertEquals(8, result);
	}

	@Test
	// TC50: XVI = 16
	void TC50() {
	    RomanNumerals test = new RomanNumerals();
	    int result = test.convertRomanNumToInt("XVI");
	    assertEquals(16, result);
	}

	@Test
	// TC51: XXVII = 27
	void TC51() {
	    RomanNumerals test = new RomanNumerals();
	    int result = test.convertRomanNumToInt("XXVII");
	    assertEquals(27, result);
	}

	@Test
	// TC52: LXVII = 67
	void TC52() {
	    RomanNumerals test = new RomanNumerals();
	    int result = test.convertRomanNumToInt("LXVII");
	    assertEquals(67, result);
	}

	@Test
	// TC53: MDCI = 1601
	void TC53() {
	    RomanNumerals test = new RomanNumerals();
	    int result = test.convertRomanNumToInt("MDCI");
	    assertEquals(1601, result);
	}

	@Test
	// TC54: CXXI = 121
	void TC54() {
	    RomanNumerals test = new RomanNumerals();
	    int result = test.convertRomanNumToInt("CXXI");
	    assertEquals(121, result);
	}

	@Test
	// TC55: DCLX = 660
	void TC55() {
	    RomanNumerals test = new RomanNumerals();
	    int result = test.convertRomanNumToInt("DCLX");
	    assertEquals(660, result);
	}
	

}
