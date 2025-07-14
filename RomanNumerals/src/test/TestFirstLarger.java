package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.RomanNumerals;

class TestFirstLarger {


	//---------------------- 1.3 Two digits – the first digit is larger than the second digit ------------------------------------
	
	@Test
	// TC14: VI = 6
	void TC14() {
	    RomanNumerals test = new RomanNumerals();
	    int result = test.convertRomanNumToInt("VI");
	    assertEquals(6, result);
	}

	@Test
	// TC15: XV = 15
	void TC15() {
	    RomanNumerals test = new RomanNumerals();
	    int result = test.convertRomanNumToInt("XV");
	    assertEquals(15, result);
	}

	@Test
	// TC16: XI =11
	void TC16() {
	    RomanNumerals test = new RomanNumerals();
	    int result = test.convertRomanNumToInt("XI");
	    assertEquals(11, result);
	}

	@Test
	// TC17: LX = 60
	void TC17() {
	    RomanNumerals test = new RomanNumerals();
	    int result = test.convertRomanNumToInt("LX");
	    assertEquals(60, result);
	}

	@Test
	// TC18: LV = 55
	void TC18() {
	    RomanNumerals test = new RomanNumerals();
	    int result = test.convertRomanNumToInt("LV");
	    assertEquals(55, result);
	}

	@Test
	// TC19: LI = 51
	void TC19() {
	    RomanNumerals test = new RomanNumerals();
	    int result = test.convertRomanNumToInt("LI");
	    assertEquals(51, result);
	}

	@Test
	// TC20: CL = 150
	void TC20() {
	    RomanNumerals test = new RomanNumerals();
	    int result = test.convertRomanNumToInt("CL");
	    assertEquals(150, result);
	}

	@Test
	// TC21: CX = 110
	void TC21() {
	    RomanNumerals test = new RomanNumerals();
	    int result = test.convertRomanNumToInt("CX");
	    assertEquals(110, result);
	}

	@Test
	// TC22: CV = 105
	void TC22() {
	    RomanNumerals test = new RomanNumerals();
	    int result = test.convertRomanNumToInt("CV");
	    assertEquals(105, result);
	}

	@Test
	// TC23: CI = 101
	void TC23() {
	    RomanNumerals test = new RomanNumerals();
	    int result = test.convertRomanNumToInt("CI");
	    assertEquals(101, result);
	}

	@Test
	// TC24: DC = 600
	void TC24() {
	    RomanNumerals test = new RomanNumerals();
	    int result = test.convertRomanNumToInt("DC");
	    assertEquals(600, result);
	}

	@Test
	// TC25: DL = 550
	void TC25() {
	    RomanNumerals test = new RomanNumerals();
	    int result = test.convertRomanNumToInt("DL");
	    assertEquals(550, result);
	}

	@Test
	// TC26: DX = 510
	void TC26() {
	    RomanNumerals test = new RomanNumerals();
	    int result = test.convertRomanNumToInt("DX");
	    assertEquals(510, result);
	}

	@Test
	// TC27: DV = 505
	void TC27() {
	    RomanNumerals test = new RomanNumerals();
	    int result = test.convertRomanNumToInt("DV");
	    assertEquals(505, result);
	}

	@Test
	// TC28: DI = 501
	void TC28() {
	    RomanNumerals test = new RomanNumerals();
	    int result = test.convertRomanNumToInt("DI");
	    assertEquals(501, result);
	}

	@Test
	// TC29: MD = 1500
	void TC29() {
	    RomanNumerals test = new RomanNumerals();
	    int result = test.convertRomanNumToInt("MD");
	    assertEquals(1500, result);
	}

	@Test
	// TC30: MC = 1100
	void TC30() {
	    RomanNumerals test = new RomanNumerals();
	    int result = test.convertRomanNumToInt("MC");
	    assertEquals(1100, result);
	}

	@Test
	// TC31: ML = 1050
	void TC31() {
	    RomanNumerals test = new RomanNumerals();
	    int result = test.convertRomanNumToInt("ML");
	    assertEquals(1050, result);
	}

	@Test
	// TC32: MX = 1010
	void TC32() {
	    RomanNumerals test = new RomanNumerals();
	    int result = test.convertRomanNumToInt("MX");
	    assertEquals(1010, result);
	}

	@Test
	// TC33: MV = 1005
	void TC33() {
	    RomanNumerals test = new RomanNumerals();
	    int result = test.convertRomanNumToInt("MV");
	    assertEquals(1005, result);
	}

	@Test
	// TC34: MI = 1001
	void TC34() {
	    RomanNumerals test = new RomanNumerals();
	    int result = test.convertRomanNumToInt("MI");
	    assertEquals(1001, result);
	}
	

}
