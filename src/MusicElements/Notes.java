package MusicElements;

public class Notes {

	private static String[] majorNotes = {"A", "A#", "B", "C", "C#", "D", "D#",
	                          "E", "F", "F#", "G", "G#"};
	
	private static String[] minorNotes = {"A", "Bb", "B", "C", "Db", "D", "Eb",
            "E", "F", "Gb", "G", "Ab"};
	
	
	private static String randomNote(String[] noteSet) {
		
		int length = noteSet.length - 1;
		
		Double random = Math.random();
		
		int index = (int) Math.round(length * random);
		
		return noteSet[index];

	}
	
	public static String randomMajorNote()
	{
		return randomNote(majorNotes);
	}
	
	public static String randomMinorNote()
	{
		return randomNote(minorNotes);
	}
	
	
}
