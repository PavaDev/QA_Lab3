package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.RomanNumerals;

class TestSameNumber {


	//---------------------- 1.4 Two digits – same number ------------------------------------
	
	@Test
	// TC35: II = 2
	void TC35() {
	    RomanNumerals test = new RomanNumerals();
	    int result = test.convertRomanNumToInt("II");
	    assertEquals(2, result);
	}

	@Test
	// TC36: VV = error
	void TC36() {
	    RomanNumerals test = new RomanNumerals();
	    test.convertRomanNumToInt("VV");
	    fail("Expected invalid input 'VV'");
	}

	@Test
	// TC37: XX = 20
	void TC37() {
	    RomanNumerals test = new RomanNumerals();
	    int result = test.convertRomanNumToInt("XX");
	    assertEquals(20, result);
	}

	@Test
	// TC38: LL = error
	void TC38() {
	    RomanNumerals test = new RomanNumerals();
	    test.convertRomanNumToInt("LL");
	    fail("Expected invalid input 'LL'");
	}

	@Test
	// TC39: CC = 200
	void TC39() {
	    RomanNumerals test = new RomanNumerals();
	    int result = test.convertRomanNumToInt("CC");
	    assertEquals(200, result);
	}

	@Test
	// TC40: DD = error
	void TC40() {
	    RomanNumerals test = new RomanNumerals();
	    test.convertRomanNumToInt("DD");
	    fail("Expected invalid input 'DD'");
	}

	@Test
	// TC41: MM = 2000
	void TC41() {
	    RomanNumerals test = new RomanNumerals();
	    int result = test.convertRomanNumToInt("MM");
	    assertEquals(2000, result);
	}
	

}
