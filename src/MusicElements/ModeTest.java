package MusicElements;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.HashSet;

import org.junit.jupiter.api.Test;

class ModeTest {

	String[] majr = {"Ionian", "Lydian", "Mixolydian"};
	String[] minr = {"Dorian", "Phrygian", "Aeolian", "Locrian"};
	
	HashSet<String> majorModes = new HashSet<String>(Arrays.asList(majr));
	HashSet<String> minorModes = new HashSet<String>(Arrays.asList(minr));
	
	@Test
	void testRandomMajorMode() {
		String majorMode = Mode.randomMajorMode();
		
		assertTrue(majorModes.contains(majorMode));
	}
	
	@Test
	void testRandomMinorMode() {
		String minorMode = Mode.randomMinorMode();
		
		assertTrue(minorModes.contains(minorMode));
	}

}
