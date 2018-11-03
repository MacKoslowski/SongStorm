package MusicElements;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.HashSet;

import org.junit.jupiter.api.Test;

class NotesTest {
	String[] majorNotes = {"A", "A#", "B", "C", "C#", "D", "D#",
            "E", "F", "F#", "G", "G#"};

	String[] minorNotes = {"A", "Bb", "B", "C", "Db", "D", "Eb",
			"E", "F", "Gb", "G", "Ab"};
	
	HashSet<String> majorSet = new HashSet<String>(Arrays.asList(majorNotes));
	HashSet<String> minorSet = new HashSet<String>(Arrays.asList(minorNotes));

	
	@Test
	void testMajorNote() {
		String majorNote = Notes.randomMajorNote();
		assertTrue(majorSet.contains(majorNote));
	}
	
	@Test
	void testMinorNote() {
		String minorNote = Notes.randomMinorNote();
		assertTrue(minorSet.contains(minorNote));
	}

}
