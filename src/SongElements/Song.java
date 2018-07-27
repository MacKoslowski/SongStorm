package SongElements;


public class Song {
	
	
	private String note;
	private String mood;
	private String mode;
	private int bpm = 150;
	private String[] lyrics;
	private String[] chords;
	
	public Song(String note, String mood, String mode, int bpm)
	{
		this.note = note;
		this.mood = mood;
		this.mode = mode;
		this.bpm = bpm;
	}
	
	public String getNote()
	{
		return this.note;
	}
	
	public String getMood()
	{
		return this.mood;
	}
	
	public String getMode()
	{
		return this.mode;
	}
	
	public int getBPM()
	{
		return this.bpm;
	}
	
}
