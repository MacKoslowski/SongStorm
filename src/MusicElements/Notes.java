package MusicElements;

public class Notes {

	private static String[] majorNotes = {"A", "A#", "B", "C", "C#", "D", "D#",
	                          "E", "F", "F#", "G", "G#"};
	
	private static String[] minorNotes = {"A", "Bb", "B", "C", "Db", "D", "Eb",
            "E", "F", "Gb", "G", "Ab"};
	
	public static String randomMajorNote()
	{
		int length = majorNotes.length - 1;
		
		Double random = Math.random();
		
		int index = (int) Math.round(length * random);
		
		return majorNotes[index];
	}
	
	public static String randomMinorNote()
	{
		int length = minorNotes.length - 1;
		
		Double random = Math.random();
		
		int index = (int) Math.round(length * random);
		
		return minorNotes[index];
	}
	
	
}
