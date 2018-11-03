package MusicElements;

public class Mode {

	private static String[] majorModes = {"Ionian", "Lydian", "Mixolydian"};
	
	private static String[] minorModes = {"Dorian", "Phrygian", "Aeolian", "Locrian"};
	
	
	private static String randomMode(String[] modeSet) {
		
		int length = modeSet.length - 1;
		
		Double random = Math.random();
		
		int index = (int) Math.round(length * random);
		
		return modeSet[index];

	}
	
	
	public static String randomMajorMode()
	{
		return randomMode(majorModes);
	}
	
	public static String randomMinorMode()
	{
		return randomMode(minorModes);
	}
}
