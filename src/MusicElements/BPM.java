package MusicElements;

public class BPM {


	public static int generateBPM()
	{
		int difference = 180 - 90;
		
		double index = difference * Math.random();
		
		int roundIndex = (int) Math.round(index);
		
		return 90 + roundIndex;
		
		
	}
	
	
	public static int generateBPM(int floor, int ceiling)
	{
		int difference = ceiling - floor;
		
		double index = difference * Math.random();
		
		int roundIndex = (int) Math.round(index);
		
		return floor + roundIndex;
		
		
	}
	
}
