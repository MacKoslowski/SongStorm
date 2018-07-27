package MusicElements;

public class Mode {

	private static String[] majorModes = {"Ionian", "Lydian", "Mixolydian"};
	
	private static String[] minorModes = {"Dorian", "Phrygian", "Aeolian", "Locrian"};
	
	
	public static String randomMajorMode()
	{
		int length = majorModes.length - 1;
		
		Double random = Math.random();
		
		int index = (int) Math.round(length * random);
		
		return majorModes[index];
	}
	
	public static String randomMinorMode()
	{
		int length = minorModes.length - 1;
		
		Double random = Math.random();
		
		int index = (int) Math.round(length * random);
		
		return minorModes[index];
	}
}
