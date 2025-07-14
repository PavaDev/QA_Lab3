package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.RomanNumerals;

class TestNotRoman {

	@Test
	// TC79: J = error
	void TC79() {
	    RomanNumerals test = new RomanNumerals();
	    assertThrows(IllegalArgumentException.class, () -> {
	        test.convertRomanNumToInt("J");
	    });
	}
	
	@Test
	// TC80: A = error
	void TC80() {
	    RomanNumerals test = new RomanNumerals();
	    assertThrows(IllegalArgumentException.class, () -> {
	        test.convertRomanNumToInt("A");
	    });
	}

	@Test
	// TC81: B = error
	void TC81() {
	    RomanNumerals test = new RomanNumerals();
	    assertThrows(IllegalArgumentException.class, () -> {
	        test.convertRomanNumToInt("B");
	    });
	}

	@Test
	// TC82: E = error
	void TC82() {
	    RomanNumerals test = new RomanNumerals();
	    assertThrows(IllegalArgumentException.class, () -> {
	        test.convertRomanNumToInt("E");
	    });
	}

	@Test
	// TC83: G = error
	void TC83() {
	    RomanNumerals test = new RomanNumerals();
	    assertThrows(IllegalArgumentException.class, () -> {
	        test.convertRomanNumToInt("G");
	    });
	}

	@Test
	// TC84: K = error
	void TC84() {
	    RomanNumerals test = new RomanNumerals();
	    assertThrows(IllegalArgumentException.class, () -> {
	        test.convertRomanNumToInt("K");
	    });
	}

	@Test
	// TC85: AB = error
	void TC85() {
	    RomanNumerals test = new RomanNumerals();
	    assertThrows(IllegalArgumentException.class, () -> {
	        test.convertRomanNumToInt("AB");
	    });
	}

	@Test
	// TC86: XK = error
	void TC86() {
	    RomanNumerals test = new RomanNumerals();
	    assertThrows(IllegalArgumentException.class, () -> {
	        test.convertRomanNumToInt("XK");
	    });
	}

	@Test
	// TC87: "" = error
	void TC87() {
	    RomanNumerals test = new RomanNumerals();
	    test.convertRomanNumToInt("");
	    fail("Invalid input");
	}

	@Test
	// TC88: null = error
	void TC88() {
	    RomanNumerals test = new RomanNumerals();
	    assertThrows(IllegalArgumentException.class, () -> {
	        test.convertRomanNumToInt(null);
	    });
	}

	@Test
	// TC89: i(lower case) = error
	void TC89() {
	    RomanNumerals test = new RomanNumerals();
	    assertThrows(IllegalArgumentException.class, () -> {
	        test.convertRomanNumToInt("i");
	    });
	}


}
