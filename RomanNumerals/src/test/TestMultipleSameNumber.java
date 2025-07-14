package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.RomanNumerals;

class TestMultipleSameNumber {


	//---------------------- 1.5 Multiple digits – same number ------------------------------------
	
	@Test
	// TC42: III = 3
	void TC42() {
	    RomanNumerals test = new RomanNumerals();
	    int result = test.convertRomanNumToInt("III");
	    assertEquals(3, result);
	}

	@Test
	// TC43: VVV = error
	void TC43() {
	    RomanNumerals test = new RomanNumerals();
	    test.convertRomanNumToInt("VVV");
	    fail("Expected invalid input 'VVV'");
	}

	@Test
	// TC44: XXX = 30
	void TC44() {
	    RomanNumerals test = new RomanNumerals();
	    int result = test.convertRomanNumToInt("XXX");
	    assertEquals(30, result);
	}

	@Test
	// TC45: LLL = error
	void TC45() {
	    RomanNumerals test = new RomanNumerals();
	    test.convertRomanNumToInt("LLL");
	    fail("Expected invalid input 'LLL'");
	}

	@Test
	// TC46: CCC = 300
	void TC46() {
	    RomanNumerals test = new RomanNumerals();
	    int result = test.convertRomanNumToInt("CCC");
	    assertEquals(300, result);
	}

	@Test
	// TC47: DDD = error
	void TC47() {
	    RomanNumerals test = new RomanNumerals();
	    test.convertRomanNumToInt("DDD");
	    fail("Expected invalid input 'DDD'");
	}

	@Test
	// TC48: MMM = 3000
	void TC48() {
	    RomanNumerals test = new RomanNumerals();
	    int result = test.convertRomanNumToInt("MMM");
	    assertEquals(3000, result);
	}
	

}
