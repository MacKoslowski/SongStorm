package SongElements;

import MusicElements.*;

public class SongGenerator {

	
	public Song generateSong()
	{
	
		String mood = Mood.randomMood();
		
		String note = "";
		
		String mode = "";
		
		int bpm = BPM.generateBPM();
		
		if(mood.equals("Major"))
		{
			note = Notes.randomMajorNote();
			mode = Mode.randomMajorMode();
			
		} else {
			note = Notes.randomMinorNote();
			mode = Mode.randomMinorMode();
		}
		
		Song newSong = new Song(note, mood, mode, bpm);
		
		return newSong;
	}
	
	public Song generateSong(int floor, int ceiling)
	{
	
		String mood = Mood.randomMood();
		
		String note = "";
		
		String mode = "";
		
		int bpm = BPM.generateBPM(floor, ceiling);
		
		if(mood.equals("Major"))
		{
			note = Notes.randomMajorNote();
			mode = Mode.randomMajorMode();
			
		} else {
			note = Notes.randomMinorNote();
			mode = Mode.randomMinorMode();
		}
		
		Song newSong = new Song(note, mood, mode, bpm);
		
		return newSong;
	}
	
}
