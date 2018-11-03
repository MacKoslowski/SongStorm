package SongElements;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.HashSet;

import org.junit.jupiter.api.Test;

class SongGeneratorTest {

	String[] majr = {"Ionian", "Lydian", "Mixolydian"};
	String[] minr = {"Dorian", "Phrygian", "Aeolian", "Locrian"};
	String[] majorNotes = {"A", "A#", "B", "C", "C#", "D", "D#",
            "E", "F", "F#", "G", "G#"};
	String[] minorNotes = {"A", "Bb", "B", "C", "Db", "D", "Eb",
			"E", "F", "Gb", "G", "Ab"};
	
	HashSet<String> majorSet = new HashSet<String>(Arrays.asList(majorNotes));
	HashSet<String> minorSet = new HashSet<String>(Arrays.asList(minorNotes));
	HashSet<String> majorModes = new HashSet<String>(Arrays.asList(majr));
	HashSet<String> minorModes = new HashSet<String>(Arrays.asList(minr));
	
	@Test
	void testGenerateSong() {
		Song generatedSong = SongGenerator.generateSong();
		
		int bpm = generatedSong.getBPM();
		String mood = generatedSong.getMood();
		String mode = generatedSong.getMode();
		String note = generatedSong.getNote();
		
		assertTrue(bpm <= 180 && bpm >= 90);
		
		if(mood == "Major") {
			assertTrue(majorSet.contains(note));
			assertTrue(majorModes.contains(mode));
		} else {
			assertTrue(minorSet.contains(note));
			assertTrue(minorModes.contains(mode));
		}
		
	}
	
	@Test
	void testGenerateSongFloorCeiling() {
		
		int floor = 2;
		int ceiling = 4;
		
		Song generatedSong = SongGenerator.generateSong(floor,ceiling);
		
		int bpm = generatedSong.getBPM();
		String mood = generatedSong.getMood();
		String mode = generatedSong.getMode();
		String note = generatedSong.getNote();
		
		assertTrue(bpm <= ceiling && bpm >= floor);
		
		if(mood == "Major") {
			assertTrue(majorSet.contains(note) && majorModes.contains(mode));
		} else {
			assertTrue(minorSet.contains(note) && minorModes.contains(note));
		}
		
	}

}
