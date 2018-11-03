package MusicElements;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BPMTest {

	@Test
	void testGeneratedBPM() {
		int bpm = BPM.generateBPM();
		
		assertTrue(bpm < 180 && bpm >= 90);
	}

	@Test
	void testGeneratedBPMCeilFloor() {
		int bpm = BPM.generateBPM(1,3);
		
		assertTrue(bpm < 3 && bpm >= 1);
	}
	
}
