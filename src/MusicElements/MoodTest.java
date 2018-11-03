package MusicElements;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.HashSet;

import org.junit.jupiter.api.Test;


class MoodTest {

	String[] moods = {"Major", "Minor"};
	HashSet<String> moodSet = new HashSet<String>(Arrays.asList(moods));

	@Test
	void test() {
		String randomMood = Mood.randomMood();
		
		assertTrue(moodSet.contains(randomMood));
	}

}
