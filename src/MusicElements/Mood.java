package MusicElements;

public class Mood {
	private static String[] moods = {"Major", "Minor"};
	
	public static String randomMood()
	{
		int length = moods.length - 1;
		
		Double random = Math.random();
		
		int index = (int) Math.round(length * random);
		
		return moods[index];
	}
}
