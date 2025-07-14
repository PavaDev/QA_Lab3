package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.RomanNumerals;

class TestFirstBigestAndCombination {


	//---------------------- 1.7 Multiple digits – first digit is largest number and the rest is the combination of (2), (3), (4) ------------------------------------
	
	@Test
	// TC56: XIX = 19
	void TC56() {
	    RomanNumerals test = new RomanNumerals();
	    int result = test.convertRomanNumToInt("XIX");
	    assertEquals(19, result);
	}

	@Test
	// TC57: LIX = 59
	void TC57() {
	    RomanNumerals test = new RomanNumerals();
	    int result = test.convertRomanNumToInt("LIX");
	    assertEquals(59, result);
	}

	@Test
	// TC58: CIX = 109
	void TC58() {
	    RomanNumerals test = new RomanNumerals();
	    int result = test.convertRomanNumToInt("CIX");
	    assertEquals(109, result);
	}

	@Test
	// TC59: DIX = 509
	void TC59() {
	    RomanNumerals test = new RomanNumerals();
	    int result = test.convertRomanNumToInt("DIX");
	    assertEquals(509, result);
	}

	@Test
	// TC60: MIX = 1009
	void TC60() {
	    RomanNumerals test = new RomanNumerals();
	    int result = test.convertRomanNumToInt("MIX");
	    assertEquals(1009, result);
	}


	@Test
	// TC61: XVI = 16
	void TC61() {
	    RomanNumerals test = new RomanNumerals();
	    int result = test.convertRomanNumToInt("XVI");
	    assertEquals(16, result);
	}

	@Test
	// TC62: LVI = 56
	void TC62() {
	    RomanNumerals test = new RomanNumerals();
	    int result = test.convertRomanNumToInt("LVI");
	    assertEquals(56, result);
	}

	@Test
	// TC63: CVI = 106
	void TC63() {
	    RomanNumerals test = new RomanNumerals();
	    int result = test.convertRomanNumToInt("CVI");
	    assertEquals(106, result);
	}

	@Test
	// TC64: DVI = 506
	void TC64() {
	    RomanNumerals test = new RomanNumerals();
	    int result = test.convertRomanNumToInt("DVI");
	    assertEquals(506, result);
	}

	@Test
	// TC65: MVI = 1006
	void TC65() {
	    RomanNumerals test = new RomanNumerals();
	    int result = test.convertRomanNumToInt("MVI");
	    assertEquals(1006, result);
	}


	@Test
	// TC66: VII = 7
	void TC66() {
	    RomanNumerals test = new RomanNumerals();
	    int result = test.convertRomanNumToInt("VII");
	    assertEquals(7, result);
	}

	@Test
	// TC67: LII = 52
	void TC67() {
	    RomanNumerals test = new RomanNumerals();
	    int result = test.convertRomanNumToInt("LII");
	    assertEquals(52, result);
	}

	@Test
	// TC68: MII = 1002
	void TC68() {
	    RomanNumerals test = new RomanNumerals();
	    int result = test.convertRomanNumToInt("MII");
	    assertEquals(1002, result);
	}
	
	@Test
	// TC69: XVV = error
	void TC69() {
	    RomanNumerals test = new RomanNumerals();
	    test.convertRomanNumToInt("XVV");
	    fail("Expected invalid input 'XVV'");
	}

	@Test
	// TC70: CVV = error
	void TC70() {
	    RomanNumerals test = new RomanNumerals();
	    test.convertRomanNumToInt("CVV");
	    fail("Expected invalid input 'CVV'");
	}

	@Test
	// TC71: MVV = error
	void TC71() {
	    RomanNumerals test = new RomanNumerals();
	    test.convertRomanNumToInt("MVV");
	    fail("Expected invalid input 'MVV'");
	}

	@Test
	// TC72: LXX = 70
	void TC72() {
	    RomanNumerals test = new RomanNumerals();
	    int result = test.convertRomanNumToInt("LXX");
	    assertEquals(70, result);
	}

	@Test
	// TC73: MXX = 1020
	void TC73() {
	    RomanNumerals test = new RomanNumerals();
	    int result = test.convertRomanNumToInt("MXX");
	    assertEquals(1020, result);
	}

	@Test
	// TC74: CLL = error
	void TC74() {
	    RomanNumerals test = new RomanNumerals();
	    test.convertRomanNumToInt("CLL");
	    fail("Expected invalid input 'CLL'");
	}

	@Test
	// TC75: MLL = error
	void TC75() {
	    RomanNumerals test = new RomanNumerals();
	    test.convertRomanNumToInt("MLL");
	    fail("Expected invalid input 'MLL'");
	}

	@Test
	// TC76: DCC = 700
	void TC76() {
	    RomanNumerals test = new RomanNumerals();
	    int result = test.convertRomanNumToInt("DCC");
	    assertEquals(700, result);
	}

	@Test
	// TC77: MCC = 1200
	void TC77() {
	    RomanNumerals test = new RomanNumerals();
	    int result = test.convertRomanNumToInt("MCC");
	    assertEquals(1200, result);
	}

	@Test
	// TC78: MDD = error
	void TC78() {
	    RomanNumerals test = new RomanNumerals();
	    test.convertRomanNumToInt("MDD");
	    fail("Expected invalid input 'MDD'");
	}


}
