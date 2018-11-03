package MusicElements;

public class BPM {


	public static int generateBPM()
	{
		int ceiling = 180;
		int floor = 90;
		
		return generateBPM(ceiling, floor);
		
	}
	
	
	public static int generateBPM(int floor, int ceiling)
	{
		int difference = ceiling - floor;
		
		double index = difference * Math.random();
		
		int roundIndex = (int) Math.floor(index);
		
		return floor + roundIndex;
		
		
	}
	
}
